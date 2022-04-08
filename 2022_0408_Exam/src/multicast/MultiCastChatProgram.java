package multicast;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiCastChatProgram extends JFrame {

	// 전역변수지정하기----------

	// 대화명
	String nickname = "꽈배기";

	// 출력창
	JTextArea textArea;
	// 입력창
	JTextField messageField;

	// 그룹명 콤보박스
	JComboBox<String> groupNameComboBox;
	// 콤보박스에 사용될 리스트
	String[] groupNameArray = { "자바개발자", "강아지동영상감상부", "빅데이터개발자", "게임개발자" };
	String[] groupIPArray = { "224.0.0.1", "224.0.0.2", "224.0.0.3", "224.0.0.4" };

	// 그룹목록 출력용 J리스트
	JList<String> jGroupList = new JList<String>();
	List<String> nameList = new ArrayList<>();
	// IP주소 저장용 리스트
	List<String> ipList = new ArrayList<>();

	// 그룹명과 아이피를 저장하는 해시맵
	Map<String, String> groupMap = new HashMap<String, String>() {
		{
			put("자바개발자", "224.0.0.1");
			put("강아지동영상감상부", "224.0.0.2");
			put("빅데이터개발자", "224.0.0.3");
			put("게임개발자", "224.0.0.4");
		}
	};

	// 멀티캐스트 소켓 선언
	MulticastSocket multiCastSocket;

	// 폰트
	Font font = new Font("", Font.BOLD, 15);

	public MultiCastChatProgram() {

		super("ICT톡");

		// 출력창 초기화 / 출력한 창이 나오는 부분
		initDisplay();
		// 입력창 초기화 / 입력창이 나오는 부분
		initInput();
		// 그룹목록(우측) 초기화 / 참가자목록이 나오는부분
		initGroupList();
		// 키 이벤트 초기화 / / 어떤키를 눌렀을때 업로드가 될지에 대한 부분
		initKeyEvent();
		// 소켓 초기화 / 네트워크 소켓에 대한 부분
		initSocket();

		// 위치 정하기
		this.setLocation(200, 100);
		// 크기 정하기
		pack();
		// 보여주기
		this.setVisible(true);
		// 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void initDisplay() {
		textArea = new JTextArea();
		JScrollPane jScrollPane = new JScrollPane(textArea);
		jScrollPane.setPreferredSize(new Dimension(400, 300));
		this.add(jScrollPane, "Center");

		textArea.setEditable(false);
		textArea.setFont(font);

	}

	private void initInput() {
		JPanel panel = new JPanel(new GridLayout(3, 1));
		// 1번째줄: 콤보박스
		JPanel panel1 = new JPanel(new GridLayout(1, 1));
		// 콤보박스에 어레이값을 집어넣는다
		groupNameComboBox = new JComboBox<String>(groupNameArray);
		// 행렬에 선택된 이름에 따라 아이피주소를 변경한다.
		/*
		 * updateIPAddress(); // groupName콤보박스의 액션리스너가 대기하고 있다가 부서명이 선택될때마다 // 아이피 주소를
		 * 변경하는 메서드를 작동시킨다. groupNameComboBox.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { updateIPAddress(); }
		 * });
		 */
		panel1.add(groupNameComboBox);

		// 2번째줄: 가입,탈퇴버튼
		JPanel panel2 = new JPanel(new GridLayout(1, 3));
		JButton joinButton = new JButton("입장");
		JButton leaveButton = new JButton("퇴장");
		JButton sendAll = new JButton("전체전송/alt");
		panel2.add(joinButton);
		panel2.add(leaveButton);
		panel2.add(sendAll);

		joinButton.addActionListener(e -> {
			onJoinButton();
		});

		leaveButton.addActionListener(e -> {
			onLeaveButton();
		});

		sendAll.addActionListener(e -> {
			onSendAllButton();
		});

		// 3번째줄: 메시지창
		messageField = new JTextField();
		messageField.setFont(font);

		// 패널에 내용 집어넣고 위치 정하기
		panel.add(panel1);
		panel.add(panel2);
		panel.add(messageField);
		this.add(panel, "South");

	}

	private void onSendAllButton() {
		// 입력 메시지 읽어오기, 공백 제거하기
		String message = messageField.getText().trim();

		if (message.isEmpty()) {
			JOptionPane.showMessageDialog(this, "메시지를 입력하세요");
			messageField.setText(""); // 값 비우기
			return;
		}

		// 네트워크로 전송
		String ip = "255.255.255.255";
		// data와 주소(InetAddress)를 묶어서 DatagramPacket으로 보내기
		try {
			InetAddress ia = InetAddress.getByName(ip);
			// 전송데이터 포장: nickname#message
			String sendData = String.format("%s#%s", nickname, message);
			byte[] sentBytes = sendData.getBytes();
			DatagramPacket dp = new DatagramPacket(sentBytes, sentBytes.length, ia, 5000);

			// 소켓을 통해서 전송
			multiCastSocket.send(dp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 입력 후 메시지 지우기
		messageField.setText("");

		// 캐럿포지션 설정하기
		int position = messageField.getDocument().getLength();
		messageField.setCaretPosition(position);

	}

	private void onJoinButton() {
		String groupName = (String) groupNameComboBox.getSelectedItem();
		String ip = groupMap.get(groupName);

		if (nameList.contains(groupName)) {
			JOptionPane.showMessageDialog(this, "이미 가입된 주소입니다");
			return;
		}

		try {
			// 가입성공시
			InetAddress iNetAddress = InetAddress.getByName(ip);
			multiCastSocket.joinGroup(iNetAddress);

			nameList.add((String) groupNameComboBox.getSelectedItem());
			updateGroupList();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void onLeaveButton() {
		try {
			// 그룹리스트에서 선택된값
			String groupName = jGroupList.getSelectedValue();
			// 탈퇴하기
			if (groupName == null) {
				JOptionPane.showMessageDialog(this, "퇴장할 그룹주소를 선택하세요");
				return;
			}

			int result = JOptionPane.showConfirmDialog(this, "퇴장하시겠습니까?", "퇴장하기", JOptionPane.YES_NO_OPTION);
			if (result != 0)
				return;
			String ip = groupMap.get(groupName);
			// 네트워크상 ip 찾기
			InetAddress ia = InetAddress.getByName(ip);
			// 가입된 주소를 arrayList에서 삭제한다.
			nameList.remove(groupName);
			multiCastSocket.leaveGroup(ia);
			// 오른쪽JList창 갱신
			updateGroupList();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void updateGroupList() {
		String[] groupArray = new String[nameList.size()];
		nameList.toArray(groupArray);
		jGroupList.setListData(groupArray);

	}

	private void initGroupList() {
		jGroupList.setFont(font);
		JScrollPane scrollPane = new JScrollPane(jGroupList);
		scrollPane.setPreferredSize(new Dimension(150, 0));
		this.add(scrollPane, "East");

		// JList에 데이터 넣기
		String[] ipArray = { "" };
		jGroupList.setListData(ipArray);

	}

	private void initKeyEvent() {
		messageField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER) {
					sendMessage();
				} else if (key == KeyEvent.VK_ALT) {
					onSendAllButton();
				}
			}
		});

	}

	protected void sendMessage() {
		// 입력 메시지 읽어오기, 공백 제거하기
		String message = messageField.getText().trim();
		// 비어있는지 확인하기
		if (nameList.isEmpty()) {
			JOptionPane.showMessageDialog(this, "입장 후 메시지를 보낼 수 있습니다");
			messageField.setText(""); // 값 비우기
			return;
		}
		if (message.isEmpty()) {
			JOptionPane.showMessageDialog(this, "메시지를 입력하세요");
			messageField.setText(""); // 값 비우기
			return;
		}

		// 네트워크로 전송
		String ip = groupMap.get(groupNameComboBox.getSelectedItem().toString());
		// data와 주소(InetAddress)를 묶어서 DatagramPacket으로 보내기
		try {
			InetAddress ia = InetAddress.getByName(ip);
			// 전송데이터 포장: nickname#message
			String sendData = String.format("%s#%s", nickname, message);
			byte[] sentBytes = sendData.getBytes();
			DatagramPacket dp = new DatagramPacket(sentBytes, sentBytes.length, ia, 5000);

			// 소켓을 통해서 전송
			multiCastSocket.send(dp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 입력 후 메시지 지우기
		messageField.setText("");

		// 캐럿포지션 설정하기
		int position = messageField.getDocument().getLength();
		messageField.setCaretPosition(position);

	}

	private void initSocket() {

		// 멀티캐스트소켓을 만들어 서버값 지정
		try {
			multiCastSocket = new MulticastSocket(5000);
			// 해당 네트워크의 데이터를 수신하는 스레드 생성하기
			new Thread() {
				public void run() {
					while (true) {
						receiveMessage();
					}
				};
			}.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	protected void receiveMessage() {
		try {
			// datagramPacket에 들어갈 데이터를 넣을 버퍼 지정하기
			byte[] readBuffer = new byte[512];
			// 포장하기
			DatagramPacket packet = new DatagramPacket(readBuffer, readBuffer.length);
			// 소켓을 통해서 수신
			multiCastSocket.receive(packet);
			// 패킷의 데이터를 String 객체로 변환하기
			String readData = new String(packet.getData()).trim();
			// #을 기준으로 어레이로 분리하기
			String[] readDataArray = readData.split("#");
			// 출력메시지를 생성하기
			String displayMessage = String.format("%s님: %s\r\n", readDataArray[0], readDataArray[1]);
			textArea.append(displayMessage);

			// 캐럿 포지션 설정하기
			int position = textArea.getDocument().getLength();
			textArea.setCaretPosition(position);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MultiCastChatProgram();

	}

}

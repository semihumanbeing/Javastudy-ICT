package mymain.multicast;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class MultiCastChat extends JFrame {

	// 출력창
	JTextArea textArea;
	// 입력창
	JTextField messageField;
	// 키 이벤트 초기화

	// 주소창
	JTextField addressField;
	// 그룹명
	JComboBox<String> groupNameField;

	// 대화명
	String nickName = "꽈배기";

	// DatagramSoket <- uni-cast / broadcast
	// ㄴMulticastSocket 선언 <- multicast
	MulticastSocket multiCastSocket;

	Font font = new Font("", Font.BOLD, 16);

	// multicast 그룹에 가입된 주소
	List<String> groupList = new ArrayList<String>();
	// 목록 출력용 컴포넌트
	JList<String> jListGroup = new JList<String>();

	Map<String, String> departmentMap = new HashMap<String, String>() {
		{
			put("총무부", "224.0.0.1");
			put("인사부", "224.0.0.2");
			put("경리부", "224.0.0.3");
			put("영업부", "224.0.0.4");
			put("강아지동영상감상부", "224.0.0.5");
			put("전체전송", "255.255.255.255");
		}
	};

	String[] groupNameArray = { "총무부", "인사부", "경리부", "영업부", "강아지동영상감상부", "전체전송", };
	String[] groupIPArray = { "224.0.0.1", "224.0.0.2", "224.0.0.3", "224.0.0.4", "224.0.0.5", "255.255.255.255", };
	// String[] groupNameArray = (String[]) departmentMap.keySet().toArray();
	// String [] groupIPArray = (String[]) departmentMap.values().toArray();

	public MultiCastChat() {

		super("멀티캐스트 연습");

		// 출력창 초기화
		initDisplay();

		// 입력창 초기화
		initInput();

		// 그룹목록창 초기화
		initGroupList();

		// 키이벤트 초기화
		initKeyEvent();

		// 소켓 초기화
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

	private void initGroupList() {
		jListGroup.setFont(font);
		JScrollPane scrollPane = new JScrollPane(jListGroup);
		scrollPane.setPreferredSize(new Dimension(150, 0));
		this.add(scrollPane, "East");

		// JList 에 데이터 넣기
		String[] ipArray = { "" };
		jListGroup.setListData(ipArray);

	}

	private void initSocket() {
		try {
			multiCastSocket = new MulticastSocket(5000);

			// 별도의 쓰레드 생성
			new Thread() {
				public void run() {
					// 데이터 수신
					while (true) {
						readMessage();
					}
				};
			}.start();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	protected void readMessage() {
		try {
			// 읽어온 데이터를 넣을 버퍼를 지정
			byte[] readBuffer = new byte[512];
			DatagramPacket dp = new DatagramPacket(readBuffer, readBuffer.length);
			// 소켓을 통해서 수신
			multiCastSocket.receive(dp); // 메시지가 올때까지 대기
			// 전송지 주소
			InetAddress youria = dp.getAddress();
			// 읽어온 데이터 가져와서 String 객체로 생성
			String readData = new String(dp.getData()).trim();
			// #을 기준으로 분리
			String[] readDataArray = readData.split("#");
			// 출력메시지 생성
			String displayMessage = String.format("%s님: %s\r\n", readDataArray[0], readDataArray[1]);
			textArea.append(displayMessage);
			int position = textArea.getDocument().getLength();
			textArea.setCaretPosition(position);
			System.out.printf("[%s]%s", youria.getHostAddress(), displayMessage);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void initKeyEvent() {
		messageField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});

	}

	protected void sendMessage() {
		// 입력 메시지 읽어오기, 공백 제거하기
		String message = messageField.getText().trim();
		// 비어있는지 확인하기
		if (message.isEmpty()) {
			JOptionPane.showMessageDialog(this, "메시지를 입력하세요");
			messageField.setText(""); // 값 비우기
			return;
		}

		// 네트워크로 전송
		String ip = addressField.getText().trim();
		if (ip.isEmpty()) {
			JOptionPane.showMessageDialog(this, "주소를 입력하세요");
			addressField.setText(""); // 값 비우기
			return;
		}

		// data와 주소(InetAddress)를 묶어서 DatagramPacket으로 보내기
		try {
			InetAddress ia = InetAddress.getByName(ip);
			// 전송데이터 포장: nickname#message
			String sendData = String.format("%s#%s", nickName, message);
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

		// 전체 문서의 길이 구하기
		int position = messageField.getDocument().getLength();
		messageField.setCaretPosition(position);

	}

	private void initInput() {
		JPanel panel = new JPanel(new GridLayout(3, 1));
		// 1번째 줄: 콤보박스
		// addressField = new JTextField("255.255.255.255"); // global broadcast 주소
		JPanel panel0 = new JPanel(new GridLayout(1, 1));
		// 콤보박스는 어레이를 통해서 선택된 객체가 groupNameField로 이동한다.
		// (콤보박스는 어레이만 받을수 있기 때문에)
		groupNameField = new JComboBox<String>(groupNameArray);
		// 값이 선택되었을때 해당하는 IP를 선택하는 메서드가 작동된다.
		updateShownIPAddress();
		// groupNameField의 actionListener가 대기하고 있다가 부서명이 선택되면 메서드가 작동된다.
		groupNameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateShownIPAddress();
			}
		});

		panel0.add(groupNameField);

		// 2번째 줄: 가입, 탈퇴 버튼
		JPanel panel1 = new JPanel(new GridLayout(1, 2));
		JButton joinButton = new JButton("가입");
		JButton deleteAccountButton = new JButton("탈퇴");

		panel1.add(joinButton);
		panel1.add(deleteAccountButton);
		joinButton.setFont(font);
		deleteAccountButton.setFont(font);

		// 3번째 줄: 메시지창
		messageField = new JTextField();
		messageField.setFont(font);

		panel.add(panel0);
		panel.add(panel1);
		panel.add(messageField);

		this.add(panel, "South");

		// 버튼이벤트 등록하기
		joinButton.addActionListener(e -> {
			onJoinButton(); // on이 붙은 메서드는 주로 callback메서드이다. (이벤트에서 자동호출)
		});

		deleteAccountButton.addActionListener(e -> {
			onDeleteAccountButton();
		});
	}

	private void updateShownIPAddress() {
		// 콤보박스에서 선택하면 해당하는 IP value를 추출한다.
		String currentGroup = (String) groupNameField.getSelectedItem();
		if (addressField == null) {
			addressField = new JTextField(departmentMap.get(currentGroup)); // multicast 주소
		} else {
			addressField.setText(departmentMap.get(currentGroup));
			addressField.update(getGraphics());
		}
		addressField.setFont(font);
	}

	@SuppressWarnings("deprecation")
	protected void onJoinButton() {
		try {
			// System.out.println("가입하기");
			// 1. 주소 읽어오기
			String groupName = (String) groupNameField.getSelectedItem();
			String ip = addressField.getText().trim();

			// 가입여부 확인하기
			if (groupList.contains(groupName)) {
				JOptionPane.showMessageDialog(this, "이미 가입된 주소입니다.");
				return;
			}
			// 네트워크상 가입성공
			InetAddress ia = InetAddress.getByName(ip);
			multiCastSocket.joinGroup(ia);
			// 가입된 주소를 arrayList에 넣는다.
			groupList.add((String) groupNameField.getSelectedItem());// TODO change to group name, not IP
			// 오른쪽JList창 갱신
			updateGroupList();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void updateGroupList() {
		// ArrayList -> Array로 추출
		String[] groupArray = new String[groupList.size()];
		groupList.toArray(groupArray);
		jListGroup.setListData(groupArray);

	}

	protected void onDeleteAccountButton() {
		// System.out.println("탈퇴하기");
		// 1. 주소 읽어오기
		try {
			// 그룹리스트에서 선택된값
			String groupName = jListGroup.getSelectedValue();
			// 탈퇴하기
			if (groupName == null) {
				JOptionPane.showMessageDialog(this, "탈퇴할 그룹주소를 선택하세요");
				return;
			}

			int result = JOptionPane.showConfirmDialog(this, "탈퇴하시겠습니까?", "그룹탈퇴", JOptionPane.YES_NO_OPTION);
			if (result != 0)
				return;
			String ip = departmentMap.get(groupName);
			// 네트워크상 가입성공
			InetAddress ia = InetAddress.getByName(ip);
			// 가입된 주소를 arrayList에서 삭제한다.
			groupList.remove(groupName);
			multiCastSocket.leaveGroup(ia);
			// 오른쪽JList창 갱신
			updateGroupList();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void initDisplay() {
		textArea = new JTextArea();
		JScrollPane jScrollPane = new JScrollPane(textArea);
		jScrollPane.setPreferredSize(new Dimension(400, 400));
		this.add(jScrollPane, "Center");

		// textArea 읽기전용으로 만들기 (편집x)
		textArea.setEditable(false);
		textArea.setFont(font);
	}

	public static void main(String[] args) {
		new MultiCastChat();

	}

}

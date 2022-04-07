package mymain.multichat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiClient extends JFrame {

	// 모니터창
	JTextArea displayTextField;
	// 메시지창
	JTextField messageField;
	// 접속자목록
	JList<String> userList;

	Font font = new Font("", Font.BOLD, 16);

	// 연결버튼
	JButton connectButton;
	// 연결상태를 확인하는 버튼
	boolean connectCheck = false;
	
	// 네트워크
	Socket client;
	
	BufferedReader buffReader;
	String nickname = "꽈배기";
	

	public MultiClient() {

		super("멀티서버");

		// 출력창
		initDisplay();
		// 입력창
		initMessage();
		// 접속자목록
		initUserList();

		// 위치 정하기
		this.setLocation(200, 100);
		// 크기 정하기
		pack();
		// 보여주기
		this.setVisible(true);
		// 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void initMessage() {
		JPanel panel = new JPanel(new BorderLayout());

		messageField = new JTextField();
		connectButton = new JButton("연결");
		connectButton.setPreferredSize(new Dimension(120, 0));

		panel.add(messageField, "Center");
		panel.add(connectButton, "East");

		this.add(panel, "South");

		connectButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// callback메서드
				onConnectButton();
			}
		});

	}

	protected void onConnectButton() {
		connectCheck = !connectCheck;

		if (connectCheck) { // 연결
			try {
				client = new Socket("localhost", 8000);
				//첫번째 입장 메시지 전송
				String sentMessage = String.format("IN#%s\n", nickname);
				client.getOutputStream().write(sentMessage.getBytes());
				//메시지 수신대기
				readMessage();
				
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "연결실패");
				connectCheck = false;
				return;
				
			}
		} else { // 끊기
			
			try {
				//소켓을 닫는다.
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// 버튼의 캡션 변경
		connectButton.setText(connectCheck ? "끊기" : "연결");
	}

	private void readMessage() {
		InputStream input;
		try {
			input = client.getInputStream();
			InputStreamReader inputReader = new InputStreamReader(input);
			buffReader = new BufferedReader(inputReader);
			
			//데이터 수신대기용 스레드 생성
			new Thread() {
				public void run() {
					while(true) {
						try {
							String readData = buffReader.readLine();
							if(readData==null) {
								break;
								// 사용자 프로토콜 종류에 따라 코드 진행
							}
							
						} catch (IOException e) {
							break;
						}
					}
					//상대방 소켓이 끊긴경우에 대한 코드
					
				}
			}.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void displayMessage(String message) { // 채팅 기능
		displayTextField.append(message);
		displayTextField.append("\r\n");
		// 출력후 캐럿포지션을 맨끝으로 변경하기
		int position = displayTextField.getDocument().getLength();
		displayTextField.setCaretPosition(position);
	}

	private void initDisplay() { // 채팅 내용이 보이는 창
		displayTextField = new JTextArea();
		displayTextField.setFont(font);
		JScrollPane scrollPane = new JScrollPane(displayTextField);
		scrollPane.setPreferredSize(new Dimension(400, 400));
		this.add(scrollPane, "Center");

		// 읽기전용
		displayTextField.setEditable(false);

	}

	private void initUserList() {
		userList = new JList<String>();
		JScrollPane scrollPane = new JScrollPane(userList);
		scrollPane.setPreferredSize(new Dimension(120, 0));
		this.add(scrollPane, "East");
	}

	public static void main(String[] args) {
		new MultiClient();

	}
	
	

}

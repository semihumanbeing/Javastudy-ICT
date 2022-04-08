package mymain.multichat;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiServer extends JFrame {

	// 모니터창
	JTextArea displayTextField;
	// 접속자수
	JTextField userCountTextField;
	// 접속자목록
	JList<String> userJList;

	Font font = new Font("", Font.BOLD, 16);
	
	
	// 서버
	ServerSocket server;

	// 스레드 동기화 관리객체
	Object syncObject = new Object();
	
	// 자소켓을 관리할 ArrayList (initServer)
	List<ReadThread> socketList = new ArrayList<ReadThread>();

	// 유저관리객체
	List<String> userList = new ArrayList<String>();

	public MultiServer() {

		super("멀티서버");
		// 출력창
		initDisplay();
		// 접속자수
		initUserCount();
		// 접속자목록
		initUserList();
		// 서버초기화
		initServer();

		// 위치 정하기
		this.setLocation(200, 100);
		// 크기 정하기
		pack();
		// 보여주기
		this.setVisible(true);
		// 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void initServer() {
		try {
			server = new ServerSocket(8000);
			displayMessage("대기중");
			// 별도 스레드 생성 - 접속 대기 용도
			// 익명클래스
			new Thread() {
				public void run() {
					while (true) {
						try {
							Socket child = server.accept();
							
							synchronized (syncObject) {
							// 접속과정
							ReadThread readThread = new ReadThread(child);
							readThread.start();
							
							// 자소켓을 포함한 쓰레드 객체를 arraylist에 추가하기
							socketList.add(readThread);
							
							// 접속자수 출력
							displayUserCount();
							}
								

						} catch (IOException e) {
							e.printStackTrace();
						}
					} // while
				}// run
			}.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void displayUserCount() {
		userCountTextField.setText(socketList.size() + "");

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

	private void initUserCount() {
		JPanel panel = new JPanel(new GridLayout(1, 3));

		JLabel userLabel = new JLabel("접속자수", JLabel.RIGHT);
		userLabel.setFont(font);

		userCountTextField = new JTextField("0");
		userCountTextField.setFont(font);
		userCountTextField.setHorizontalAlignment(JTextField.CENTER);

		JLabel userCountLabel = new JLabel("명");
		userCountLabel.setFont(font);

		panel.add(userLabel);
		panel.add(userCountTextField);
		panel.add(userCountLabel);

		this.add(panel, "South");
	}

	private void initUserList() {
		userJList = new JList<String>();
		JScrollPane scrollPane = new JScrollPane(userJList);
		scrollPane.setPreferredSize(new Dimension(120, 0));
		this.add(scrollPane, "East");
	}

	public static void main(String[] args) {
		new MultiServer();

	}

	// MultiServer 내부클래스 선언영역----------------------------------------------
	class ReadThread extends Thread {
		Socket child;
		BufferedReader buffReader;

		public ReadThread(Socket child) {
			super();
			this.child = child;
			try {
				InputStream input = child.getInputStream();
				InputStreamReader inputReader = new InputStreamReader(input);
				buffReader = new BufferedReader(inputReader);

				OutputStream output = child.getOutputStream();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// child 소켓의 수신대기용도 이용
		public void run() {
			while (true) {
				// 1줄단위로 수신
				try {
					String readData = buffReader.readLine();
					if (readData == null) {
						// System.out.println("정상종료");
						break; // 정상종료시 close

					}

					// 서버 모니터링...
					displayMessage(readData);

					// 메시지 분류
					String[] messageArray = readData.split("#");
					
					if (messageArray[0].equals("IN")) { // 입장일때
						synchronized (syncObject) {
							
						userList.add(messageArray[1]);
						displayUserList();
						sendMessageToAll(readData + "\n");
						}
						
					} else {
						// 메시지를 접속된 모든 사용자에게 전송
						synchronized (syncObject) {
							
						sendMessageToAll(readData + "\n");
						}
						/*
						 * // 현재 접속자 목록을 모든 사용자에게 전송 sendUserListToAll();
						 */
					}

				} catch (IOException e) {
					// System.out.println("비정상종료");
					break; // 비정상종료시 (프로그램 강제 종료시)
				}
			}
			
			synchronized (syncObject) {
				
			// 소켓 종료시 현재 쓰레드를 socketList로부터 제거해야한다.
			int index = socketList.indexOf(this);
			//퇴장한 사용자의 닉네임 구하기
			String outMember = userList.get(index);
			socketList.remove(index);
			displayUserCount(); // 인원수 갱신정보출력
			
			userList.remove(index);
			displayUserList();
			
			//퇴장정보 전송
			String message = String.format("OUT#%s\n", outMember);
			sendMessageToAll(message);
			
			//현재 접속자 목록을 모든 사용자에게 전송
			sendUserListToAll();
			
			}
		}
	}
	// ------------------------------------------------------------------------

	public void displayUserList() {
		String[] userArray = new String[userList.size()];
		userList.toArray(userArray);
		userJList.setListData(userArray);
	}

	public void sendUserListToAll() {
		StringBuffer stringBuffer = new StringBuffer("LIST");
		for(String nickname : userList) {
			stringBuffer.append("#");
			stringBuffer.append(nickname);
			
		}
		sendMessageToAll(stringBuffer.toString()+"\n");
	}

	public void sendMessageToAll(String message) {
		for(int i =0; i<socketList.size();i++) {
			try {
				ReadThread readThread = socketList.get(i);
				readThread.child.getOutputStream().write(message.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

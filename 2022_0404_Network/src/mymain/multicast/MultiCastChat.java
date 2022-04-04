package mymain.multicast;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiCastChat extends JFrame {
	
	//출력창
	JTextArea textArea;
	//입력창
	JTextField messageField;
	//키 이벤트 초기화
	
	//주소창
	JTextField addressField;
	//대화명
	String nickName = "꽈배기";
	
	Font font = new Font("", Font.BOLD, 16);
	
	public MultiCastChat() {

		super("멀티캐스트 연습");
		
		// 출력창 초기화
		initDisplay();
		
		// 입력창 초기화
		initInput();
		
		initKeyEvent();
		

		//위치 정하기
		this.setLocation(200, 100);
		//크기 정하기
		pack();
		//보여주기
		this.setVisible(true);
		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void initKeyEvent() {
		messageField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if(key == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});
		
	}

	protected void sendMessage() {
		//입력 메시지 읽어오기, 공백 제거하기
		String message = messageField.getText().trim();
		//비어있는지 확인하기
		if(message.isEmpty()) {
			JOptionPane.showMessageDialog(this, "메시지를 입력하세요");
			messageField.setText(""); // 값 비우기
			return;
		}
		
		//출력
		String displayMessage = String.format("%s 님: %s\r\n", nickName, message);
		textArea.append(displayMessage);
		messageField.setText("");
		
		//전체 문서의 길이 구하기
		int position = messageField.getDocument().getLength();
		messageField.setCaretPosition(position);
		
	}

	private void initInput() {
		JPanel panel = new JPanel(new GridLayout(3,1));
		
		// 1번째 줄: 주소
		addressField = new JTextField("255,255,255,255"); // global broadcast 주소
		addressField.setFont(font);
		// 2번째 줄: 가입, 탈퇴 버튼
		JPanel panel1 = new JPanel(new GridLayout(1,2));
		JButton joinButton = new JButton("가입");
		JButton deleteAccountButton = new JButton("탈퇴");
		
		panel1.add(joinButton);
		panel1.add(deleteAccountButton);
		joinButton.setFont(font);
		deleteAccountButton.setFont(font);
		
		// 3번째 줄: 메시지창
		messageField = new JTextField();
		messageField.setFont(font);
		
		panel.add(addressField);
		panel.add(panel1);
		panel.add(messageField);
		
		this.add(panel, "South");
	}

	private void initDisplay() {
		textArea = new JTextArea();
		JScrollPane jsp = new JScrollPane(textArea);
		jsp.setPreferredSize(new Dimension(400,400));
		this.add(jsp,"Center");
		
		// textArea 읽기전용으로 만들기 (편집x)
		textArea.setEditable(false);
		textArea.setFont(font);
	}

	public static void main(String[] args) {
		new MultiCastChat();

	}

}

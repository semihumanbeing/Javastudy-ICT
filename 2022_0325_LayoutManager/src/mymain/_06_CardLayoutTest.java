package mymain;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _06_CardLayoutTest extends JFrame {

	JPanel mainPanel;
	CardLayout card;
	
	
	public _06_CardLayoutTest() {

		super("CardLayout 연습");
		
		// 메뉴 생성
		init_menubar();
		//카드 레이아웃초기화
		init_cardLayout();
		//패널 만들기
		
		
		
		//------------------------------------------------------
		

		//위치 정하기
		this.setLocation(200, 100);
		//크기정하기
		this.setSize(400, 400);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	private void init_cardLayout() {
		card = new CardLayout();
		mainPanel = new JPanel(card); // cardlayout을 JPanel에 반영
		
		mainPanel.add(new Screen1(),"s1");
		mainPanel.add(new Screen2(),"s2");
		mainPanel.add(new Screen3(),"s3");
		
		this.add(mainPanel,"Center");
		
	}

	private void init_menubar() {
		JPanel p = new JPanel(new GridLayout(1,3));
		//패널에 버튼 넣기
		JButton btn1 = new JButton("화면1");
		JButton btn2 = new JButton("화면2");
		JButton btn3 = new JButton("화면3");
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		//패널 어디에 무엇이 들어가는지 정하기
		this.add(p,"North");
		
		//버튼 이벤트 등록
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(mainPanel, "s1");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(mainPanel, "s2");
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//card.show(mainPanel, "s3");
				card.last(mainPanel);
			}
		});
	}

	public static void main(String[] args) {
		new _06_CardLayoutTest();

	}

}

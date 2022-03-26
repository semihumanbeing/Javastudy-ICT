package mymain;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// 3가지 방식으로 class호출하기

public class _04_Hello_Nation extends JFrame {

	// Member로써의 내부 클래스 선언 (이 클래스 안에서만 사용하기 위한 용도)
	class KorButtonEventObject implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// System.out.println(new Date(e.getWhen())); <- 시간이 출력됨
			JOptionPane.showMessageDialog(_04_Hello_Nation.this, "안녕하세요");

		}

	}

	public _04_Hello_Nation() {

		super("각나라 인삿말");
		// 레이아웃 변경하기
		GridLayout gl = new GridLayout(6, 1);
		this.setLayout(gl);

		// 버튼 만들기
		JButton btnKor = new JButton("한국어 인삿말");
		JButton btnEng = new JButton("영어 인삿말");
		JButton btnJpn = new JButton("일본어 인삿말");
		JButton btnChn = new JButton("중국어 인삿말");
		JButton btnGer = new JButton("독일어 인삿말");
		JButton btnFra = new JButton("프랑스어 인삿말");

		this.add(btnKor);
		this.add(btnEng);
		this.add(btnJpn);
		this.add(btnChn);
		this.add(btnGer);
		this.add(btnFra);

		// 버튼 눌렀을 때 이벤트 등록하기
		// Event sort.addXXXListener (처리 객체가 갖고있는 interface)
		KorButtonEventObject listener = new KorButtonEventObject();
		btnKor.addActionListener(listener);

		// 영어인삿말
		class EngButtonEventObject implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(_04_Hello_Nation.this, "hello");
				JOptionPane.showMessageDialog(_04_Hello_Nation.this, "Hello");
			}

		}
		// btnEng버튼이 클릭되면 EngButtonEventObject내의 actionPerformed가 호출된다.
		btnEng.addActionListener(new EngButtonEventObject());

		// 일본어 인삿말
		// 익명 listener기능을 사용함
		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(_04_Hello_Nation.this, "こんにちは");

			}
		};
		btnJpn.addActionListener(listener2);

		// 중국어 인삿말
		btnChn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(_04_Hello_Nation.this, "니하오");
			}
		});

		// lambda 식 사용하기
		//독일어 인삿말
		btnGer.addActionListener(e->JOptionPane.showMessageDialog(_04_Hello_Nation.this, "Guten Tag"));
		
		btnFra.addActionListener(e-> JOptionPane.showMessageDialog(_04_Hello_Nation.this, "Bonjour"));

		// ----------------------------------------------------------------------------------

		// 위치 정하기
		this.setLocation(200, 100);
		// 크기정하기
		this.setSize(400, 400);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new _04_Hello_Nation();

	}

}

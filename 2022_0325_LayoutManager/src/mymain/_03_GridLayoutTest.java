package mymain;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _03_GridLayoutTest extends JFrame {

	public _03_GridLayoutTest() {

		super("GridLayout 연습");

		// Layout 변경
		GridLayout gl = new GridLayout(6, 4); // 열의 숫자가 정해져 있어도 행의 숫자를 기준으로 세팅이 된다.
		this.setLayout(gl);

		for (int i = 0; i <= 24; i++) {
			String title = String.format("%02d", i);
			JButton jbt = new JButton(title);
			this.add(jbt);
		}

			// 위치 정하기
			this.setLocation(200, 100);
		// 크기정하기
		this.setSize(400, 400);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new _03_GridLayoutTest();

	}

}

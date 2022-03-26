package mymain;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _02_FlowLayoutTest extends JFrame {

	public _02_FlowLayoutTest() {

		super("Flow Layout 연습");
		
		// JFrame은 원래 BorderLayout -> FlowLayout 으로 변경
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		this.setLayout(fl);
		
		for(int i=0;i<=10;i++) {
			String title = String.format("Button %02d", i);
			JButton jbt1 = new JButton(title);
			this.add(jbt1);
		}
		
		//위치 정하기
		this.setLocation(200, 100);
		//크기정하기
		this.setSize(400, 400);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new _02_FlowLayoutTest();

	}

}

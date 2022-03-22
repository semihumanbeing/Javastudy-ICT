package mymain;

//import java.awt.Frame;
//AWT = Abstract Window Toolkit
import javax.swing.JFrame;
// Swing 

public class MyWindow extends JFrame {

	public MyWindow() {
		// constructor 메서드 - 초기화 역할
		
		// 타이틀
		super("My window");
		
		super.setTitle("안녕하세요");
		// 위치
		super.setLocation(100, 100);
		// 크기
		super.setSize(400, 300);
		// 보여주기
		super.setVisible(true);
		// 종료기능
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyWindow();

	}

}

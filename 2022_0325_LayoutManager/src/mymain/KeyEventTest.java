package mymain;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyEventTest extends JFrame {
	int screenWidth, screenHeight;
	int windowWidth, windowHeight;

	public KeyEventTest() {

		super("key event 연습");

		// 키 이벤트 초기화
		// init_KeyEvent();

		init_KeyEvent2();

		// ---------------------------------------------------------
		// 위치 정하기
		this.setLocation(200, 100);
		// 크기정하기
		windowWidth = 400;
		windowHeight = 300;
		this.setSize(windowWidth, windowHeight);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_KeyEvent2() {
		/*
		 * class myKeyAdapter extends KeyAdapter{
		 * 
		 * @Override public void keyPressed(KeyEvent e) { // TODO Auto-generated method
		 * stub super.keyPressed(e); }
		 * 
		 * }
		 */

		// 익명 객체 생성
		// listener 는 전체 인터페이스를 다 사용해야 하지만
		// adapter는 추상클래스이기 때문에 필요한 정보만 override해서 쓰면된다.
		KeyAdapter ka = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// super.keyPressed(e);
				// 눌린 키 정보 얻어오기
				int key = e.getKeyCode();

				// 현재윈도우 위치구하기
				Point point = KeyEventTest.this.getLocation();
				System.out.printf("%d %d\n", point.x, point.y);

				// 화면해상도 구하기
				Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
				screenWidth = d.width;
				screenHeight = d.height;

				int speed = 30;

				if (key == KeyEvent.VK_LEFT) {
					point.x = point.x - speed;
					if (point.x <= -windowWidth) {
						point.x = screenWidth;
					}

				} else if (key == KeyEvent.VK_RIGHT) {
					point.x = point.x + speed;
					if (point.x >= screenWidth) {
						point.x = point.x - screenWidth - windowWidth;
					}

				} else if (key == KeyEvent.VK_UP) {
					point.y = point.y - speed;
					if (point.y <= -windowHeight) {
						point.y = screenHeight;
					}

				} else if (key == KeyEvent.VK_DOWN) {
					point.y = point.y + speed;
					if (point.y >= screenHeight) {
						point.y = point.y - screenHeight - windowHeight;
					}
				}

				setLocation(point);
			}
		};
		this.addKeyListener(ka);

	}

	/*
	 * private void init_KeyEvent() {
	 * 
	 * KeyListener listener = new KeyListener() {
	 * 
	 * @Override public void keyTyped(KeyEvent e) {
	 * 
	 * }
	 * 
	 * @Override public void keyReleased(KeyEvent e) {
	 * System.out.println("--키를 떼었을때--");
	 * 
	 * }
	 * 
	 * @Override public void keyPressed(KeyEvent e) {
	 * System.out.println("--키를 눌렀을때--");
	 * 
	 * } };
	 * 
	 * // 키 이벤트 등록 this.addKeyListener(listener);
	 * 
	 * }
	 */

	public static void main(String[] args) {
		new KeyEventTest();

	}

}

package mymain;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class _02_ThreadTest_BlockSync extends JFrame {

	JButton redButton,yellowButton,greenButton;
	
	//내부 클래스(inner class): 외부클래스의 모든 요소를 사용할 수 있다
	class SignalRunnable implements Runnable{

		@Override
		public void run() {
			// 쓰레드를 수행하기위한 run메서드를 이용할수있게 해주는 인터페이스
			String name = Thread.currentThread().getName();
			while(true) {
				if(name.equals("R")) {
					synchronized(this) {
						redButton.setBackground(Color.red);
						yellowButton.setBackground(Color.gray);
						greenButton.setBackground(Color.gray);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				} else if (name.equals("Y")){
					synchronized (this) {
						redButton.setBackground(Color.gray);
						yellowButton.setBackground(Color.yellow);
						greenButton.setBackground(Color.gray);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				} else if (name.equals("G")) {
					synchronized (this) {
					}
					redButton.setBackground(Color.gray);
					yellowButton.setBackground(Color.gray);
					greenButton.setBackground(Color.green);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
				}
			}
		}
		
	}
	
	public _02_ThreadTest_BlockSync() {

		super("쓰레드 동기화");
		
		this.setLayout(new GridLayout(1,3));
		this.add(redButton = new JButton());
		this.add(yellowButton = new JButton());
		this.add(greenButton = new JButton());
		
		redButton.setBackground(Color.red);
		yellowButton.setBackground(Color.yellow);
		greenButton.setBackground(Color.green);
		
		//Thread 수행객체 생성
		Runnable runnable = new SignalRunnable();
		Thread redThread = new Thread(runnable, "R");
		Thread yellowThread = new Thread(runnable, "Y");
		Thread greenThread = new Thread(runnable, "G");
		
		//Thread를 구동하려면 start메서드를 사용해야한다.
		redThread.start();
		yellowThread.start();
		greenThread.start();
		
		
		//위치 정하기
		this.setLocation(200, 100);
		//크기정하기
		this.setSize(300, 120);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new _02_ThreadTest_BlockSync();

	}

}

package mymain;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JProgressBar;


public class _01_ThreadTest1 extends JFrame {

	JProgressBar redBar, greenBar, blueBar;
	Thread redThread, greenThread, blueThread;
	
	boolean isRedRunning = true;
	boolean isGreenRunning = true;
	boolean isBlueRunning = true;

	public _01_ThreadTest1() {

		super("MyThread extends Thread");

		this.setLayout(new GridLayout(3, 1));
		redBar = new JProgressBar();
		redBar.setValue(30);
		redBar.setForeground(Color.red);

		greenBar = new JProgressBar();
		greenBar.setValue(50);
		greenBar.setForeground(Color.green);

		blueBar = new JProgressBar();
		blueBar.setValue(70);
		blueBar.setForeground(Color.blue);

		this.add(redBar);
		this.add(greenBar);
		this.add(blueBar);

		initRedThread();
		initGreenThread();
		initBlueThread();
		
		initKeyEvent();

		// 위치 정하기
		this.setLocation(200, 100);
		// 크기정하기
		this.setSize(400, 200);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void initKeyEvent() {
		KeyAdapter adapter = new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_R) {
					isRedRunning = !isRedRunning;
					
					if(isRedRunning==true) {
						redThread.resume();
					} else {
						redThread.suspend();
					}
				} else if (key == KeyEvent.VK_G) {
					isGreenRunning = !isGreenRunning;
					if(isGreenRunning==true) {
						greenThread.resume();
					} else {
						greenThread.suspend();
					}
				} else if (key == KeyEvent.VK_B) {
					isBlueRunning = !isBlueRunning;
					if(isBlueRunning==true) {
						blueThread.resume();
					} else {
						blueThread.suspend();
					}

				}
			}
		};
		this.addKeyListener(adapter);
	}

	private void initRedThread() {

		class RedThread extends Thread {
			public RedThread(String name) {
				super(name);
			}

			@Override
			public void run() {
				String name = this.currentThread().getName();
				System.out.printf("%s Thread is running\n", name);

				while (true) {
					int pos = redBar.getValue();
					pos += 1;
					if (pos > redBar.getMaximum())
						pos = 0;
					redBar.setValue(pos);

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				// end running (red thread는 소멸된다.)
			}
		}
		redThread = new RedThread("red");
		redThread.start();

	}

	private void initGreenThread() {
		greenThread = new Thread() {
			@Override
			public void run() {
				String name = this.currentThread().getName();
				System.out.printf("%s Thread is running\n", name);

				while (true) {
					int pos = greenBar.getValue();
					pos += 1;
					if (pos > greenBar.getMaximum())
						pos = 0;
					greenBar.setValue(pos);

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};

		greenThread.setName("green");
		greenThread.start();

	}

	private void initBlueThread() {

		blueThread = new Thread() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.printf("%s Thread is running\n", name);

				while (true) {
					int pos = blueBar.getValue();
					pos += 1;
					if (pos > blueBar.getMaximum())
						pos = 0;
					blueBar.setValue(pos);

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		blueThread.setName("blue");
		blueThread.start();

	}

	public static void main(String[] args) {
		System.out.printf("현재 코드를 수행하는 쓰레드: %s\n", Thread.currentThread().getName());
		new _01_ThreadTest1();

	}

}

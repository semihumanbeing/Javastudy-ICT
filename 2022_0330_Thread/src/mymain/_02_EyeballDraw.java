package mymain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class _02_EyeballDraw extends JFrame {

	//그림판 폭 높이
	public static final int GRIMPAN_WIDTH  = 400;

	public static final int GRIMPAN_HEIGHT = 600;
	
	static Image back_img;
	static Image back_img_off;
	
	static Boolean bEyeInPt = false;
	
	static {
		//메모리에 올리는 코드.
		back_img = Toolkit.getDefaultToolkit().getImage("image/캐로로_on.jpg");
		back_img_off = Toolkit.getDefaultToolkit().getImage("image/캐로로_off.jpg");
	}
	
	
	JPanel grimPan;
	
	
	//눈의 좌표
	Point eye_left  = new Point();
	Point eye_right = new Point();
	int   eye_radius;//눈의 반지름
	
	//눈알좌표
	Point eyeball_left  = new Point();
	Point eyeball_right = new Point();
	int eyeball_radius;
	
	
	
	public _02_EyeballDraw() {
		// TODO Auto-generated constructor stub

		super("눈알그리기");
		
		//그림판 초기화
		init_grimpan();
		
		//눈의 위치 초기화
		init_eye_position();
		
		//눈알의 위치 초기화
		init_eyeball_position();
		
		//마우스 이벤트 초기화
		init_mouse_event();
		
		
		// 위치 x y
		this.setLocation(600, 100);
		// 크기
		//this.setSize(400, 400);
		pack();
		
		setResizable(false);
		
		
		// 보여주기
		this.setVisible(true);
		// 종료코드
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		
		MouseAdapter adapter = new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				
				//눌린버튼 알아보는 코드
				/*
				int button = e.getButton();
				if(button== MouseEvent.BUTTON3) {
					bEyeInPt = true;
				}else {
					bEyeInPt = false;
				}
				*/
				
				//눌린좌표
				Point pt = e.getPoint();
				//System.out.println(e);
				move_eyeball_left_position(pt);//왼쪽 눈알의 위치
				move_eyeball_right_position(pt);//오른쪽 눈알의 위치
				
				grimPan.repaint();//그림판 다시그려야-> paintComponent(g) call
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseReleased(e);
				
				//눈알위치 초기화
				init_eyeball_position();
				grimPan.repaint();//그림판 다시그려야-> paintComponent(g) call
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseDragged(e);
				
				//움직인좌표
				Point pt = e.getPoint();
				
				move_eyeball_left_position(pt);//왼쪽 눈알의 위치
				move_eyeball_right_position(pt);//오른쪽 눈알의 위치
				
				grimPan.repaint();//그림판 다시그려야-> paintComponent(g) call
				
				
			}
			
		};
		
		//그림판에 마우스 이벤트 설정
		grimPan.addMouseListener(adapter);		//마우스 프레스,릴리즈
		grimPan.addMouseMotionListener(adapter);//마우스 드래그
		
		
		
	}

	protected void move_eyeball_right_position(Point mousept) {
		// TODO Auto-generated method stub
		
		int x = mousept.x - eye_right.x; //밑변
		int y = mousept.y - eye_right.y; //높이
		
		double r = Math.sqrt(x*x + y*y);
		
		double rate = eyeball_radius / r;
		
		//눈알의 좌표
		eyeball_right.x = (int) (eye_right.x + rate * x); 
		eyeball_right.y = (int) (eye_right.y + rate * y); 
		
		if(r<=eye_radius) {
			bEyeInPt = true;
		}else bEyeInPt = false;
		return;
		
		
	}

	protected void move_eyeball_left_position(Point mousept) {
		// TODO Auto-generated method stub
		
		int x = mousept.x - eye_left.x; //밑변
		int y = mousept.y - eye_left.y; //높이
		
		double r = Math.sqrt(x*x + y*y);
		
		double rate = eyeball_radius / r;
		
		//눈알의 좌표
		eyeball_left.x = (int) (eye_left.x + rate * x); 
		eyeball_left.y = (int) (eye_left.y + rate * y); 
		
		if(r<=eye_radius) {
			bEyeInPt = true;
		}else bEyeInPt = false;
		return;
		
		
		
	}

	private void init_eyeball_position() {
		// TODO Auto-generated method stub
		//눈의 중심좌표와 동일하게
		
		eyeball_left.x = eye_left.x;
		eyeball_left.y = eye_left.y;
		
		eyeball_right.x = eye_right.x;
		eyeball_right.y = eye_right.y;
		
		//눈알의 반지름
		eyeball_radius = eye_radius / 2;
		
		
	}

	private void init_eye_position() {
		// TODO Auto-generated method stub
		
		//왼쪽눈 초기화
		eye_left.x = 135;//GRIMPAN_WIDTH /4;
		eye_left.y = 117;//GRIMPAN_HEIGHT /2;
		
		//오른쪽눈 초기화
		eye_right.x= 283;//GRIMPAN_WIDTH /4*3;
		eye_right.y= 127;//GRIMPAN_HEIGHT /2;
		
		//눈알 반지름
		eye_radius = GRIMPAN_WIDTH/4 - 43;
		
		
	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		//                   익명클래스
		grimPan = new JPanel() { 
			
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				//super.paintComponent(g);
				
				//이전에 그렸던 내용지우는 코드
				//g.clearRect(0, 0, GRIMPAN_WIDTH, GRIMPAN_HEIGHT);
				
				//눈을 감았으면
				if(bEyeInPt) {
					g.drawImage(back_img_off, 0,0,this);
					return;
				}
				
				
				//배경이미지 올리기
				g.drawImage(back_img, 0, 0, this);
				
				
				//눈 그리기
				//왼쪽
				/*g.drawOval(eye_left.x-eye_radius, 
						   eye_left.y-eye_radius, 
						   eye_radius*2, 
						   eye_radius*2);
				
				//오른쪽
				g.drawOval(eye_right.x-eye_radius, 
					       eye_right.y-eye_radius, 
					       eye_radius*2, 
					       eye_radius*2);
				*/
				g.setColor(Color.black);
				
				
				//눈알 그리기
				g.fillOval(eyeball_left.x - eyeball_radius, 
					       eyeball_left.y - eyeball_radius, 
					       eyeball_radius*2, 
					       eyeball_radius*2);
				
				g.fillOval(eyeball_right.x - eyeball_radius, 
					       eyeball_right.y - eyeball_radius, 
					       eyeball_radius*2, 
					       eyeball_radius*2);
				
				
				
				
				
				
				
				
				
				
			}
			
		};
		
		grimPan.setPreferredSize(new Dimension(GRIMPAN_WIDTH,GRIMPAN_HEIGHT));
		this.add(grimPan);//위치생략하면 Center
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _02_EyeballDraw();

	}

}

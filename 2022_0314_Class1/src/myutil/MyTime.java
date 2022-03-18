package myutil;

import java.util.Calendar;

// Constructor 메서드
	// 1. 객체가 생성될 때 호출되는 메서드
	// 2. 형식: 클래스이름();
	// 3. 반환형이 없다.
	// 4. 클래스의 초기화 기능을 수행하는 메서드
	// 5. method overload 가 가능하다.
	// 6. 생략가능: JVM이 자동생성해서 처리한다.
	


public class MyTime {
	
	// Member Field : heap 메모리 영역에 생성된다. 자동 초기화 (숫자: 0 논리형: false 참조변수: null)
	//              
	private int hour ;
	private int minute;
	private int second;
	
	
	//default 생성자
	public MyTime() {
		System.out.println("-----MyTime()-----");
		Calendar c = Calendar.getInstance();
		hour = c.get(Calendar.HOUR_OF_DAY);// 24시간제
		minute = c.get(Calendar.MINUTE);
		second = c.get(Calendar.SECOND);

	}
	
	// overload 된 생성자
	public MyTime(int h) {
		this(); // this 생성자 : MyTime() 을 호출 
		//this 생성자는 무조건 첫번째 명령으로 실행되어야한다.
		hour = h;
		
		
				
	}
	
	public MyTime(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
		
	}
	
	public MyTime(int h, int m) {
		hour = h;
		minute = m;
		second = 1;
		
	}
	
	
	
	

	public void display() {
			System.out.printf("%02d:%02d:%02d", hour, minute, second);
	
		}

}

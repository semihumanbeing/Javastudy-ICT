package mymain;

import myutil.MyDate;

public class MyMain_MyDate {

	public static void main(String[] args) {
		
		MyDate in = new MyDate();
		
		// in.year = 2022; // 공개모드이지만 멤버 필드는 숨기는 것을 원칙으로 한다.
		in.setYear(2022);
		
		// in.month // 상속 받은 자식이나 동일 패키지가 아니면 사용할 수 없다.
		in.setMonth(3); 
		
		// in.day // 비공개모드, 자신 외에는 사용 못함
		in.setDay(14);
		
		// default : 동일 패키지일때만
		in.setWeekday(2);
		
		System.out.printf("year: %d\n", in.getYear());
		System.out.printf("month: %d\n", in.getMonth());
		System.out.printf("day: %d\n", in.getDay());
		System.out.printf("weekday: %d\n", in.getWeekday());
		// 객체를 가져오거나 값을 설정할때 직접적으로 설정하는 것이 아니라 
		// getter 와 setter를 설정하여 사용하는 것이 일반적이다.
		
		in.display();

		
	}

}

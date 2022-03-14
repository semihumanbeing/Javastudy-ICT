package myutil;

public class MyDate {
	
	public int year;
	protected int month;
	private int day;
	int weekday;
	
	// setter 메서드 (변수에 값을 넣는 메서드)
	// 형식: setField명(인자) <- camel case로 작성한다.
	
	public void setYear(int y) {
		year = y;
	}
	
	public void setMonth(int m) {
		month = m;
		return; 
		// 생략시 return이 있는것으로 처리한다. void가 아닌 형에서 return을 쓰지 않으면 에러가 난다.
	}

	public void setDay(int d) {
		day = d;
		
	}
	
	public void setWeekday(int w) {
		weekday = w;
	}
	
	// getter 메서드 (값을 가져오는 메서드)
	// 형식은 setter와 같다.
	
	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public int getDay() {
		return day;
	}

	public int getWeekday() {
		return weekday;
	}
	
	public void display() {
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
	}

}

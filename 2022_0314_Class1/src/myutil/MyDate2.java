package myutil;

public class MyDate2 {
	
	public int year;
	protected int month;
	private int day;
	int weekday;
	
	public MyDate2() {
		
	}
	
	public MyDate2(int a, int b, int c) {
		this.year = a;
		this.month = b;
		this.day = c;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getWeekday() {
		return weekday;
	}
	public void setWeekday(int weekday) {
		this.weekday = weekday;
	}
	
	public void display() {
		System.out.printf("%d-%d-%d",year,month,day);
		
	}
	

}

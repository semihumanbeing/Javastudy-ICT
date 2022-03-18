package myutil;

public class Save {
	
	String name; // 저축자 이름
	int money; // 저축액
	
	public static double rate; // 프로그램 시작 시 생성되는 정적변수

	public Save(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void display() {
		System.out.printf("[%s]-[%d]-[%d]\n", name, money, (int)(money*rate));
	}
	
	
	
	

}

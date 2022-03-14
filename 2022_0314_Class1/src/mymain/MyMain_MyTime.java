package mymain;

import myutil.MyTime;

public class MyMain_MyTime {
	
	public static void main(String[] args) {
		
	MyTime mt1 = new MyTime();
	
	MyTime mt2 = new MyTime(13, 37, 50);
	
	MyTime mt3 = new MyTime(14, 30);
	
	MyTime mt4 = new MyTime(20);
	
	mt1.display();
	
	System.out.println();
	
	mt2.display();
	
	System.out.println();
	
	mt3.display();
	
	System.out.println();
	
	mt4.display();

		


	}

}

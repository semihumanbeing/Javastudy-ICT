package mymain;

import java.util.Calendar;

public class MyMain_Watch {

	public static void main(String[] args) throws Exception {
		
		while(true) {
			
			Calendar calendar = Calendar.getInstance(); // single-ton
			
			int hour = calendar.get(calendar.HOUR_OF_DAY);
			int minute = calendar.get(calendar.MINUTE);
			int second = calendar.get(calendar.SECOND);
			
			System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
			
			Thread.sleep(1000);
		}

	}

}

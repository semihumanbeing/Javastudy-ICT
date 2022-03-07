package mymain;

import java.util.Scanner;

public class _02_Switch_2 {

	public static void main(String[] args) {
		// 1  2  3  4  5  6  7  8  9  10 11 12
		// 31 28 31 30 31 30 31 31 30 31 30 31

		Scanner scanner = new Scanner(System.in);
		int month;
		int lastDay = 0;
		String season = "겨울";
		
		// if 문으로 마지막 날 구하기
		/*
		 * System.out.print("월을 입력하세요: "); month = scanner.nextInt();
		 * if (month >= 1 && month <= 12) { if(month == 1 || month == 3 || month == 5 ||
		 * month == 7 || month == 8 || month == 10 || month == 12) { lastDay = 31; }
		 * else if (month == 4 || month == 6 || month == 9 || month == 11) { lastDay =
		 * 30; } else if (month ==2) { lastDay = 28; }
		 * System.out.printf("%d월의 마지막 날은 %d일입니다", month, lastDay); } else {
		 * System.out.println("유효한 숫자가 아닙니다. 1~12 사이 값을 입력하세요"); }
		 */
		
		
		// switch 문으로 마지막 날 구하기 
		
		System.out.print("월을 입력하세요: "); 
		month = scanner.nextInt();
		
		switch(month) {
		case 2 : lastDay = 28; break;
		case 4, 6, 9, 11 : lastDay = 30; break;
		
		default : lastDay = 31;
		
		}
		System.out.printf("%d월의 마지막 날은 %d일입니다\n", month, lastDay);
		
		// 방법 1
	    switch(month) {
	    case 12, 1, 2 : season = "겨울"; break;
	    case 3,  4, 5 : season = "봄";  break;
	    case 6,  7, 8 : season = "여름"; break;
	    case 9, 10,11 : season = "가을"; break;
	    }
	    System.out.printf("%d월은 %s입니다\n", month, season);
	    
	    // 방법 2
	    switch(month/3) {
	    case 1 : season = "봄"; break;
	    case 2 : season = "여름";  break;
	    case 3 : season = "가을"; break;
	    default : season = "겨울";
	    }
	    System.out.printf("%d월은 %s입니다", month, season);
	

		
		
		scanner.close();
	}

}

package mymain;

import java.util.Random;

public class _1_MyMain_Array3 {
	// 활용하기
	public static void main(String[] args) {
		
	// 각 월의 마지막 날을 배열로 만들기
	int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	Random random = new Random();
	int month = random.nextInt(12)+1;
	
	int lastDay = monthArray[month-1];
	
	System.out.printf("%d월은 %d일까지 있습니다.\n", month, lastDay);
	
	// 활용하기 2
	

	}

}

package mymain;

import java.util.Random;

public class MyMain_Random {
	public static void main(String[] args) {
		
	
	Random random = new Random();
	
	int number = random.nextInt(3); // 0base 로 0부터 숫자까지 경우의 수(0,1,2)
	
	System.out.println(number);
	
	// 1~45 중 난수 발생시키기
	
	number = random.nextInt(45)+1;
	System.out.println(number);

}
}
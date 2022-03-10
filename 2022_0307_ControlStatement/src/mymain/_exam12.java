package mymain;

import java.util.Scanner;

public class _exam12 {

	public static void main(String[] args) {
		//12번문제
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("실수를 입력하세요");
		double d = scanner.nextDouble();
		System.out.println("정수를 입력하세요");
		int i = scanner.nextInt();
		double e = Math.pow(d, i);
		
		System.out.println(e);
		
		
		
		
		scanner.close();
		

	}

}

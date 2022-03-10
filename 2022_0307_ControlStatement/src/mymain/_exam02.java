package mymain;

import java.util.Scanner;

public class _exam02 {

	public static void main(String[] args) {
		
		//2번문제
		
		Scanner scanner = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("3개의 정수를 입력하세요: ");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();
		
		System.out.printf("선택한 숫자: %d %d %d", n1 , n2, n3);
		System.out.println();
		
		int min;
		int minimum;
		min = (n1 > n2) ? n2 : n1;
		minimum = (min>n3) ? n3 : min;
		System.out.printf("가장 작은 값은: %d",minimum);	
		
		
		scanner.close();

	}

}

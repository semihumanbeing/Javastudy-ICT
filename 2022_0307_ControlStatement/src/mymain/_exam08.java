package mymain;

import java.util.Scanner;

public class _exam08 {
	public static void main(String[] args) {
		// 8번문제
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를입력하세요");
		int j=scanner.nextInt();
		int sum = 0;
		
		System.out.println("n\t1부터 n까지의 합\n---------------------");
		for (int n = 1;n<=j;n++) 
		{
			sum = sum + n;
			System.out.printf("%d\t%d\n",n,sum);
		}
		
		
		scanner.close();
		
		
	}

}

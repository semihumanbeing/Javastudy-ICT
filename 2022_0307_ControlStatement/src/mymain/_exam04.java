package mymain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _exam04 {

	public static void main(String[] args) {
		// 4번문제
		try {
		Scanner scanner = new Scanner(System.in);
		
		int n1, n2;
		String operator;
		
		System.out.printf("두개의 숫자와 연산자를 입력하세요: ");
		n1 = scanner.nextInt();
		operator = scanner.next();
		n2 = scanner.nextInt();
		
		
		if(operator.equals("+"))
		{
			System.out.printf("%d + %d = %d", n1, n2, n1+n2);
		} else if(operator.equals("-"))
		{
			System.out.printf("%d - %d = %d", n1, n2, n1-n2);
		} else if(operator.equals("*"))
		{
			System.out.printf("%d * %d = %d", n1, n2, n1*n2);
		} else if(n2==0 && operator.equals("/")) 
		{
			System.out.println("0으로 나눌 수 없습니다");
		} else if(operator.equals("/")) 
		{
			System.out.printf("%d / %d = %d", n1, n2, n1/n2);
		} else {System.out.println("숫자 혹은 연산자를 정확히 입력하세요");
		}
		scanner.close();
		} catch(InputMismatchException e) {
			System.out.println("숫자 혹은 연산자를 정확히 입력하세요 " + e);
			
		} catch(Exception e) {
			System.out.println("숫자 혹은 연산자를 정확히 입력하세요 " + e);
			
		}
		
		
		

	}

}

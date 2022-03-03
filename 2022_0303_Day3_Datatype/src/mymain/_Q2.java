package mymain;

import java.util.Scanner;
import static java.lang.System.out;

public class _Q2 {
		/*
		 원의 반지름을 입력받아서 
		 원 둘레
		 원 면적
		 구하는 프로그램을 작성하세요. 
		 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double pi = Math.PI;
		
		System.out.print("반지름을 입력하세요: ");
		// 반지름을 저장할 변수
		double radius = scanner.nextDouble();
		//원둘레 (2파이*반지름)
		double circle_length = radius * (pi * 2);
		//원면적 (반지름*반지름*파이)
		double circle_area = radius * radius * pi;
				
		System.out.printf("반지름이 %.1f㎝일때\n", radius);
		System.out.printf("원둘레 = %.1f ㎝\n", circle_length );
		System.out.printf("원면적 = %.1f ㎠", circle_area );
		
		try{
			System.out.print("반지름을 입력하세요: ");
			radius = new Scanner(System.in).nextInt();
			
			out.println(radius);
			}
			catch(Exception e){
			out.println("blah blah error encountered" + e);
			}
		
		
		scanner.close();
		
		
	}

}

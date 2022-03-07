package mymain;

import java.util.Scanner;

public class _02_Switch_3 {

	public static void main(String[] args) {
		
		// 1. 국어점수를 입력받는다
		// 2. switch 문을 이용해서 등급을 산출하세요 (a/b/c/e/f) - 수식 활용하기
		// 
		
		Scanner scanner = new Scanner(System.in);
		int kor;
		String grade = "F";
		
		System.out.printf("국어점수를 입력하세요: ");
		kor = scanner.nextInt();
		
		
		// 
		if (kor>=0 && kor <=100) {
		switch(kor/10) {
		case 9, 10 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		
		default : grade = "F";
		
		} System.out.printf("점수: %d 등급: %s", kor, grade);
		}else {
			System.out.println("유효한 숫자가 아닙니다.");
		}
		
		
		
		scanner.close();

	}

}

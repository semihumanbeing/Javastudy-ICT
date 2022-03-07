package mymain;

import java.util.Scanner;

public class _01_If_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int kor; // 국어점수
		String grade = "A";
		
		System.out.printf("국어점수를 입력하세요: ");
		kor = scanner.nextInt();
		
		// 등급 계산하기
		// A = 90 ~ 100
		// B = 80 ~ 89
		// C = 70 ~ 79
		// D = 60 ~ 69
		// F = 0  ~ 59
		
		if (kor >= 90 && kor <= 100) {
			grade = "A";
			System.out.printf("당신의 점수는 %d점, 등급은 %s 입니다", kor, grade);
		} else if (kor >= 80 && kor < 90) {
			grade = "B";
			System.out.printf("당신의 점수는 %d점, 등급은 %s 입니다", kor, grade);
		} else if (kor >= 70 && kor < 80) {
			grade = "C";
			System.out.printf("당신의 점수는 %d점, 등급은 %s 입니다", kor, grade);	
		} else if (kor >= 60 && kor < 70) {
			grade = "D";
			System.out.printf("당신의 점수는 %d점, 등급은 %s 입니다", kor, grade);
		} else if (kor >= 0 && kor < 60) {
			grade = "F";
			System.out.printf("당신의 점수는 %d점, 등급은 %s 입니다", kor, grade);
		} else {
			System.out.println("not valid");
		}
		
		scanner.close();

	}

}

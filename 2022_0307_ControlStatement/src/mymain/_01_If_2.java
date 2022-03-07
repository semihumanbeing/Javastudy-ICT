package mymain;

import java.util.Scanner;

public class _01_If_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int kor; // 국어점수
		String grade = "F";
		
		System.out.printf("국어점수를 입력하세요: ");
		kor = scanner.nextInt();
		
		// 등급 계산하기
		// A = 90 ~ 100
		// B = 80 ~ 89
		// C = 70 ~ 79
		// D = 60 ~ 69
		// F = 0  ~ 59
		
		// 조금 더 예쁜 코드
		
		/*
		 * if (kor >= 90 && kor <= 100) { grade = "A"; } else if (kor >= 80 && kor < 90)
		 * { grade = "B"; } else if (kor >= 70 && kor < 80) { grade = "C"; } else if
		 * (kor >= 60 && kor < 70) { grade = "D"; } else if (kor >= 0 && kor < 60) {
		 * grade = "F"; } else { System.out.println("not valid"); }
		 * System.out.printf("당신의 점수는 %d점, 등급은 %s 입니다", kor, grade);
		 * 
		 * scanner.close();
		 */

		if (kor >= 0 && kor <= 100) {
			if(kor>=90) grade = "A";
			else if(kor>=80) grade = "B";
			else if(kor>=70) grade = "C";
			else if(kor>=60) grade = "D";
		
			System.out.printf("당신의 점수는 %d점, 등급은 %s 입니다", kor, grade);
		}
		else {
			System.out.printf("입력된 점수 %d는 유효하지 않습니다.", kor);
		}
		
	}

}

package mymain;

import java.util.Scanner;

public class _01_If_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int kor; // 국어점수
		String grade = "F";
		
		System.out.printf("국어점수를 입력하세요: ");
		kor = scanner.nextInt();
		
		// 등급 계산하기
		// A = 90~92(A-) 93~95(A) 96~100(A+)
		// B = 80~82(B-) 83~85(B) 86~89(B+)
		// C = 70~72(C-) 73~75(C) 76~79(C+)
		// D = 60~62(D-) 63~65(D) 66~69(D+)
		// F = 0  ~ 59
		

		if (kor >= 0 && kor <= 100) {
			if(kor>=96) grade = "A+";
			else if(kor>=93) grade = "A";
			else if(kor>=90) grade = "A-";
			
			else if(kor>=86) grade = "B+";
			else if(kor>=83) grade = "B";
			else if(kor>=80) grade = "B-";
			
			else if(kor>=76) grade = "C+";
			else if(kor>=73) grade = "C";
			else if(kor>=70) grade = "C-";
			
		
			System.out.printf("당신의 점수는 %d점, 등급은 %s 입니다", kor, grade);
		}
		else {
			System.out.printf("입력된 점수 %d는 유효하지 않습니다.", kor);
		}
		
	}

}

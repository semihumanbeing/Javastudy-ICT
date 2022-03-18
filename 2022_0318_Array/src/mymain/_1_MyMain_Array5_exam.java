package mymain;

import java.util.Scanner;

public class _1_MyMain_Array5_exam {

	public static void main(String[] args) {
		// lottery
		
		Scanner scanner = new Scanner(System.in);
		
		int[] userNo = new int [6];
		String yn = "y";
		
		//추첨실행
		Lotto lotto = new Lotto();
		lotto.makeWinNo();
		
		while(true) {
		System.out.println("숫자 6개를 입력하세요: ");
		userNo[0] = scanner.nextInt();
		userNo[1] = scanner.nextInt();
		userNo[2] = scanner.nextInt();
		userNo[3] = scanner.nextInt();
		userNo[4] = scanner.nextInt();
		userNo[5] = scanner.nextInt();
		
		
		
		// 로또객체에게 입력값 넘겨주기
		lotto.setUserNo(userNo);
		
		
		// 로또객체로부터 출력하기
		lotto.display();
		
		System.out.println();
		
		// 다시하기
		System.out.print("다시하기? (y/n): ");
		yn = scanner.next();
		if (yn.equalsIgnoreCase("y")==false) break;
		}
		
		
		System.out.println("---the end---");
		scanner.close();
		
		
	}

}

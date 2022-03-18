package mymain;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	int[] userNo; // 사용자가 전달한 번호
	int[] winNo; // 추첨번호

	int count = 0;

	Random random = new Random();

	public void setUserNo(int[] userNo) {
		this.userNo = userNo;
	}

	public void makeWinNo() {
		winNo = new int[7];
		for (int i = 0; i < winNo.length; i++) {
			for (int k = 0; k < i; k++) {
				int number = random.nextInt(45)+1;
				if(winNo[k]!=number) {
					winNo[i] = number;
				}
				}
		}
		// 중복수 체크
		// 마지막번호를 제외한 앞에 6자리 소트
		Arrays.sort(winNo, 0, 6);

	}

	public void makeRank() {
		// 등수계산
		//1등 : 6개 일치, 2등 : 5개 일치 + 보너스, 3등 : 5개 일치, 4등 : 4개 일치
		count = 0;

	}

	public void display() {
		System.out.println("---추첨결과---");
		System.out.print("추첨번호: ");
		for (int i = 0; i < winNo.length - 1; i++) {
			System.out.printf("%3d", winNo[i]);
		}
		// 보너스번호
		System.out.printf(" (%d)\n", winNo[6]);
		System.out.print("유저번호: ");
		for (int i = 0; i < userNo.length; i++) {
			System.out.printf("%3d", userNo[i]);
		}
		System.out.println();

		// 등수출력

	}

}

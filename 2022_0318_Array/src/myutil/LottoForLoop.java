package myutil;

import java.util.Arrays;
import java.util.Random;

public class LottoForLoop {

	int[] userNumbers; // 사용자가 전달한 번호
	int[] winningNumbers; // 추첨번호
	int bonusNumber = 0;
	int count;
	boolean bonusNumberMatched = false;

	Random random = new Random();

	public void setUserNo(int[] userNo) {
		this.userNumbers = userNo;
	}

	public void makeWinNo() {
		int winningNumberAmount = 6;
		winningNumbers = random.ints(1, 46).distinct().limit(winningNumberAmount).toArray();
		// 중복수 체크
		// 마지막번호를 제외한 앞에 6자리 소트
		Arrays.sort(winningNumbers, 0, 6);
		// 보너스 숫자 생성

	}

	public void makeBonusNo() {
		while(bonusNumber == 0) {
			int proposedBonusNumber = random.nextInt(45) + 1;
			boolean anyDuplicates = false;
			
			for(int winningNumber: winningNumbers) {
				if(proposedBonusNumber == winningNumber) {
					anyDuplicates = true;
				}
			}
			if(anyDuplicates == false) {
				bonusNumber = proposedBonusNumber;
			}
		}
	}

	public void makeRank() {
		// 등수계산
		// 1등 : 6개 일치, 2등 : 5개 일치 + 보너스, 3등 : 5개 일치, 4등 : 4개 일치
		int matchedNumbers = 0;

		for (int userNumber : userNumbers) {
			for (int winningNumber : winningNumbers) {
				if (userNumber == winningNumber) {
					matchedNumbers = matchedNumbers + 1;
				} else if (userNumber == bonusNumber) {
					bonusNumberMatched = true;

				}
			}
		}

		count = matchedNumbers;
		if (bonusNumberMatched) count = count + 1;
	}

	public void display() {
		System.out.println("---추첨결과---");
		System.out.print("추첨번호: ");
		for (int i = 0; i < winningNumbers.length; i++) {
			System.out.printf("%3d", winningNumbers[i]);
		}
		// 보너스번호
		System.out.printf(" (%d)\n", bonusNumber);
		System.out.print("유저번호: ");
		for (int userNumber : userNumbers) {
			System.out.printf("%3d", userNumber);
		}
		System.out.println();

		// 등수출력
		System.out.printf("%d개 맞춤 / 보너스 %b\n", count, bonusNumberMatched);
		if (count == 6 && bonusNumberMatched == true) {
			System.out.println("2등!!!");
		} else if (count == 6) {
			System.out.println("1등!!!!");
		} else if (count == 5) {
			System.out.println("3등!!");
		} else if (count == 4) {
			System.out.println("4등!");
		} else if (count <= 3) {
			System.out.println("꽝");
		}

	}

}

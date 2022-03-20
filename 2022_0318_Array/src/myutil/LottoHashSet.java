package myutil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoHashSet {

	int[] userNumbers; // 사용자가 전달한 번호
	int[] winningNumbers; // 추첨번호
	int bonusNumber;
	int count;
	int bonusCount;

	Random random = new Random();

	public void setUserNo(int[] userNo) {
		this.userNumbers = userNo;
	}

	public void makeWinNo() {
		int winningNumberAmount = 7;
		winningNumbers = new int[winningNumberAmount];

		Set<Integer> winningNumbersSet = new HashSet<Integer>();
		while (winningNumbersSet.size() < winningNumberAmount) {
			int number = (random.nextInt(45)) + 1;
			winningNumbersSet.add(number);
		}
		int index = 0;
		for (Integer winningNumber : winningNumbersSet) {
			winningNumbers[index++] = winningNumber;
		}
		// 중복수 체크
		// 마지막번호를 제외한 앞에 6자리 소트
		Arrays.sort(winningNumbers, 0, 6);
		// 보너스 숫자 생성

	}

	public void makeBonusNo() {
		bonusNumber = (random.nextInt(45)) + 1;
	}

	public void makeRank() {
		// 등수계산
		// 1등 : 6개 일치, 2등 : 5개 일치 + 보너스, 3등 : 5개 일치, 4등 : 4개 일치
		Set<Integer> matchedNumbersSet = new HashSet<Integer>();
		Set<Integer> bonusNumbersSet = new HashSet<Integer>();
		for (int userNumber : userNumbers) {
			for (int winningNumber : winningNumbers) {
				if (userNumber == winningNumber) {
					matchedNumbersSet.add(userNumber);
				} else if (userNumber == bonusNumber) {
					bonusNumbersSet.add(userNumber);

				}
			}
		}

		count = matchedNumbersSet.size();
		bonusCount = bonusNumbersSet.size();
	}

	public void display() {
		System.out.println("---추첨결과---");
		System.out.print("추첨번호: ");
		for (int i = 0; i < winningNumbers.length - 1; i++) {
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
		System.out.printf("%d개 맞춤 / 보너스 %d개\n",count, bonusCount);
		if ((count+bonusCount)==6) {
			System.out.println("2등!!!");
		} else if(count == 6) {
			System.out.println("1등!!!!");
		} else if(count == 5) {
			System.out.println("3등!!");
		} else if(count == 4) {
			System.out.println("4등!");
		} else if(count <= 3) {
			System.out.println("꽝");
		}

	}

}

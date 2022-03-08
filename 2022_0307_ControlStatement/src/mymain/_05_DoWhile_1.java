package mymain;

import java.util.Scanner;

public class _05_DoWhile_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int mTable;
		String yn = "y";
		
		do {
			System.out.print("몇단인가요?: ");		
			mTable = scanner.nextInt();
		
			if (mTable>=2 && mTable <=9) {	
		for (int i=1; i<=9; i++) 
		System.out.printf("%d x %d = %d\n", mTable, i, mTable*i);
		
		}else {
			System.out.println("2~9 사이의 값을 입력하세요.");
		} 
		System.out.println("다시하기 y/n: ");
		yn = scanner.next();
		
		// String은 값 비교시 equals 메서드를 사용한다.
		} while(yn.equalsIgnoreCase("y"));
		
		
		scanner.close();
		System.out.println("-----the end-----");
		}
		
	}

	



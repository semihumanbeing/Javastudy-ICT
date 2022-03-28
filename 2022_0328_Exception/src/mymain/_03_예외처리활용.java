package mymain;

import java.util.Scanner;

public class _03_예외처리활용 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number;
		
		while(true) {
			try {
				System.out.println("숫자를 입력하세요");
				number= scanner.nextInt();
				
				if(number<2||number>9) throw new Exception();
				for(int i =0;i<10;i++) {
					System.out.printf("%d * %d = %d\n",number,i,number*i);
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("2~9사이의 숫자만 입력하세요");
			}
		}

	}

}

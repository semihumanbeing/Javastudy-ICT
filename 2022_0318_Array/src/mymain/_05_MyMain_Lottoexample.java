package mymain;

import java.util.Scanner;

import myutil.Lotto;

public class _05_MyMain_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int [] user_no = new int[6];
		String yn = "y";
		
		Lotto lotto = new Lotto();
		
		//추첨실행
		lotto.makeWin_no();
		
		
		while(true) {
			System.out.print("숫자 6개 입력하세요:");
			user_no[0] = scanner.nextInt();
			user_no[1] = scanner.nextInt();
			user_no[2] = scanner.nextInt();
			user_no[3] = scanner.nextInt();
			user_no[4] = scanner.nextInt();
			user_no[5] = scanner.nextInt();
			
			
			//로또객체에게 입력한 번호를 넘겨준다
			lotto.setUser_no(user_no);
			//로또객체로부터 출력
			lotto.display();
			
			//또?
			System.out.print("또?(y/n):");
			yn = scanner.next();
			
			//y가 아니면 끝내라..
			if(yn.equalsIgnoreCase("Y")==false)break;
			
		}
		
		System.out.println("---End---");
		scanner.close();
		
		
	}

}

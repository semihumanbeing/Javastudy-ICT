import java.util.Scanner;

public class _Q1 {

	public static void main(String[] args) {
		
		// 1. 금액을 입력받는다
		// 2. 권종별 갯수를 구하기
		
		Scanner scanner = new Scanner(System.in);
		int amount;
		int cash_50000; // 5만원권 갯수 저장
		int cash_10000; // 1만원권 갯수 저장
		int cash_5000; //  5천원권 갯수 저장
		int cash_1000; //  1천원권 갯수 저장
		int cash_500; //  500원권 갯수 저장
		int cash_100; //  100원권 갯수 저장
		int cash_10; //  10원권 갯수 저장
		int cash;
		
		System.out.print("금액을 입력하세요: ");
		cash = amount = scanner.nextInt();
		
		//50000원권 갯수 구하기
		cash_50000 = cash / 50000;
		
		cash = cash % 50000;
		
		//10000원권 갯수 구하기
		cash_10000 = cash / 10000;
		
		cash = cash % 10000;
		
		//5000원권 갯수 구하기
		cash_5000 = cash / 5000;
		
		cash = cash % 5000;
		
		//1000원권 갯수 구하기
		cash_1000 = cash / 1000;
		
		cash = cash % 1000;
		
		//500원권 갯수 구하기
		cash_500 = cash / 500;
		
		cash = cash % 500;
		
		//100원권 갯수 구하기
		cash_100 = cash / 100;
		
		cash = cash % 100;
		
		//10원권 갯수 구하기
		cash_10 = cash / 10;
		
		cash = cash % 10;
		
		
		
		System.out.printf("--[%d(원)에 대한 권종별 갯수]--\n", amount);
		System.out.printf("5만원 권 갯수: %d장\n", cash_50000);
		System.out.printf("1만원 권 갯수: %d장\n", cash_10000);
		System.out.printf("5천원 권 갯수: %d장\n", cash_5000);
		System.out.printf("1천원 권 갯수: %d장\n", cash_1000);
		System.out.printf("500원 권 갯수: %d개\n", cash_500);
		System.out.printf("100원 권 갯수: %d개\n", cash_100);
		System.out.printf("10원 권 갯수: %d개\n", cash_10);
		
		
		
		
		
		
		
		
		
		
		scanner.close();

	}

}

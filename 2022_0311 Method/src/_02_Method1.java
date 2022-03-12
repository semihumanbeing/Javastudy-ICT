import java.util.Scanner;

import myutil.Myinfo;

public class _02_Method1 {

	public static void main(String[] args) {
		Myinfo myInfo = new Myinfo();
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("출생년도를 입력하세요: ");
		int year = scanner.nextInt();
		
		System.out.print("키/몸무게를 입력하세요: ");
		double height = scanner.nextInt();
		double weight = scanner.nextInt();
		
		int age = myInfo.getAge(year);
		System.out.printf("출생년도: %d\n나이: %d\n", year, age);
		
		String t = myInfo.getT(year);
		System.out.printf("%s띠\n", t);
		
		String g = myInfo.getGanji(year);
		System.out.printf("%s",g);
		
		System.out.println();
		
		double a = myInfo.getBMI(height, weight);
		System.out.printf("키: %.1fcm\n몸무게: %.1fkg\nBMI:%.2f\n", height, weight, a);
		
		String b = myInfo.getBMIState(a);
		System.out.printf("%s입니다.", b);
		

		scanner.close();

	}

}

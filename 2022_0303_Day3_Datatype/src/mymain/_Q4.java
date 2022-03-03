package mymain;

import java.util.Scanner;

public class _Q4 {

	public static void main(String[] args) {
		//다음 정보를 입력후 출력하는 프로그램을 작성하세요.
		// 이름, 나이, 주소, 키, 몸무게
		
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.print("이름을 입력하세요: ");
		String name = scanner.nextLine(); // 문자열 입력받기
		
		System.out.print("나이를 입력하세요: ");
		int age = scanner.nextInt();
		
		System.out.print("주소를 입력하세요: ");
		String address = scanner.nextLine();
		
		scanner.nextLine();
		
		System.out.print("키를 입력하세요: ");
		double height = scanner.nextDouble();
		
		System.out.print("몸무게를 입력하세요: ");
		double weight = scanner.nextDouble();
		
		System.out.println("--[입력받은 정보]--");
		System.out.printf("이름: %s\n나이: %d\n주소: %s\n키: %.1f\n몸무게: %.1f\n", name, age, address, height, weight);
		
		scanner.close();

	}

}

package mymain;

import java.util.Scanner;

public class _Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//이름 주소 저장할 변수
		String name;
		String address;
		
		System.out.print("이름을 입력하세요: ");
		name = scanner.nextLine(); // 문자열 입력받기
		System.out.print("주소를 입력하세요: ");
		address = scanner.nextLine();
		
		System.out.println("--[입력받은 정보]--");
		System.out.printf("이름: %s\n주소: %s", name, address);
		
		scanner.close();

	}

}

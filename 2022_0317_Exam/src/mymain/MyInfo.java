package mymain;

import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.next();
		
		System.out.print("나이: ");
		int age = scanner.nextInt();	
		
		scanner.nextLine();
		
		System.out.print("주소: ");
		String address = scanner.nextLine();
		
		System.out.print("신장: ");
		double height = scanner.nextDouble();
		
		System.out.print("체중: ");
		double weight = scanner.nextDouble();
		
		
		System.out.println("===[개인정보]===");
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d\n", age);
		System.out.printf("주소: %s\n", address);
		System.out.printf("신장: %.01f(cm)\n", height);
		System.out.printf("체중: %.01f(kg)\n", weight);
		
		
		
		
		scanner.close();

	}

}

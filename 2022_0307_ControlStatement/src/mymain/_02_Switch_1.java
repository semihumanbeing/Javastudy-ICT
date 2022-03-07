package mymain;

import java.util.Scanner;

public class _02_Switch_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String data = "과일";
		String res = "맛";

		System.out.print("과일을 입력하세요: ");
		data = scanner.next();

		switch (data) {
		case "포도":
			res = "달다";
			break;
		case "수박":
			res = "시원하다";
			break;
		case "딸기":
			res = "맛있다";
			break;
			
		default:
			res = "?";
		}
		System.out.printf("과일: %s 특징: %s", data, res);


		scanner.close();
	}

}

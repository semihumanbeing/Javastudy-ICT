package mymain;

import java.util.Scanner;

public class _Q1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 키보드로부터 입력받는 객체 생성
		// System.in <- 입력 객체
		// System.out <- 출력 객체
		// 출력 객체를 활용하는 경우는 어떤게 있나요?
		
		System.out.print("choose width: ");
		int width = scanner.nextInt();
		System.out.print("choose height: ");
		int height = scanner.nextInt();
				
		int area = width * height;
		//값을 입력받아 면적 계산
		
		System.out.printf("가로 %d㎝ 세로 %d㎝인 사각형의 면적은: %d㎠\n", width, height, area);
		
		scanner.close();

	}

}

package mymain;

import myutil.MyArrays;

public class _1_MyMain_Array2 {
	
	public static void main(String[] args) {
	// 초기화
	// 변수 선언과 동시에 값을 부여하는 것
	int n; // 변수 선언
	n = 10; // 치환
	
	int m = 10; // 초기화
	
	// 배열 초기화 (원칙상)
	// int []ar = new int [] {1, 2, 3, 4}; // 배열 초기화 시 반드시 갯수를 생략한다.([]안에 숫자를 지정하지않음)
	// 배열 초기화 (이렇게 해도 됨)
	int []ar = {1, 2, 3, 4}; // 배열의 int 부분을 생략할 수 있다.
	
	MyArrays.displayArray(ar);
	
	}

}

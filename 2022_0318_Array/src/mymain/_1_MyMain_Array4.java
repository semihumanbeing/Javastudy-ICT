package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class _1_MyMain_Array4 {

	public static void main(String[] args) {
		// 배열관리객체

		int[] nr = new int[10];
		// heap 에 생성된 변수는 자동초기화

		System.out.println("--[초기값]--");
		MyArrays.displayArray(nr);
		
		// 기본 Java API (Arrays)
		Arrays.fill(nr, 3);
		System.out.println("--[3으로채우기]--");
		MyArrays.displayArray(nr);
		
		Arrays.fill(nr, 2, 3, 5);
		System.out.println("--[3번째부터 4개값을 5로 채우기]--");
		MyArrays.displayArray(nr);
		
		System.out.println("--[MyArrays로 만들기]--");
		MyArrays.fill(nr, 2);
		MyArrays.displayArray(nr);
				
		MyArrays.fill(nr, 3, 7, 5);
		MyArrays.displayArray(nr);
		
		//sort 기능으로 array 정렬하기 (오름차순으로 정렬)
		System.out.println("--[sort 기능으로 array 정렬하기 (오름차순으로 정렬)]--");
		int [] mr = {6,3,2,1,7,9,8,5,4};
		Arrays.sort(mr);
		MyArrays.displayArray(mr);
		
		// 오름차순 정렬 메서드 만들기
		System.out.println("--[오름차순 정렬 메서드 만들기]--");
		MyArrays.sortAscending(mr);
		MyArrays.displayArray(mr);
		
		// 내림차순 정렬 메서드 만들기
		System.out.println("--[내림차순 정렬 메서드 만들기]--");
		MyArrays.sortDescending(mr);
		MyArrays.displayArray(mr);
		
		// 부분 sort
		Arrays.sort(mr,3,7);
		System.out.println("---[3~7번째만 정렬하기]--");
		MyArrays.displayArray(mr);
		
		System.out.println("---[부분정렬 메서드 만들기]--");
		MyArrays.sortAscending(mr, 3, 7);
		MyArrays.displayArray(mr);
		
		// JDK 5.0 이후부터 지원
		// 개선된 For Loop
		System.out.println("---[첨자]---");
		for(int i =0; i<5;i++) {
			System.out.printf("%d %d\n", i, mr[i]);
		}
		
		System.out.println("---[개선된 loop]---");
		for(int i : mr) {
			System.out.println(i);
		}
		
		String [] fruitArray = {"사과", "참외", "딸기", "수박", "포도"};
		for(String fruit : fruitArray) {
			System.out.println(fruit);
		}
		
		
	}

}

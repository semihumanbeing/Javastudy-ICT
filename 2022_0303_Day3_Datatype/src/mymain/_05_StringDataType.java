package mymain;

import java.util.Scanner;

public class _05_StringDataType {
	
	/*
	 문자열 자료형: String
	 문자열: 1개 이상의 문자의 나열된 값
	 //   "ABC" -> 'A' 'B' 'C'
	 상수: "ABC" 
	 출력 서식: %s
	          %ms <- 문자수를 m개만 출력
	 
	 */

	public static void main(String[] args) {
	
		String name = "홍길동";
		String address = "서울시 마포구 서교동 123";
		System.out.println(name+"\n"+address);
		System.out.printf("이름: %s\n" , name);
		System.out.printf("주소: %s\n" , address);
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("이름이 뭐예요?");
		name = scanner.next();
		System.out.printf("%s 라고 합니다.", name);
		
		
		scanner.close();

	}

}
/*
 * 		
		
 */


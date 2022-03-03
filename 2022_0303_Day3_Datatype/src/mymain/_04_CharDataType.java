package mymain;

public class _04_CharDataType {

	/*
	 문자형 자료형 : char (2byte)
	 상수: 'A' '한' '韓'
	 출력서식: %c
	 
	 ASCII 통신문자코드: 0~126
	 0~31: 통신 및 제어문자
	 32~126: 키보드 상 문자 코드
	 'A' : 65
	 'a' : 97 (소-> 대문자 간격: 32)
	 '0' : 48
	 '1' : 49
	 
	 \r: carrige return(home)
	 \n: new line(enter)
	 \t: tap key
	 \a: alert(경고음)
	 \f: 다음 장에 출력하기
	 \b: caret의 위치를 이전으로 (<- 키)
	 
	 */
	
	public static void main(String[] args) {
		System.out.printf("%c\n", 'a');
		System.out.printf("%c\n", 65);
		System.out.printf("%c\n", 66);
		System.out.printf("%d\n", (int)'한');
		System.out.printf("%c\n", 54620);
		System.out.printf("A\n%c\n",66);
		System.out.println("A\tB\tC");

	}

}

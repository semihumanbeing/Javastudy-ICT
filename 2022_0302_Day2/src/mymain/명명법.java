package mymain;

public class 명명법 {
	
	public static void main(String[] args) {
		 /*
		 예약어 - 이미 생성된 명령(자료형, 제어문, 기타)
		 사용자정의명칭 - 클래스명, 메소드명, 변수명, 상수명
		 
		
		*/
		System.out.println("--[사용자 정의 명칭 부여시 고려사항]--");
		System.out.println("1. 숫자로 시작하면 안된다.");
		System.out.println("  int 1kor;(x)  int kor1;(o)");
		System.out.println("2. 중간에 공백 띄우면 안된다.");
		System.out.println("  int my money; <- 공백이 있으면 서로 다른 식별자로 본다.");
		System.out.println("  int myMoney(camel case), my_money(snake case)");
		System.out.println("3. 특수문자 사용하면 안된다.");
		System.out.println("  (특수문자: 키보드에서 영문,숫자,한글을 제외한 모든 문자 - @#$%^)");
		System.out.println("4. 예약어는 사용하면 안된다.");
		System.out.println("  void, String, public..");
		
		System.out.println("--[클래스명 명명법]--");
		System.out.println("1. 대문자로 시작한다.");
		System.out.println("2. 두개 이상의 단어가 조합되면 매 단어 첫 글자는 대문자로 작성한다.");
		System.out.println("  class MyProfile <- 파스칼 표기법 or My_Profile <-파스칼+스네이크");
		
		System.out.println("--[메소드명/변수명 명명법]--");
		System.out.println("1. 소문자로 시작한다.");
		System.out.println("2. 두개 이상의 단어가 조합되면 매 단어 첫 글자는 대문자로 작성한다.(camel case)");
		System.out.println("  String myFamilyName ");
		
		// 변수 = 변하는 수
		// 상수 = 변하지 않는 수 final String MYNAME <- 앞에 final을 붙이면 상수가 된다.
		System.out.println("--[상수 명명법]--");
		System.out.println("1. 모두 대문자로 기록");
		System.out.println("2. 두개 이상의 단어가 조합되면 snake 표기법을 사용한다.");
		System.out.println("  final String MY_NAME");
		System.out.print("\"Math.PI\"= ");
		System.out.println(Math.PI);
		System.out.print("\"Byte.MAX_VALUE\"= ");
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println("패키지명은 보통 소문자로 사용한다.");
	}

}

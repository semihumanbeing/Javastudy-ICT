package mymain;

public class MyMain_String4 {

	public static void main(String[] args) {
		// 문자열 기능
		String socialSecurityNubmer = "960312-2222222";
		
		// 문자열의 길이 구하기
		int length= socialSecurityNubmer.length();
		System.out.printf("총 길이: %d",length);
		System.out.println();
		
		// 문자열 중에서 문자(char) 1개 추출하기
		char gender = socialSecurityNubmer.charAt(7);
		System.out.println(gender);
		if(gender - '0'%2 ==1) {
			System.out.println("남성");
		} else
			System.out.println("여성");
		
		
		String strYear = socialSecurityNubmer.substring(0,2);
		System.out.println(strYear);
		String strMonth = socialSecurityNubmer.substring(2,4);
		System.out.println(strMonth);
		String strDate = socialSecurityNubmer.substring(4,6);
		System.out.println(strDate);

		// year = "80" 는 문자열의 형태다.
		// 문자열 -> 정수 : integer.parseInt("숫자형문자열")
		// 문자열 -> 실수 : double.parseDouble("숫자형문자열")
		// 문자 -> 정수 : '4' = 4
		
		int year = Integer.parseInt(strYear);
		if(gender =='1' || gender == '2'|| gender == '5'|| gender =='6') {
			year = year + 1900;
		} else if(gender =='3' || gender == '4'|| gender == '7'|| gender =='8') {
			year = year + 2000;
		} else year = year + 1800;
		
		System.out.println(year);
		
		            //012345678901234567890
		String str = "I am tom You are Jane";
		// 'a'의 위치를 알고 싶을 때
		int index = str.indexOf('a');
		System.out.println(index);
		
		// 'tom'의 위치
		int index2 = str.indexOf("tom");
		System.out.println(index2);
		
		// 'a'의 위치를 뒤에서부터 검색
		int index3 = str.lastIndexOf('a');
		System.out.println(index3);
		
		// 문자열 중에 'Jane' 이라는 단어가 있는지 확인
		boolean bOk = str.contains("Jane");
		System.out.println(bOk);
		
		String msg = "[채팅] #길동 #안녕하세요";
		bOk = msg.startsWith("[채팅]");
		System.out.println(bOk);
		
		
		

	}

}

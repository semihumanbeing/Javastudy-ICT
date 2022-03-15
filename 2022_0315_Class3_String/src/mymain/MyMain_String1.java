package mymain;

public class MyMain_String1 {

	public static void main(String[] args) {

		// String 생성방법
		// 문자열 비교
		
		// 암시적 방식
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		
		if(s1 == s2)
			System.out.println("Same");
		else
			System.out.println("Different");
		
		// 명시적 방식
		
		String s3 = new String("Little Star");
		String s4 = new String("Little Star");
		
		if(s3 == s4)
			System.out.println("Same");
		else
			System.out.println("Different");
		
		
		
	}

}

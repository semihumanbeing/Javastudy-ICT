package mymain;

public class MyMain_String2 {

	public static void main(String[] args) {
		
		// 불변적 특징
		
		String str = "abc";
		
		String str1 = str.toUpperCase();
		
		System.out.printf("%s -> %s\n", str, str1);
		// str1은 str을 이용해서 새로운 객체를 만들어낸 것이지 str 의 값을 바꾼것이 아니다.
		
		String msg = "lol babo";
		msg = msg.replaceAll("babo", "****");
		
		System.out.println(msg);
		

	}

}

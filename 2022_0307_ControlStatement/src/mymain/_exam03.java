package mymain;

public class _exam03 {

	public static void main(String[] args) throws Exception {
		// 3번문제
		System.out.println("아무 키나 입력하세요: ");
		int ch = System.in.read();
		
		if ((ch >= 65 && ch <= 90)|| (ch >= 97 && ch <= 122)) 
		{
			System.out.println("알파벳입니다");
		}
		else if (ch == '\n' || ch == '\t'|| ch == '\r'|| ch == ' ')
		{
			System.out.println("공백입니다");
		}
		else if (ch >= '0' && ch <= '9') 
		{
			System.out.println("숫자입니다");
		}

	}

}

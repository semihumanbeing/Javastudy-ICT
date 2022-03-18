package mymain;

public class _exam05 {

	public static void main(String[] args) throws Exception {
		// 5번문제
		
		System.out.println("알파벳 하나를 입력하세요");
		int ch = System.in.read();
		
		if(ch == 'a' || ch == 'A')
		{
			System.out.println("America");
		} else if(ch == 'b' || ch == 'B')
		{
			System.out.println("Belgium");
		} else if(ch == 'c' || ch == 'C')
		{
			System.out.println("Canada");
		} else if(ch == 'd' || ch == 'D')
		{
			System.out.println("Denmark");
		}
		

	}

}

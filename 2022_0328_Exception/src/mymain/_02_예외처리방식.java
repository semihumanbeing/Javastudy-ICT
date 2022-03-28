package mymain;

public class _02_예외처리방식 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 1;
		int res;
		int [] ar = new int[5];
		
		String str = null;
		int len = 0;
		
		
		//java 내부에서 예외가 발생하면 예외를 던진다.
		int index = 10;
		
		if (index<0||index>=ar.length) throw new ArrayIndexOutOfBoundsException("배열범위 벗어났습니다");
		ar[10] = 100;
		
		//일반적인 예외처리형식
		try {
			// 수행해야 할 코드
			if(b==0)throw new ArithmeticException();
			res = a/b;
			len = str.length();
			ar[10]=100;
			
		} catch (ArithmeticException e) {
			//예상되는 에러처리
			e.printStackTrace();
			System.out.println("0으로 나눌수 없습니다");
			
		} catch (NullPointerException e) {
			System.out.println("str is null");
		}

	}

}


public class _01_Method1 {
	
	/*
	 메서드 호출 방식에 따른 분류
	 1. call by name      : 이름만 호출
	 2. call by value     : 이름 + 인자 호출
	 3. call by reference : 이름 + 인자(참조(주소)변수) 호출
	 */
	
	public static void title() {
		System.out.println("-----메서드연습-----");
		//리턴값이 없을때 void 메서드를 쓴다
		return;
	}
	
	public static int plus(int a, int b) {
							// int a = x, int b = y (메서드의 인자는 호출 시 생성된다)
		int c = a+ b;
		return c;
	}

	public static void main(String[] args) {
		
		title();
		
		int x = 10, y = 5, res;
		res = plus(x,y);
		System.out.printf("%d + %d = %d",x, y, res);
		

	}

}

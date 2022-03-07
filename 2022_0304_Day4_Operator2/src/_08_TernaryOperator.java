
public class _08_TernaryOperator {

	public static void main(String[] args) {
		/*
		 * 삼항연산자: 
		 * 형식: 조건 ? 값1(참) : 값2(거짓)
		 */
		// 두 수 중에 큰 수 구하기
		int a = 5;
		int b = 4;
		int c;
		
		c = (a > b) ? a : b;
		
		System.out.printf("%d, %d 중에 큰 수는 %d 입니다\n", a, b, c);
		
		
		// if else 문으로 만들기
		
		if (a > b) {
			c = a;
			System.out.printf("%d, %d 중에 큰 수는 %d 입니다\n", a, b, c);
		} else {
			c = b;
			System.out.printf("%d, %d 중에 큰 수는 %d 입니다\n", a, b, c);
		}
			
		
		System.out.println();
		
		int n = -10;
		int m;
		
		m = (n<0) ? -n : n;
		
		System.out.printf("%d 의 절대값은 %d\n", n, m);
		
		// if else 문으로 만들기
		
		if (n<0) {
			m = -n;
			System.out.printf("%d 의 절대값은 %d\n", n, m);
		}

	}

}

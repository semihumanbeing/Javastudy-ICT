package myutil;

public class MyMath {
	
	//외부에서 객체생성 금지
	private MyMath() {
		
	}
	
	//서비스 객체
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static int hap(int n) {
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum = sum+i;
		}
		return sum;
	}

}

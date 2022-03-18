package myutil;

public class MyMath {
	
	public int plus(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return (b==0) ? 0 : a/b;
	}
	
	public int max(int a , int b) {
		return (a>b) ? a : b;
	}
	
	// 메서드명은 동일하나 인자정보가 틀린 메서드를 중복 메서드라고 한다.
	// Method Overload
	public int sum(int n) {
		int total = 0;
		for(int i=0;i<=n;i++) {
			total = total+i;
		}
		return total;
	}
	
	public int hap(int n, int m) {
		// n까지의 수 중 m의 배수의 합
		int t = 0;
		for(int i = 1; i <=n; i++) {
			if (i%m == 0) {
				t = t+i;	
			}
			}
		return t;
		
		
	}
	
	public double pow(int n, int m) {
		return Math.pow(n, m);
	}
	
	
	public int max3(int a, int b, int c) {
		int maximum;
		int totalmax;
		maximum = (a > b) ? a : b;
		totalmax = (maximum>c) ? maximum : c;
		return totalmax;	
	}

}

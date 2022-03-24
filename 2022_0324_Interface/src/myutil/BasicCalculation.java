package myutil;

public interface BasicCalculation {
	
	// 구성항목: 상수, 추상메서드
	// 1.8버전 이후부터는 default method 를 사용할 수도 있다.
	
	double PI = 3.141592;
	
	public abstract int plus(int a, int b);
	int minus(int a, int b);
	
	// default문으로 선택적인 재정의를 할수 있다.
	int ZERO = 0;
	default int getMinimumNumber() {
		return ZERO;
	}
	

}

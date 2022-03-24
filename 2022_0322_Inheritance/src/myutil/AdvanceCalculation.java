package myutil;

public class AdvanceCalculation extends BasicCalculation {

	// n까지의 합
	public int sum(int n) {
		int sumnum = 0;
		for (int i = 0; i <= n; i++) {
			sumnum = super.plus(sumnum, i);
			// super클래스의 기능을 사용
		}
		return sumnum;
	}

	// n의 m승
	public int pow(int n, int m) {
		int result = 1;
		for (int i = 0; i < m; i++) {
			result = result * n;
		}
		return result;
	}
}

package mymain;

public class _01_고전적방식의예외처리 {
	// Exception

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int res;

		if (b != 0) {// 에러내용 미리 예측
			res = a / b;
		} else
			System.out.println("0으로 나눌 수 없습니다");

		String str = null;
		int len = 1;
		if (str != null) { // 에러내용 미리 예측
			len = str.length();
			
		} else
			System.out.println("str is null");

	}
}

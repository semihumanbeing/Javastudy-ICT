package mymain;

public class _07_Break_1 {

	public static void main(String[] args) {
		
		// break 는 반복문에서만 사용할 수 있는 탈출문이다.
		// break label 은 label영역의 반복문을 탈출한다(JDK 5.0이후부터 지원)
		
		int sum = 0;
		int i = 1;
		while(true) {
			sum = sum+i;
			i++;
			
			if(i>10) break;
		}
		System.out.println(sum);

	OUT_FOR:
	for (int a=1;a<=5;a++) {
		for (int b=1;b<=5;b++) {
			if(a==3 && a==b)break OUT_FOR;
			System.out.printf("[%d, %d] ", a, b);
		}
		System.out.println();
	}
	}
}

package mymain;

public class _02_IntegralDataType {

	public static void main(String[] args) {
		/*
		 정수형 자료형: byte, short, int long -> 기본형: int
		 */
		System.out.println(1);
		
		//100에 대한 각 진수 값 출력
		System.out.printf("10진수: %d\n", 100);
		System.out.printf("16진수: %x\n", 100);
		System.out.printf("8진수: %o\n", 100);
		
		//각진수의 값 -> 10진수로 출력
		System.out.printf("%d\n", 0x64);
		System.out.printf("%d\n", 0144);
		System.out.printf("%d\n", 0xff);
		
		//자릿수 지정해서 출력
		int n = 123;
		
		// %md : m <- 출력자릿수
		System.out.printf("[%10d]\n", n);
		
		// %0md : m <- 출력자릿수 0 <- 빈 공간을 0으로 채워라
		System.out.printf("[%013d]\n", n);
		
		// %-md : -m <- 출력자릿수, 음수 부호는 정렬 left 
		System.out.printf("[%-10d]\n", n);

	}

}

package mymain;

public class _03_FloatingPointDataType {

	public static void main(String[] args) {
		/*
		 실수형 자료형: float double(기본형) <- 소수점이 있는 수
		 상수: 1.0 0.   <-double
		      1.0F     <- float
		      1.0e+2   <- 지수 형태 
		 출력서식: %f    <- 소수점 이하 6자리
		         %e    <- 소수점 이하 6자리
		         %g    <- 자릿수가 적은 쪽으로 출력
		              

		 */
		System.out.println(1.0); // <- double
		System.out.println(1.0F); // <- float
		
		double d = 12.345678912;
		
		System.out.printf("%f\n", d);
		System.out.printf("%e\n", d);
		System.out.printf("%g\n", d);
		
		// %m.nf : m(전체자릿수) n(소숫점이하자릿수)
		// %0m.nf : 0(앞의 자릿수 0으로 채우기)
		// %-m.nf : -(left 정렬)
		
		double pi = Math.PI;
		System.out.println(pi);
		System.out.printf("%f\n", pi);
		System.out.printf("[%10f]\n", pi);
		System.out.printf("[%10.2f]\n", pi);
		System.out.printf("[%010.2f]\n", pi);
		System.out.printf("[%-10.2f]\n", pi);
		

	}

}

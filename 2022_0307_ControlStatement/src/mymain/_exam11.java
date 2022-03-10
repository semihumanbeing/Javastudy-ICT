package mymain;

public class _exam11 {

	public static void main(String[] args) {
		// 11¹ø¹®Á¦
		int i;
		int sign = 1;
		double pi = 0;
		
		
		for(i=0; i<200000000;i++) {
			pi = pi+sign*(4.0/(i*2+1));
			sign = -sign;
		}
		
		System.out.printf("%.16f\n", pi);
		System.out.printf("%.16f",Math.PI);
		
		
		

	}

}

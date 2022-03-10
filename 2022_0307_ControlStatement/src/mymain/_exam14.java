package mymain;

public class _exam14 {

	public static void main(String[] args) {
		//14¹ø¹®Á¦
		
		double result =0.0;
		int n = 1;
		while (n<10) {
			System.out.printf("1.0/%d",n);
			System.out.print((n==9)? '=' : '+');
			
			result = result + (1.0/n);
			n+=2;
		}
		
		System.out.println(result);

	}

}

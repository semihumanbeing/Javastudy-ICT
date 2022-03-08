package mymain;

public class _03_For_3 {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0; i<=10; i++) {
			if (i%3 == 0)
			System.out.println(i);	
			sum = sum + i;
		}
			System.out.printf("10까지의 3의 배수의 합 %d",sum);
			
		System.out.println();
			
		for(int i = 0; i<=10; i+=2) {
			sum = sum + i;
			System.out.println(i);
		}
			System.out.printf("10까지의 짝수의 합 %d",sum);		
		
			
			
	
}
	
	
	
}



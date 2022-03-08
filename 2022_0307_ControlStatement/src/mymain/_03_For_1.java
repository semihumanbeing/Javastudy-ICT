package mymain;

public class _03_For_1 {

	public static void main(String[] args) throws InterruptedException {
		
		String hi = "안녕";
		int i = 1;
		
		for(i = 0; i <3; i++) {
			System.out.print(hi+" ");
			}
		
		System.out.println();
		
		for(i = 3; i > 0; i--) {
			System.out.println(hi+" ");
		}
		System.out.println();

		int sum=0;
		int n = 20;
		
		for(i=1;i<=n;i++) {
			
			System.out.print(i);
			if (i<n) 
			System.out.print("+");
			else 
			System.out.print("=");
			// i 값 누적 시키는 식
			sum = sum + i;

			//Thread.sleep(100);
			
		} System.out.println(sum);
		
	
	
	
	}
		
	}



package mymain;

public class _exam09_10 {

	public static void main(String[] args) {
		//9번문제
		
		int n = 8;
		int sum = 1;
		for(int m = n;m>0;m--)
		{
			sum = sum * m;
			if(n == 0)
			{
				sum = 1;
			}
			
		}
		System.out.printf("%d! = %d",n,sum);
		
		System.out.println();
		
		// 10번문제
		
		int ten;
		int total = 1;
		for (ten=1;ten<=10;ten++)
		{
			if(ten%2==0) 
			{
			total = total * ten;	
			}
			
		}
		System.out.printf("1부터 10까지 짝수의 곱: %d",total);
		

	}

}

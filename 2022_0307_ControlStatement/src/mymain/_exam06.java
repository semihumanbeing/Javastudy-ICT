package mymain;

public class _exam06 {
	public static void main(String[] args) {
		// 6번문제
		
		System.out.println("정상가격\t\t 세일가격\n------------------------");
		
		for(int i = 10000;i<=20000;i+=1000) {
				System.out.printf("%d",i);
				System.out.print("\t\t");
			for(double j = i*0.7;j<=20000;) {
					System.out.printf("%.1f",j);
					System.out.println();
					break;		
		}
		
			}
			
		}
		
		
		
		
		
		
	}



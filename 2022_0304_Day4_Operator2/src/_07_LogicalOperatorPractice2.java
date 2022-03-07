import java.util.Scanner;

public class _07_LogicalOperatorPractice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 윤년/평년 
		 * 윤년 조건 
		 * 1. 400의 배수가 되는 해 
		 * 2. 4의 배수이면서 100의 배수가 아닌 해
		 */ 
		
		int year;
		System.out.printf("년도: ");
		year = scanner.nextInt();
		
		if((year%400 == 0) || (year%4==0 && year%100!=0)) {
		System.out.printf("%d년도는 윤년입니다. \n", year);

		} else {
		System.out.printf("%d년도는 평년입니다. \n", year);
		}
		
			
		
		
		
		scanner.close();

	}

}

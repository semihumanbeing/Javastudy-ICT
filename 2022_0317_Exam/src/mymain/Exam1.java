package mymain;

public class Exam1 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
			
		}
		System.out.println(sum);
		
		int i =1, j= 10;
		do {
			if (i>j) {
				break;
			}
			j--;
		} while(++i <5);
		
		System.out.println("i =" + i + "and j = " + j);
		
		

	}

}

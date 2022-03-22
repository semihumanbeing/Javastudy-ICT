package mymain;

import myutil.AdvanceCalculation;

public class MyMainCalculator {

	public static void main(String[] args) {
		AdvanceCalculation ac = new AdvanceCalculation();

		int a = 10, b = 3, res;
		res = ac.plus(a, b);
		System.out.printf("%d + %d = %d", a, b, res);
		
		System.out.println();
		
		res = ac.sum(a);
		System.out.printf("%d까지의 합: %d",a,res);

	}

}

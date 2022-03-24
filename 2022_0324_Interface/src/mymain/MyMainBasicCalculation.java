package mymain;

import myutil.BasicCalculation;
import myutil.BasicCalculationImpl;

public class MyMainBasicCalculation {

	public static void main(String[] args) {
		System.out.println(BasicCalculation.PI);
		System.out.println();
		
		// 설명서                    설계도
		BasicCalculation bc = new BasicCalculationImpl();
		
		bc.getMinimumNumber();
		int a = 10, b =3, result;
		result = bc.plus(a, b);
		
		System.out.printf("%d + %d = %d", a,b,result);
		
	}

}

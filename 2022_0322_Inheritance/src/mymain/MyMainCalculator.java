package mymain;

import java.util.ArrayList;

import myutil.AdvanceCalculation;
import myutil.BasicCalculation;

public class MyMainCalculator {
	
	static void useBasicCalculation(BasicCalculation bc) {
		// up-casting 발생하여 basicCalculation 의 기능을 사용할 수 있다.
		int x = 10, y = 5, res;
		res = bc.multiply(x, y);
		System.out.printf("%d * %d = %d", x,y,res);
		
		
	}
	
	static void useObject (Object ob) {
		// up-casting 발생하여 obejct 기능만 사용할 수 있다.
		int x = 10, res;
		AdvanceCalculation ac = (AdvanceCalculation) ob; // casting한 모습
		res = ac.sum(x);
		
		System.out.printf("%d까지의 합 = %d",x,res);
		
		
	}

	public static void main(String[] args) {
		AdvanceCalculation ac = new AdvanceCalculation();

		int a = 10, b = 3, res;
		res = ac.plus(a, b);
		System.out.printf("%d + %d = %d", a, b, res);
		
		System.out.println();
		
		res = ac.sum(a);
		System.out.printf("%d까지의 합: %d",a,res);
		
		System.out.println();
		
		// collection : 저장관리객체 <- 자바의 모든 객체 저장
		ArrayList list = new ArrayList(); 
		list.add("Java String Object");
		list.add(10); 
		list.add(true);
		list.add(10.5);
		
		// Wrapper class
		// Integer int -> Integer
		// Integer nOb = 10; 10 -> new Integer(10)
		// Auto-Boxing 
		Integer nOb = 10; //Integer.valueOf(10);  // new Integer(10);
		// Auto-Unboxing
		int n = nOb;
		
		System.out.println(n);
		
		
		Object[] array = {"String", 10, true, 10.5};
		
		String s = (String) array[0];
		System.out.println(s);

	}
	
	
	
	

}

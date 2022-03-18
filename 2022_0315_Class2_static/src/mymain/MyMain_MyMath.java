package mymain;

import myutil.MyMath;

public class MyMain_MyMath {

	public static void main(String[] args) {
		//MyMath mm = new MyMath();
		
		int a = 10, b = 3, result;
		//객체생성 없이 사용가능
		result = MyMath.plus(a, b);
		System.out.println(result);
		
		//2수중 큰수구하기
		result = Math.max(a, b);
		System.out.println(result);
		
		//MyMath mm1 = new MyMath();
		result = MyMath.plus(a, b);
		System.out.println(result);

	}

}

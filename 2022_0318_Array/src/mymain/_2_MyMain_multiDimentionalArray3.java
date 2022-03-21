package mymain;

import myutil.MyArrays2;
import myutil.RotationMethod;

public class _2_MyMain_multiDimentionalArray3 {
	
	// 배열의 초기화는 갯수 생략
	public static void main(String[] args) {
		
	int[][]mm = new int [][] {
		{1,1,1},
		{0,1,0},
		{0,1,0}
	};
	
	int [][]nn = {
			{1,0,0},
			{1,0,0},
			{1,1,1}	
	};
	
	System.out.println("T block");
	MyArrays2.displayBlock(mm);
	
	System.out.println("T block upsidedown");
	int [][]flipupsidedown = RotationMethod.flipUpDown(mm);
	RotationMethod.flipUpDown(flipupsidedown);
	MyArrays2.displayBlock(flipupsidedown);
	
	System.out.println("L block");
	MyArrays2.displayBlock(nn);
	
	System.out.println("L block upsidedown");
	int [][]flipupsidedown2 = RotationMethod.flipUpDown(nn);
	RotationMethod.flipUpDown(flipupsidedown2);
	MyArrays2.displayBlock(flipupsidedown2);

	}

}

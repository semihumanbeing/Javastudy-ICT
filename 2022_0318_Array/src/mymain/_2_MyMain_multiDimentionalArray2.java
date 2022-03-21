package mymain;

import myutil.MyArrays2;

public class _2_MyMain_multiDimentionalArray2 {

	public static void main(String[] args) {
		int [][]mm = new int[3][4];
		
		MyArrays2.fill(mm, 5);
		MyArrays2.displayArray(mm);
		
		System.out.println();
		
		MyArrays2.fill(mm,1,9);
		MyArrays2.displayArray(mm);
		
		System.out.println();
		
		MyArrays2.fill(mm,0,1,9);
		MyArrays2.displayArray(mm);
		
		System.out.println();
		
		MyArrays2.setArray(mm);
		MyArrays2.displayArray(mm);
		
		System.out.println();
		
		
		
	}

}

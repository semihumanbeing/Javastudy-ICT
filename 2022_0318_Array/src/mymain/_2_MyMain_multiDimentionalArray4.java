package mymain;

import myutil.MyArrays;
import myutil.MyArrays2;

public class _2_MyMain_multiDimentionalArray4 {

	public static void main(String[] args) {
		
	// 고정길이배열 : 길이가 동일한 배열
	int[][] mm = new int[3][4];

	// 가변길이배열 : 길이가 서로 다른 배열
	int[][] nn = new int[3][];

	nn[0]=new int[2];
	nn[1]=new int[3];
	nn[2]=new int[4];

	MyArrays2.setArray(nn);
	MyArrays2.displayArray(nn);
	
	//가변길이배열 초기화
	int [][]pp = new int[][] {
		{1,2},
		{3,4,5},
		{6,7,8,9}
	};
	int [][]qq = {
		{1,2},
		{3,4,5},
		{6,7,8,9}
	};
	
	MyArrays2.displayArray(qq);
	
	int [][]rr = new int [3][];
	rr[0] = new int [] {1,2};
	
	
	}
}

package myutil;

public class MyArrays2 {

	public static void setArray(int[][] mm) {
		int number = 1;
		for (int i = 0; i < mm.length; i++) {
			for (int k = 0; k < mm[i].length; k++) {
				mm[i][k] = number++;
			}
		}
	}

	public static void displayArray(int[][] mm) {
		int rows = mm.length;
		int cols = mm[0].length;

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < mm[i].length; k++) {
				System.out.printf("%4d", mm[i][k]);
			}
			System.out.println();
		}
	}

	public static void fill(int[][] mm, int value) {
		for (int i = 0; i < mm.length; i++) {
			for (int k = 0; k < mm[0].length; k++) {
				mm[i][k] = value;
			}
		}
	}

	public static void fill(int[][] mm, int begin, int value) {
		for (int i = 0; i < mm.length; i++) {
			for (int k = 0; k < mm[0].length; k++) {
				mm[begin][k] = value;
			}

		}
	}
	public static void fill(int[][] mm, int begin, int end, int value) {
		for (int i = 0; i < mm.length; i++) {
			for (int k = 0; k < mm[0].length; k++) {
				for(int j=begin;j<=end;j++) {
						mm[begin][k] = value;
				}
			}

		}
	}

	public static void displayBlock(int[][] nn) {
		for (int i=0;i<nn.length;i++) {
			for (int k=0;k<nn[i].length;k++) {
				if(nn[i][k]==1) {
					System.out.print(" бс ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
	}

}

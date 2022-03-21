package myutil;

public class RotationMethod {

	// 오른쪽 90도 회전
	public static int[][] rotate90ToRight(int[][] src) {

		int rows = src.length;
		int cols = src[0].length;
		int[][] dest = new int[rows][cols];

		for (int i = 0; i < cols; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[(rows - 1) - k][i];
			}
		}

		return dest;

	}

	public static int[][] flip(int[][] src) {

		int rows = src.length;
		int cols = src[0].length;
		int[][] dest = new int[rows][cols];

		for (int i = 0; i < cols; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[i][(rows - 1) - k];
			}
		}

		return dest;

	}

	public static int[][] flip2(int[][] src) {
		int rows = src.length;
		int cols = src[0].length;

		int[][] dest = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[k][i];
			}
		}
		return dest;
	}

	public static int[][] flipUpDown(int[][] src) {
		int rows = src.length;
		int cols = src[0].length;

		int[][] dest = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[(rows - 1) - i][k];
			}
		}
		return dest;
	}

	public static int[][] flipDouble(int[][] src) {
		int rows = src.length;
		int cols = src[0].length;

		int[][] dest = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[(rows - 1) - i][(cols - 1) - k];
			}
		}
		return dest;
	}

}

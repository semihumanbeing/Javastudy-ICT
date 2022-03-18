package myutil;

public class MyArrays {

	public static void displayArray(int[] ar) { // 변수명은 아무거나 써도됨
		System.out.print("[");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%2d ", ar[i]);
		}
		System.out.println("]");

	}

	// 모든 요소에 val값으로 채우기
	public static void fill(int[] ar, int value) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = value;
		}

	}

	// 시작-끝 구간 중에 value값을 채우기
	public static void fill(int[] ar, int fromIndex, int toIndex, int value) {
		for (int i = fromIndex; i < toIndex; i++) {
			ar[i] = value;
		}

	}
	
	public static void sortAscending(int[] mr, int fromIndex, int toIndex) {
		for (int i=fromIndex; i<toIndex-1;i++) {
			for(int k=i+1;k<toIndex;k++) {
				if(mr[i]>mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}
		}

	}
	
	//오름차순 정렬(선택정렬)
	
	public static void sortAscending(int[] mr) {
		for (int i=0; i<mr.length-1;i++) {
			for(int k=i+1;k<mr.length;k++) {
				if(mr[i]>mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}
		}
		
	}
	//내림차순 정렬(선택정렬)
	public static void sortDescending(int[] mr) {
			for (int i=0; i<mr.length;i++) {
				for(int k=i+1;k<mr.length;k++) {
					if(mr[i]<mr[k]) {
						int im = mr[i];
						mr[i] = mr[k];
						mr[k] = im;
					}
				}
			}
		
		
		
		
	}

}

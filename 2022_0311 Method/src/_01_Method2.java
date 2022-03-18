import myutil.MyMath;

public class _01_Method2 {

	public static void main(String[] args) {
		
		// 메서드의 사용자
		
		MyMath mm = new MyMath();
		// mm = 창조변수
		// 새롭게 생성된 객체는 heap 에 할당된다
		// 생성된 객체는 메서드를 포함하고있다.
		
		int x = 10, y = 3, z = 13;
		int result;
		
		result = mm.plus(x, y);
		
		System.out.printf("%d + %d = %d\n", x, y, result);
		
		result = mm.minus(x, y);
		
		System.out.printf("%d - %d = %d\n", x, y, result);
		
		result = mm.multiply(x, y);
		
		System.out.printf("%d * %d = %d\n", x, y, result);
		
		result = mm.max(x, y);
		
		System.out.printf("%d 와 %d 중에 큰 수는 = %d\n", x, y, result);
		
		result = mm.sum(x);
		
		System.out.printf("1~%d 까지의 합 = %d\n", x, result);
		
		result = mm.max3(x, y, z);
		
		System.out.printf("%d, %d, %d 중에 큰 수는 = %d\n", x, y, z, result);
		
		result = mm.hap(x, y);
		
		System.out.printf("%d 까지의 수 중 %d의 배수의 합 = %d\n", x, y, result);
		
		result = (int) mm.pow(x, y);
		
		System.out.printf("%d 의 %d승 = %d\n", x, y, result);
		


	}

}

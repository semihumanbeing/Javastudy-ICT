import java.util.Scanner;

public class _Q2 {

	public static void main(String[] args) {
		// ¿Âµµ º¯È¯ ¼·¾¾ -> È­¾¾ 
		// ¼·¾¾ -> È­¾¾ F =(c * 9 / 5) + 32
		// È­¾¾ -> ¼·¾¾ C = (F - 32) * 5 / 9
		
		Scanner scanner = new Scanner(System.in);
		double c = 7;
		double resultF;
		
		double f = 44.6;
		double resultC;
		
		resultF = (c * 9 / 5) + 32;
		resultC = (f - 32) * 5 / 9;
		
		System.out.printf("¼·¾¾ [%.1f] -> È­¾¾ [%.1f] \n", c, resultF);
		System.out.printf("È­¾¾ [%.1f] -> ¼·¾¾ [%.1f] \n", f, resultC);
		
		
		
		
		scanner.close();

	}

}

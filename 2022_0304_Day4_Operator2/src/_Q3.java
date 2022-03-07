import java.util.Scanner;

public class _Q3 {

	public static void main(String[] args) {
		// 몸무게 / (키m * 키m)
		// 저체중 - 20미만 / 정상 - 20-24 / 과체중 - 25-29 / 비만 - 30~
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("몸무게를 입력하세요: ");
		double weight = scanner.nextDouble();
		
		System.out.print("키를 입력하세요: ");
		double heightC = scanner.nextDouble();
		double heightM = heightC / 100.0;
		
		double bmi = weight / (heightM * heightM);
		
		System.out.printf("키: %.1fcm\n", heightC);
		
		if (bmi < 20) {
			System.out.printf("BMI : %.1f [저체중]\n", bmi);
		} else if (bmi > 20 && bmi < 24) {
			System.out.printf("BMI : %.1f [정상]\n", bmi);
		} else if (bmi > 25 && bmi < 29) {
			System.out.printf("BMI : %.1f [과체중]\n", bmi);
		} else if (bmi > 30) {
			System.out.printf("BMI : %.1f [비만]\n", bmi);
		}
			
		
		
		scanner.close();

	}

}

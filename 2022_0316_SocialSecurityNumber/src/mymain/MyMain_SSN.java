package mymain;

import java.util.Scanner;

import myutil.SSN;

public class MyMain_SSN {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String socialSecurityNumber;
		String yn = "y";
		SSN ssn = new SSN();
		
		while(true) {
			System.out.print("주민번호를 입력하세요(xxxxxx-xxxxxxx): ");
			socialSecurityNumber = scanner.next(); // 공백 포함해서 입력 받을 시 nextLine이용
			
			//주민번호를 주민번호 관리 객체에게 전달			
			ssn.setSocialSecuritynumber(socialSecurityNumber);
			
			//부가정보 요청(출생년도, 나이, 성별, 띠, 계절, 간지, 지역코드, 유효성 체크)
			boolean isValid = ssn.isValid();
			boolean isValid2 = ssn.isValid2();
			int year = ssn.getYear();
			int age = ssn.getAge();
			String gender = ssn.getGender();
			String t = ssn.getT();
			String season = ssn.getSeason();
			String local = ssn.getLocal();
			String ganji = ssn.getGanji();
			
			System.out.println("---결과---");
			
			if(isValid2) {
			System.out.printf("출생년도: %d\n",year);
			System.out.printf("나이: %d\n",age);
			System.out.printf("성별: %s\n",gender);
			System.out.printf("띠: %s띠\n",t);
			System.out.printf("태어난 계절: %s\n",season);
			System.out.printf("태어난 지역: %s\n",local);
			System.out.printf("간지: %s\n",ganji);
			} else {
				System.out.println("잘못된 주민번호입니다.");
			}
			
			
			//다시하기?
			System.out.print("다시하기? y/n: ");
			yn = scanner.next();
			if (yn.toUpperCase().equals("Y")==false)break;
			
			
			
			
			
			
		}//end while
		
		scanner.close();
		System.out.println("---the end---");

	}

}

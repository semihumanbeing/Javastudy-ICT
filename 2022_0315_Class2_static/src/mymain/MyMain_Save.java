package mymain;

import myutil.Save;

public class MyMain_Save {

	public static void main(String[] args) {
		
		// static 변수는 객체 생성을 하지 않고도 사용할 수 있다.
		// 양식: class명.변수명 = 값;
		
		Save.rate = 0.2;
		
		Save s1 = new Save("일길동", 1000000);
		Save s2 = new Save("이길동", 2000000);
		Save s3 = new Save("삼길동", 3000000);
		
		System.out.printf("----[이율: %.0f%%]----\n",Save.rate*100);
		s1.display();
		s2.display();
		s3.display();
		
		// static 변수는 공유변수(각 객체가 모두 이용할 수 있다.)
		s1.rate = 0.15;

		System.out.printf("----[이율: %.0f%%]----\n",Save.rate*100);
		s1.display();
		s2.display();
		s3.display();
	}

}

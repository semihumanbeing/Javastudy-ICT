package myutil;

import java.util.Calendar;

/*
 1. 출생년도 주어지면
    :나이   : getAge() 
    :띠    : getT()
    :60갑자 : getGanji()
 */


public class Myinfo {
	
	public int getAge(int year) {
		
		//현재 시스템 날짜구하기
		Calendar c = Calendar.getInstance();
		
		//현재년도 구하기
		int currentYear = c.get(Calendar.YEAR);
		
		
		//나이: 현재년도 - 출생년도 + 1
		int age = currentYear-year+1;
		return age;
		
		
	}
	   //4 5 6  7  8 9 10 11 0 1 2 3 
	   //자 축 인 묘 진 사 오 미 신 유 슬 해
	   //쥐 소 범 토 용 뱀 말 양 원 닭 개 돼
	 public String getT(int year) {
		  int tIndex = year%12;
		  
		  switch(tIndex) {
		  case 0 : return "원숭이";
		  case 1 : return "닭";
		  case 2 : return "개";
		  case 3 : return "돼지";
		  case 4 : return "쥐";
		  case 5 : return "소";
		  case 6 : return "호랑이";
		  case 7 : return "토끼";
		  case 8 : return "용";
		  case 9 : return "뱀";
		  case 10 : return "말";
		  
		  }
		  return "양";	  
	 }
	  		
	   // 10간
	   // 4 5  6 7  8 9 0  1 2  3
	   // 갑 을 병 정 무 기 경 신 임 계
	   // 12지
	   // 4 5  6  7 8 9 10 11 0 1 2  3  
	   // 자 축 인 묘 진 사 오 미 신 유 슬 해
	 public String getGanji(int year) {
		 
	   //2020
	   //2022%10 -> 2
	   //2022%12 -> 6
		  String gan = "";
		  String ji = "";
		  int ganIndex = year%10;
		  int jiIndex = year%12;
		  
		  switch(ganIndex) {
		  case 0 : gan = "경"; break;
		  case 1 : gan = "신"; break;
		  case 2 : gan = "임"; break;
		  case 3 : gan = "계"; break;
		  case 4 : gan = "갑"; break;
		  case 5 : gan = "을"; break;
		  case 6 : gan = "병"; break;
		  case 7 : gan = "정"; break;
		  case 8 : gan = "무"; break;
		  }
		  
		  switch(jiIndex) {
		  case 0 : ji = "신"; break;
		  case 1 : ji = "유"; break;
		  case 2 : ji = "슬"; break;
		  case 3 : ji = "해"; break;
		  case 4 : ji = "자"; break;
		  case 5 : ji = "축"; break;
		  case 6 : ji = "인"; break;
		  case 7 : ji = "묘"; break;
		  case 8 : ji = "진"; break;
		  case 9 : ji = "사"; break;
		  case 10 : ji = "오"; break;
		  case 11 : ji = "미"; break;
		  
		  }
		  
		 
		return gan + ji + "년"; 		  
		  }
	 
	 
	 
	 public double getBMI(double height, double weight) {
		double heightM = height / 100.0;
		double bmi = weight / (heightM * heightM);
		
		 return bmi;
	 }
	 
	 public String getBMIState(double bmi) {
		 
		 	String state = "";
		 	
			if(bmi < 20) {
				state = "저체중";
			} else if (bmi > 20 && bmi < 24) {
				state = "정상";
			} else if (bmi > 25 && bmi < 29) {
				state = "과체중";
			} else if (bmi > 30) {
				state = "비만";
			}
		 return state;
	 }
		 	 
}

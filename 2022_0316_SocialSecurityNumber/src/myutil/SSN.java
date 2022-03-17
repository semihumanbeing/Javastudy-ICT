package myutil;

import java.util.Calendar;

public class SSN {
	
	private String SocialSecuritynumber;

	public String getSocialSecuritynumber() {
		return SocialSecuritynumber;
	}

	public void setSocialSecuritynumber(String socialSecuritynumber) {
		SocialSecuritynumber = socialSecuritynumber;
	}
	
	public String getGender() {
		char gender = SocialSecuritynumber.charAt(7);
		String strGender = "";
		if(gender%2 ==1) {
			strGender = "남성";
			return strGender;
		} else
			strGender = "여성";
			return strGender;
	}
	
	public int getYear() {
		String strYear = SocialSecuritynumber.substring(0,2);
		int year = Integer.parseInt(strYear);
		char gender = SocialSecuritynumber.charAt(7);
		
		if(gender =='1' || gender == '2'|| gender == '5'|| gender =='6') {
			year = year + 1900;
		} else if(gender =='3' || gender == '4'|| gender == '7'|| gender =='8') {
			year = year + 2000;
		} else year = year + 1800;
		
		return year;
		
	}
	public int getAge() {
		Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);
		int age = currentYear - this.getYear() +1;
		return age;
	}
	
	public String getT() {
		  int tIndex = this.getYear()%12;
		  
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
	// 961212-1234560
	// 01234567890123
	public String getLocal() {
		String strLocal = SocialSecuritynumber.substring(8,10);
		int intLocal = Integer.parseInt(strLocal);
		
		if (intLocal >= 0 && intLocal <=8) {
			return "서울";
		} else if (intLocal >= 9 && intLocal <=12) {
			return "부산";
		} else if (intLocal >= 9 && intLocal <=12) {
			return "부산";
		} else if (intLocal >= 13 && intLocal <=15) {
			return "인천";
		} else if (intLocal >= 16 && intLocal <=25) {
			return "경기도";
		} else if (intLocal >= 26 && intLocal <=34) {
			return "강원도";
		} else if (intLocal >= 35 && intLocal <=39) {
			return "충청북도";
		} else if (intLocal >= 40 && intLocal <=47) {
			return "충청남도";
		} else if (intLocal >= 48 && intLocal <=55) {
			return "전라북도";
		} else if (intLocal >= 56 && intLocal <=66) {
			return "전라남도";
		} else if (intLocal >= 67 && intLocal <=80) {
			return "경상북도";
		}
			
		return "경상남도";
		
	}
	
	// 12 1 2 / 3 4 5 / 6 7 8 / 9 10 11
	public String getSeason() {
		String strSeason = SocialSecuritynumber.substring(2,4);
		int intSeason = Integer.parseInt(strSeason);
		String season = "";
		switch(intSeason) {
		case 12 :
		case 1 :
		case 2 : season = "겨울";break;
		case 3 :
		case 4 :
		case 5 : season = "봄";break;
		case 6 :
		case 7 :
		case 8 : season = "여름";break;
		case 9 : 
		case 10 :
		case 11 : season = "가을";
			
		}
		return season;
	}
	
	public String getGanji() {
		  String gan = "";
		  String ji = "";
		  int ganIndex = this.getYear()%10;
		  int jiIndex = this.getYear()%12;
		  
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
		  case 2 : ji = "술"; break;
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
		return String.format("%s%s년", gan,ji); 		  
		  }
	//            01234567890123
	//            801212-1212121
	//			  234567 892345
	public boolean isValid() {
		int sum = 0;
		sum = sum +(SocialSecuritynumber.charAt(0)-'0')* 2;
		sum = sum +(SocialSecuritynumber.charAt(1)-'0')* 3;
		sum = sum +(SocialSecuritynumber.charAt(2)-'0')* 4;
		sum = sum +(SocialSecuritynumber.charAt(3)-'0')* 5;
		sum = sum +(SocialSecuritynumber.charAt(4)-'0')* 6;
		sum = sum +(SocialSecuritynumber.charAt(5)-'0')* 7;
		// '-' 건너뛰기
		sum = sum +(SocialSecuritynumber.charAt(7)-'0')* 8;
		sum = sum +(SocialSecuritynumber.charAt(8)-'0')* 9;
		sum = sum +(SocialSecuritynumber.charAt(9)-'0')* 2;
		sum = sum +(SocialSecuritynumber.charAt(10)-'0')* 3;
		sum = sum +(SocialSecuritynumber.charAt(11)-'0')* 4;
		sum = sum +(SocialSecuritynumber.charAt(12)-'0')* 5;
		
		
		sum = sum%11;
		sum = 11-sum;
		sum = sum%10;
		
		int lastNo = (SocialSecuritynumber.charAt(13)-'0');
		
		
		
		return (sum==lastNo);
	}
	
	public boolean isValid2() {
		int sum = 0;
		int number = 2;
		for(int i = 0; i<=12; i++) {
			if (i==6) continue;
			
			sum = sum +(SocialSecuritynumber.charAt(i)-'0')* number;
			number++;
			if(number >9) number =2;	
		}
		
		sum = (11-(sum%11))%10;
		
		int lastNo = (SocialSecuritynumber.charAt(13)-'0');
		
		return (sum==lastNo);
	}

}

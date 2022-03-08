package mymain;

public class _04_While_3_Keyboard {

	public static void main(String[] args) throws Exception {
		//키보드 표준장치명: System.in
		
		int ch;
		
		int count = 0;
		int uppercase = 0;
		int lowercase = 0;
		int countNumber = 0;
		int countWhite = 0;
		int countElse = 0;
		
		
		System.out.println("값을 입력하세요: \n(종료: ctrl+z)");
		while(true) {
			
			ch = System.in.read();
			
			if(ch==-1) break;
			if(ch >= 'A' && ch <='Z') {
				uppercase++;
			} else if(ch >= 'a' && ch <='z') {
				lowercase++;
			} else if(ch >= '0' && ch <='9') {
				countNumber++;
			} else if(ch == '\n' || ch == '\r' || ch =='\t' || ch == ' ') {
				countWhite++;
			} else {
				countElse++;
			}
			
			
			System.out.printf("%c",ch);
			count++;
		} 
		System.out.printf("입력한 문자수: %d\n", count);
		System.out.printf("입력한 대문자 수: %d\n", uppercase);
		System.out.printf("입력한 소문자 수: %d\n", lowercase);
		System.out.printf("입력한 숫자 수: %d\n", countNumber);
		System.out.printf("입력한 공백 수: %d\n", countWhite);
		System.out.printf("입력한 기타 수: %d\n", countElse);
		System.out.println("--end--");
	}

}

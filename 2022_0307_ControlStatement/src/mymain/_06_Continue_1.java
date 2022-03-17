package mymain;

public class _06_Continue_1 {

	public static void main(String[] args) {
		
		// continue: 현재 명령을 종료하고 반복문의 다음 제어식으로 이동하기
		// continue label: 현재 명령을 종료하고 label 영역 반복문의 다음 제어식으로 이동하기
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if (i%2==0) continue;// 짝수면 건너뛰기
			
			sum = sum + i;
		}
		System.out.printf("10까지의 홀수의 합: %d",sum);
		
		System.out.println();
		
		//2중 for문에 continue label 붙이기
		// label을 달아둔 곳으로 바로 이동하기 때문에 다음 k++로 이동한다.
		
		OUT_FOR: //label 붙이기
		for(int k =1;k<=5;k++)	{
		for(int i = 1; i<=5; i++){
			if (k==i) {
				System.out.println();
				continue OUT_FOR;
			}
			System.out.printf("[k:%d, i:%d] ",k,i);
		}
		System.out.println();
	}
	
		
		

	}

}

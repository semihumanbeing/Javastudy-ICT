package mymain;

public class _Q01 {

	public static void main(String[] args) {
		
		// 별로 사각형 만들기
		for(int k = 1; k<=5; k++) {
		for(int i = 1; i<=5;i++) {
			System.out.print("* ");
		}
		System.out.println();
		}
		
		System.out.println("-- 삼각형 1 --");
		
		// 별로 삼각형 만들기
		for(int i = 1; i<=5; i++){//열 {
			for(int k = 1; k<=5;k++){//행 
			if(k<=i) {
			System.out.print("* "); 
			} else System.out.print(" ");
				
			}
			System.out.println();
		}
		
		System.out.println("-- 삼각형 2 --");
		
		// 별로 삼각형 만들기
		for(int i = 1; i<=5; i++){//열 {
			for(int k = 1; k<=5;k++){//행 
			if(k>=i) {
			System.out.print("* "); 
			} else System.out.print("  ");
				
			}
			System.out.println();
		}
		
		System.out.println("-- 삼각형 3 --");
		
		// 별로 삼각형 만들기
		for(int i = 1; i<=5; i++){//열 {
			for(int k = 1; k<=5;k++){//행 
			if(k>=6-i) {
			System.out.print("* "); 
			} else System.out.print("  ");
				
			}
			System.out.println();
		}
				
		System.out.println("-- 바람개비 --");
		
		// 별로 바람개비 만들기
		for(int i = 1; i<=5; i++){//열 {
			for(int k = 1; k<=5;k++){//행 
			if(i==k || i==6-k) {
			System.out.print("  "); 
			} else System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		
	}


	}



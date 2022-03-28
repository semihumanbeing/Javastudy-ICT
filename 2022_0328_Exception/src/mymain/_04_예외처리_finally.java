package mymain;

import java.io.FileReader;

public class _04_예외처리_finally {
	
	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			fr = new FileReader("a.txt");
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
		
		} finally {
			System.out.println("finally");
			
		}
	}

}

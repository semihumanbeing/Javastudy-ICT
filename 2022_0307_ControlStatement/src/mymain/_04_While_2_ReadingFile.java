package mymain;

import java.io.FileReader;

public class _04_While_2_ReadingFile{

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("a.txt"); //열기
		
		int ch;
		while(true) {
			ch = fr.read();//문자 1개 읽어오기
			if(ch == -1)break; // -1은 파일의 끝(EOF)을 의미한다. 
			
			System.out.printf("%c",ch);
			
		//	Thread.sleep(100);
		}
		
		fr.close();//닫기

	}

}

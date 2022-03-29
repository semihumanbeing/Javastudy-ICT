package mymain.input;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _02_FileInputTest2 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("src/mymain/input/_02_FileInputTest.java");
		// 파일 입력 시에도 인풋스트림으로 입력하기 때문에 코드는 전부 똑같다.
		
		// 문자스트림으로 필터링하기
		InputStreamReader isr = new InputStreamReader(is);
		
		int ch;
		while(true) {
			ch = isr.read();
			if(ch ==-1) break;
			System.out.printf("%c", ch);
		}
		is.close();
		
	}

}

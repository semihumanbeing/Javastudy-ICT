package mymain.input;

import java.io.IOException;
import java.io.InputStream;

public class _01_KeyboardInputTest {

	public static void main(String[] args) throws IOException {
		int ch;
		InputStream is = System.in;
		
		System.out.println("종료하려면 ctrl + z");
		
		while(true) {
			// 키보드 버퍼로부터 1byte읽어오기
			ch = is.read();
			
			if(ch ==-1) break;
			System.out.printf("%c",ch);
		}

	}

}

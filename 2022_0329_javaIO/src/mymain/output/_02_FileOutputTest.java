package mymain.output;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class _02_FileOutputTest {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("a.txt");
		
		os.write(65);
				
		//printstream필터
		PrintStream out = new PrintStream(os);
		out.println("하하하");
		int age = 20;
		String name = "홍길동";
		
		out.printf("이름 %s ", name);
		out.printf("나이 %d ", age);
		
		
				
		
		
		os.close();
	}

}

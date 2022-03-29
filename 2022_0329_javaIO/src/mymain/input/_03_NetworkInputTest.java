package mymain.input;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class _03_NetworkInputTest {

	public static void main(String[] args) throws Exception {
		String strUrl = "https://www.naver.com/";
		
		URL url = new URL(strUrl);
		// 현재 연결된 서버로부터 데이터를 읽어올 수 있는 InputStream
		InputStream is = url.openStream(); 
		// charStream으로 필터씌우기
		InputStreamReader isr = new InputStreamReader(is,"utf-8");
		// bufferedReader 필터(한줄씩 수신되고 엔터는 생략하기때문에 println을 사용해야한다.)
		BufferedReader br = new BufferedReader(isr);
		
		int ch;
		//int count=1;
		while(true) {
			/*
			 * count ++; if(count>1000)break;
			 */
			//ch = isr.read();
			//if(ch ==-1) break;
			//System.out.printf("%c", ch);
			
			String readStr = br.readLine();
			if(readStr == null) break;
			System.out.println(readStr);
			
		}
	}

}

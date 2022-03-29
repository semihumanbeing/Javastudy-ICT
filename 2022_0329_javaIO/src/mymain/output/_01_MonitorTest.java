package mymain.output;

import java.io.OutputStream;

public class _01_MonitorTest {

	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		os.write(65);
		String msg = "안녕";
		byte [] msgByte = msg.getBytes();
		os.write(msgByte);
		
		int n = 123;
		String s = String.valueOf(n);
		byte[] nbyte = s.getBytes();
		os.write(nbyte);
		
		os.flush(); // 출력buffer 내용을 모니터로 보내기

	}

}

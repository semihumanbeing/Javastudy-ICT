package mymain.echo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws Exception {
		
		//서버가 먼저 실행된 다음에 클라이언트 서버가 실행되어야한다.
		// 1. 접속요청 local host <- 내부IP
		Socket client = new Socket("localhost", 7000);
		System.out.println("클라이언트 연결성공");
		
		// 2. 전송 수신 스트림을 얻어온다 
		OutputStream output = client.getOutputStream();//데이터전송
		InputStream input = client.getInputStream();//데이터수신
		
		// 3. 메시지 전송 -> 서버 4.번으로
		String message = "hehe";
		// String에서 Byte로 변환
		output.write(message.getBytes());
		
		// 4. 서버에서 전송된 데이터 수신
		byte[] buffer = new byte[100];
		int length = input.read(buffer);
		String receivedMessage = new String(buffer,0,length);
		
		System.out.printf("클라이언트 에코메시지: %s", receivedMessage);
		
		

	}

}

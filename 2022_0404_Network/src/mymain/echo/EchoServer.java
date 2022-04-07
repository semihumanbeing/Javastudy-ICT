package mymain.echo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws Exception {
		//서버 소켓을 만들고 대기하고 있다 연결이 들어오면 메시지를 에코형태로 전달
		
		// 1. 서버 소켓 생성
		ServerSocket server = new ServerSocket(7000);
		
		// 2. 접속대기
		System.out.println("서버 접속 대기중");
		Socket child = server.accept();
		
		// 3. 송수신 입출력 스트림
		OutputStream output = child.getOutputStream();//데이터전송
		InputStream input = child.getInputStream();//데이터수신
		
		// 4. 데이터 수신
		byte[] buffer = new byte[100];
		int length = input.read(buffer); // 동기메서드
		// length - 수신된 데이터 길이
		// 만약 클라이언트에서 데이터가 들어오지 않으면 데이터가 들어올때까지 기다린다
		//System.out.println(length);
		// buffer에 저장된 값과 데이터의 길이를 지정하여 String으로 변환한다.
		String readData = new String(buffer,0,length);
		System.out.printf("수신데이터: %s\n", readData);
		
		// 5. 클라이언트에게 재전송 -> 클라이언트 4번으로
		output.write(readData.getBytes());
		
	}

}

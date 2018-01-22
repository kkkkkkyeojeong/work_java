package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class BasicClientSocket {
	
	public static void main(String[] args) {
		
		try {							// 내 컴퓨터에 접속시 사용 (= Local Host)/내부->내부 접속 시
			Socket mySocket = new Socket("127.0.0.1", 7070);
			System.out.println(">> 서버 접속에 성공했습니다.");
			
			// 서버 소켓에 스트림을 연결
			BufferedReader in = 	// ->(Chain Stream) 
					new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			PrintWriter out = 		// ->(Chain Stream) 
					new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));
				
			// 서버 소켓에 메시지 전송
			String msg = "안녕하세요? 클라이언트입니다.";
			out.println(msg);
			out.flush();
			System.out.println("[클라이언트] " + msg);
			
			// 서버 소켓으로부터 받은 메시지를 화면에 출력
			System.out.println("[서버] " + in.readLine());
			
			// 서버소켓 종료
			mySocket.close();
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
	}

}

package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BasicServerSocket {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(">> 서버를 시작합니다.");
			ServerSocket myServerSocket;
			myServerSocket = new ServerSocket(7070);	// 7070 포트번호(프로그램의 유일한 값)
			System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다.");
			
			// 클라이언트 접속 때까지 대기
				// 연결 시 클라이언트socket 가지게 됨
			Socket mySocket = myServerSocket.accept();
			System.out.println(">> 클라이언트가 접속에 성공했습니다.");
			
			// 클라이언트 소켓에 스트림을 연결
			BufferedReader in =	// ->(Chain Stream) 
					new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			PrintWriter out = 	// ->(Chain Stream) 
					new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));
			
			// 클라이언트 소켓으로부터 받은 메시지를 화면에 출력
					// readLine() -> 입력받기 전까지 이부분에서 멈춰있음 
			System.out.println("[클라이언트] " + in.readLine());
			
			// 클라이언트 소켓에 메시지 전송
			String msg = "서버에 접속하신 것을 환영합니다!";
			out.println(msg);
			out.flush();		// PrintWriter 이용할때 다 보내지 못하고 남은 메시지 전부 보내줌 
			System.out.println("[서버] " + msg);
			mySocket.close();
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	
		
		
		
	}

}

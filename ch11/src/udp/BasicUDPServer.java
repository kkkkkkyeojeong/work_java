package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class BasicUDPServer {

	DatagramSocket dsock;			// 서버와 클라이언트 연결 
	DatagramPacket sPack, rPack;	// 정보를 주고받기 위한 것 
	InetAddress client;
	int sport = 7777, cport;

	public BasicUDPServer(int sport) {
		try {
			this.sport = sport;
			System.out.println(">> 서버를 시작합니다.");
			System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다." + '\n');
			this.dsock = new DatagramSocket(sport);
		} catch (SocketException e) {
			System.out.println(e);
		}
	}

	public void communicate() {
		// 키보드로부터 전송할 문자열을 입력받기 위해 BufferedReader 형태로 변환 
		// Chain Stream 
		// InputStreamReader : 1byte씩 읽어들인걸 2byte로 바꿔줌 
		// BufferedReader : 만약 10byte 설정시 10byte씩 읽어들임 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
				// 정보를 받을 준비
				byte[] buffer = new byte[1024];		// 1 kilo byte
				
				// 클라이언트에서 전송되는 DatagreamPacket을 받기 위해 rPack 생성한 후 대기
				this.rPack = new DatagramPacket(buffer, buffer.length);
				this.dsock.receive(rPack);	// 클라이언트에서 메시지가 올때까지 대기 
				// rPack: 클라이언트가 보낸 정보가 담김 

				// 전송받은 결과를 문자열로 반환
				// String(byte[] bytes(배열), offset(어디서부터 사용할건지), length)
				// 배열 0번재부터 배열의 길이 전부다 사용한다는 뜻 
				String strIn = new String(rPack.getData(), 0, rPack.getData().length);

				// 정보를 보내 온 클라이언트의 주소와 포트번호를 반환
				client = rPack.getAddress();
				cport = rPack.getPort();

				// 전송받은 결과를 출력하고 quit이면 종료
				System.out.println("[클라이언트" + client + ": " + cport + "]" + strIn);
				if(strIn.trim().equals("quit")) {
					break;
				}

				// 표준입력으로 입력된 정보를 DatagramPacket으로 만들어 클라이언트에 전송
				String strOut = br.readLine();
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);
				dsock.send(sPack);
			}
			System.out.println("UDP 서버를 종료합니다.");

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		BasicUDPServer client = new BasicUDPServer(7777);
		client.communicate();
	}
}

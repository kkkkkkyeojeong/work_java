package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddress {
	
	InetAddress ip;
	
	public MyInetAddress(InetAddress ip) {
		this.ip = ip;
	}
	
	public void setInetAddress(InetAddress ip) {
		this.ip = ip;
	}

	public  void printInfo() {
		System.out.println(ip.getHostName());		// 컴퓨터이름
		System.out.println(ip.getHostAddress());	// 컴퓨터 ip 주소
		System.out.println(ip.toString());
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(InetAddress.getByName("www.youtube.com"));
			MyInetAddress inet = new MyInetAddress(InetAddress.getLocalHost());		// 현재 컴퓨터의 Host 호출
			inet.printInfo();
			inet.setInetAddress(InetAddress.getByName("www.infinitybooks.com"));
			inet.printInfo();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

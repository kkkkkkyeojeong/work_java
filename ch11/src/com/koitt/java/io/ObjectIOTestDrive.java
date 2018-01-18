package com.koitt.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// 객체 입출력 
public class ObjectIOTestDrive {

	public static void main(String[] args) {

		// 출력 
		// 파일에 저장할 객체 생성
		Person p1 = new Person("홍길동", "서울", 30);
		Person p2 = new Person("홍길자", "인천", 25);
		Person p3 = new Person("홍길순", "부산", 38);

		// 1. Connection Stream, Chain Stream 생성
		ObjectOutputStream oos = null;	// Chain Stream 
		FileOutputStream fos = null;	// Connection Stream
		
		try {
			// person.dat 파일을 Destination으로 지정 
			fos = new FileOutputStream("person.dat");	// Connection Stream
			oos = new ObjectOutputStream(fos);			// Chain Stream 

			// Connection Stream 이용해서 객체들을 개울가에 띄워 올림 
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.writeObject(null);		// 더 이상 띄워 올릴 객체가 없다라는 뜻

			// writeObject 메소드가 ObjectOutputStream과 FileOutputStream을 거쳐 person.dat 까지 객체를 보냄
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}	
		finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("객체 정보를 파일에 저장완료 했습니다.");
		
		// *******************************************************************
		// 입력
		
		FileInputStream fis = null;		// Connection Stream
		ObjectInputStream ois = null;	// Chain Stream 
		
		try {
			fis = new FileInputStream("person.dat");	// Connection Stream
			ois = new ObjectInputStream(fis);			// Chain Stream 	
			
			// 객체 정보 하나씩 불러와서 출력 
			Object item = null;
			// 출력시 맨 마지막 입력값이 null이기 때문에 빠져나옴 -> oos.writeObject(null);	
			// readObject() 는 객체를 하나씩 불러와서 item에 저장함 
			while((item = ois.readObject()) != null) {
				System.out.println(item);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}

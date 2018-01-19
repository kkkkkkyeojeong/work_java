package com.koitt.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOTestDrive2 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("music.mp3");
			fos = new FileOutputStream("music-copy.mp3");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			// 현재시간을 밀리초로 뽑아옴
			long startTime = System.currentTimeMillis();
			System.out.println("복사 시작 >>> ");
			
			// 100byte 씩 파일을 읽어들임
			byte[] buffer = new byte[100];
			while ((bis.read(buffer)) != -1) {
				bos.write(buffer);
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("복사 종료 >>> ");
			
			System.out.println("복사 소요시간 >>> " + (endTime - startTime) + " ms");
			
			// Chain Stream -> Connection Stream 순으로 닫아줌
			bos.close();
			bis.close();
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

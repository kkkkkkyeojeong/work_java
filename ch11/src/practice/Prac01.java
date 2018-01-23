package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prac01 {

	public static void main(String[] args) {

		int data;

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		String inFname = "src/practice/Prac01.java";		// 원본 파일경로
		String outFname = "src/practice/Prac01.num";		// 앞으로 생성할 파일경로

		try {
			// 읽을 파일 이름으로 FileInputStream 생성
			fis = new FileInputStream(inFname);
			// 새로 만들 파일 이름으로 FileOutputStream 생성
			fos = new FileOutputStream(outFname);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			while ((data = bis.read()) != -1) {
				bos.write(data);
				
			}
			System.out.println(outFname + " : 파일이 생성되었습니다.");
			
			fis.close();
			fos.close();
		
		}
		catch (IOException e) {
			System.out.println(e);
		}

	}



}


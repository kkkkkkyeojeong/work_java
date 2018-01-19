package basicio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFiles {
	
	public static void main(String[] args) {
		int data;
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		String inFname = "src/basicio/WriteFiles.java";		// 원본 파일경로
		String outFname = "src/basicio/WriteFiles.back";	// 앞으로 생성할 파일경로
		
		try {
			// 읽을 파일 이름으로 FileInputStream 생성
			fis = new FileInputStream(inFname);
			// 새로 만들 파일 이름으로 FileOutputStream 생성
			fos = new FileOutputStream(outFname);
			
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println(outFname + " : 파일이 생성되었습니다.");
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // end main

}

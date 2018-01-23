package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {

		// 파일을 객체화
		File originFile = new File(args[0]);	// 원본파일
		File copyFile = new File(args[1]);		// 앞으로 새로 생성되는 파일

		try {
			// Connection Stream
			FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			
			int data = -1;
			
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}

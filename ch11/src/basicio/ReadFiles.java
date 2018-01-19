package basicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {

	public static void main(String[] args) {
		int data;

		// 읽을 파일 이름지정
		String fname = "src/basicio/ReadFiles.java";

		FileInputStream fis = null;

		try {
			// 읽을 파일 이름으로 FileInputStread 생성
			// FileInputStream -> Connection Stream, 1byte 씩 읽어 들인다.
			fis = new FileInputStream(fname);
			// 한 바이트씩 읽어 문자로 변환하여 출력
			while((data = fis.read()) != -1) {
				char c = (char) data;
				System.out.print(c);
			}			
		}
		catch (FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다. : " + fname);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}

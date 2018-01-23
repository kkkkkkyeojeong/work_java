package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Prac02 {

	public static void main(String[] args) {

		int data;

		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;


		try {
			fis = new FileInputStream("dddd.jpg");
			fos = new FileOutputStream("dddd-copy.jpg");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			while((data = bis.read()) != -1) {		// read() 는 int 리턴타입 
				System.out.print((char)data);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}

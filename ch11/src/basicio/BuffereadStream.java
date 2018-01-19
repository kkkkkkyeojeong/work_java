package basicio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BuffereadStream {

	public static void main(String[] args) {

		FileOutputStream fos;		// Connection Stream(Source 또는 Destination에 직접 연결)
		BufferedInputStream bis;	// Chain Stream(Source 또는 Destination에 직접 연결 불가능, Connection Stream에 연결)
		BufferedOutputStream bos;	// Chain Stream
		String fname = "src/basicio/test.buff";

		try {
			// 새로 만들 파일 이름으로 FileOutputStream 생성
			fos = new FileOutputStream(fname);
			bos = new BufferedOutputStream(fos);
			byte data[] = {'A', 'B', 'C', 'D', 'E'};

			// 출력
			// 한 바이트씩 읽어 FileOutputStream 으로 출력
			bos.write(data, 0, 5);		// 0: 시작점, 5: length => data index중 0번재부터 5개를 사용하겠다.
			bos.close();
			fos.close();
			System.out.println(fname + " : 파일이 생성되었습니다.");

			// 입력
			// 읽을 파일 이름으로 FileInputStream 생성
			bis = new BufferedInputStream(new FileInputStream(fname));		// bis만 close()해도 FileInputStream() 같이 close 됨
			data = new byte[10];
			bis.read(data, 0, 10);		// byte로 읽어들여 숫자로 출력됨
			bis.close();
			System.out.println(Arrays.toString(data));
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) { 
			System.out.println(e);
		}
	}
}

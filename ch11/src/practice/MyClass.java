package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass {
	
	public static void main(String[] args) {
		
		try {
			// Connection Stream
			FileReader fr = new FileReader("src/practice/MyClass.java");
			FileWriter fw = new FileWriter("src/practice/MyClass.num");
			// Chain Stream
			BufferedReader br = new BufferedReader(fr);	// 입력
			BufferedWriter bw = new BufferedWriter(fw);	// 출력
			
			String data;
			for(int i = 1; (data = br.readLine()) != null; i++) {
				bw.write(i + " " + data + '\n');
			}
			
			br.close();
			bw.close();
			fr.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

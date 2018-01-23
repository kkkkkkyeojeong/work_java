package practice;

import java.io.File;

public class Prac03 {

	public static void main(String[] args) {
		
		// practice 폴더를 상위폴더로 객체생성 
		String fname = "src/practice";
		File f = new File(fname);
		
		System.out.println("폴더 경로: " + f.getPath());
		
		// practice 폴더에 있는 파일을 담을 배열 생성 
		File[] files2 = f.listFiles();
		
		// 파일을 하나씩 가져오기 
		for (File a : files2) {
			String str = a.getName();
			//System.out.println(str);
			
			if(a.isDirectory()) {
				System.out.println("하위 폴더: practice." + str);
			}
			else {
				System.out.println("하위 파일: " + str);
			}
		}
	
	}
	
}

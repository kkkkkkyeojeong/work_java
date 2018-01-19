package basicio;

import java.io.File;
import java.util.Date;

public class FileInfo {
	
	public static void main(String[] args) {
		
		// 읽을 파일 이름 지정
		String fname = "src/basicio/FileInfo.java";
		
		// File 객체 생성
		File f = new File(fname);		// 실제 파일을 객체화 
		
		System.out.println("파일 " + f.getName() + " 정보 >>> ");
		System.out.println();
		System.out.println("\t경로 : " + f.getPath());
		System.out.println("\t절대경로 : " + f.getAbsolutePath());
		System.out.println("\t부모 : " + f.getParent());
		System.out.println("\t쓰기여부 : " + f.canWrite());	// 파일 속성에서 읽기전용 여부 
		System.out.println("\t읽기여부 : " + f.canRead());		
		System.out.println("\t폴더여부 : " + f.isDirectory());
		System.out.println("\t수정일: " + new Date(f.lastModified()));
		System.out.println("\t파일크기 : " + f.length() + " 바이트");
	}
}

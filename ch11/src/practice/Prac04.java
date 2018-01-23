package practice;

import java.io.File;

public class Prac04 {
							// 명령행
	public static void main(String[] args) {
		
		// 명령행에서 폴더명을 입력받아 File 객체화 
		File f = new File(args[0]);
		
		// 폴더 생성여부 결과 리턴 
		boolean isMake = f.mkdir();
		
		if(isMake) {
			System.out.println("폴더가 생성되었습니다.");
		}
		else {
			System.out.println("폴더 생성 실패했습니다.");
		}
		
	}
	
	/*
	 * 현재 폴더 기준 
	 * 이클립스에서 실행: 프로젝트 최상위 폴더(src 폴더가 기준이 됨 ) -> Run as ->  Run Configurations에서 실행 
	 * cmd에서 실행: 현재 실행한 폴더가 현재 폴더 -> 맨위 패키지 주석처리 후 해당폴더로 가서 shift + 오른쪽 -> 여기서 명령창 열기 
	 */
	

}

package com.koitt.java.ch07;

public class StringInfo {
	public static void main(String[] args) {
		String snum = "20123458";
		
		// 생성자 오버로딩 
		String name = new String("김경석");
		String dept = new String(new char[] {'컴', '퓨', '터', '학', '과'});		// 전부 합하여 String 타입으로 변수에 저장됨 
		String java = new String("java");
		
		System.out.printf("%d ", snum.compareTo("20123458"));	// snum 값과 틀린곳이 없기 때문에 0 출력 
		System.out.printf("%d %n", snum.compareTo("20123456"));	// 한글자씩 비교하다가 틀린부분 차이 출력 (문자(8) - 문자(6) = 2) 2출력됨 / 틀린부분 처음 발견되면 끝남 
		System.out.printf("%s ", name);							
		System.out.printf("%s ", name.replace('김', '강')); 		// 김 -> 강으로 변경하여 출력
								// name = name.replace('김', '강');  적용해야 변수값 완전히 변경됨 
		System.out.printf("%s %n", name);		
		System.out.printf("%s ", dept);			
		System.out.printf("%s ", dept.substring(0, 3));			// (0)컴(1)퓨(2)터(3)학(4)과(5) 칸마다 값 부여함, 0-3까지 글자 출력 
		System.out.printf("%d %n", dept.length());
		System.out.printf("%s ", java.indexOf('a'));			// 글자 a의 위치를 찾음 - 첫번째 글자만 찾음 
		System.out.printf("%s ", java.concat(" language"));		// 일시적으로 글자 뒤에 붙여서 출력됨  
		System.out.printf("%s ", java.replace('j', 'J'));		// 모든 j를 대문자 J로 변경 
		System.out.printf("%s ", java.toUpperCase());
		System.out.printf("%b ", java.equals("java"));			// 글자비교 대소문자도 비교됨 
		System.out.printf("%s ", java.equalsIgnoreCase("JAVA"));	// 대소문자 구분없이 비교 
		System.out.printf("%s %n", java.substring(1));			// 입력된 숫자 부분부터 출력 
		
	}

}

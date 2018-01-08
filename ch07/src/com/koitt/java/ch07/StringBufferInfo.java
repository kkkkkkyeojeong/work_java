package com.koitt.java.ch07;

public class StringBufferInfo {
	
	public static void main(String[] args) {
		StringBuffer pg = new StringBuffer("Java"); 	// 용량 16
		
		System.out.println(pg.capacity());		// 배열 크기
		System.out.println(pg.append(" language"));			// 문자열 추가 
		System.out.println(pg.insert(5,  "programming "));	/* 배열크기 확인후 programming 들어가기에 배열이 작으면 배열의 크기가 두배로 자동으로 늘어남
															   5 -> 배열의 5번째 부터 문자 입력됨 */		
		System.out.println(pg.capacity());		
		System.out.println(pg);
		System.out.println(pg.replace(0, 4, "Objective-C"));		// 0~4번째 칸까지 문자열 대체 (칸 밀리면서 추가됨) 
		System.out.println(pg.substring(0, 9));						// 0~9번째 칸까지 출력 (0)O(1)b(2)j(3)e(4)c(5)t(6)i(7)v(8)e(9)
		System.out.println(pg);
		System.out.println(pg.charAt(10));				// 10번째 문자 출력 
		pg.setCharAt(10, 'D');							// 10번째 문자를 D로 대체 
		System.out.println(pg);				
	}

}

package com.koitt.java.ch07;

public class WrapperInteger {

	public static void main(String[] args) {
		Integer age= new Integer(20);
		Integer snum = new Integer("20121105");			
		
		System.out.println("나이: " + age.intValue());		// 일반 int형으로 입력 -> 자동으로 int로 반환
		System.out.println("학번: " + snum.intValue());		// 문자 String으로 입력 -> 자동으로 int로 반환 / 입력시 int,String 지원 자동을 int로 변환
		System.out.println(age.equals(snum));				// age = 20, snum = 20121105 두개 비교 
		
		System.out.println(Integer.parseInt("24567"));		// String -> int 출력 / 기본형은 10진수
		System.out.println(Integer.parseInt("ff", 16));		// ff 값을 16진수로 바꿔서 출력 / 16자리 radix -> 2진수, 10진수, 16진수
		System.out.println(Integer.toBinaryString(255));	// String 타입으로 변경하여 출력 
		System.out.println(Integer.toString(255, 16));
		
	}
}

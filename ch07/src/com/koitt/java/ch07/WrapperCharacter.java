package com.koitt.java.ch07;

public class WrapperCharacter {
	
	public static void main(String[] args) {
		// Character ch = new Character('@');
		Character ch = '@';			// boxing
		Character ch2 = '@';
		
		System.out.print(ch + " ");		// unboxing
		System.out.print(ch.charValue() + " ");		// 메소드 호출 character 타입으로 리턴
		System.out.println(ch.toString());			// String 타입으로 리턴
		System.out.print(ch.compareTo('@') + " ");	// 두값을 비교, 0-> 다른점이 없다. 숫자 -> 틀린곳있을때마다 증가 (한군데 다르면 1, 두군데 다르면 2)
		System.out.println(ch.hashCode());			// 가짜 주소값
		System.out.println(ch2.hashCode());
		System.out.println();
		
		// 정적 메소드(static)
		System.out.print(Character.toUpperCase('d') + " ");		// 대문자로 변경
		System.out.println(Character.toLowerCase('F'));			// 소문자로 변경
		System.out.print(Character.getName('@') + ", ");		// ' ' 안의 특수문자 명칭 호출 
		System.out.print(Character.getName('|') + ", ");
		System.out.println(Character.getName('^') + " ");
		System.out.print(Character.isDigit('$') + " ");			// 숫자 여부 계산
		System.out.println(Character.isDigit('5'));
		
	}

}

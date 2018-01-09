package com.koitt.java.ch07;

/* 관례 
 *  T : type
 *  E : element
 */

public class GenericTest<T> {
	public boolean myEqual(T a, T b) {
		return a.equals(b);
	}
	
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hi";
		String c = "Hello";
		Integer d = 1;
		Integer e = 2;
		
		// String 타입을 이용하는 myEqual 메소드 호출 할 수 있게 됨
		GenericTest<Object> test = new GenericTest<Object>();
		boolean isEqual = test.myEqual(a, b);
		System.out.println(isEqual);
		
		boolean isEqual2 = test.myEqual(a, c);
		System.out.println(isEqual2);
		
		boolean isEqual3 = test.myEqual(d, e);
		System.out.println(isEqual3);
	}

}

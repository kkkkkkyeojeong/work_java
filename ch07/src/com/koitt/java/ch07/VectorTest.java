package com.koitt.java.ch07;

import java.util.List;
import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		// 제네릭(Generic) -> <Object>
		List<Object> data = new Vector<Object>(3);		// 3 -> 배열의 크기. 빈괄호 -> 기본크리 제공됨 
		// Vector data = new Vector(3);   경고발생
		
		((Vector<Object>)data).addElement(2012);		// addElement = add 기능 같음. 배열의 마지막에 값 추가 
		data.add("년도");
		((Vector<Object>)data).addElement(4.35);
		data.add(2, "목표 학점");
		((Vector<Object>)data).insertElementAt("자바 강좌", 0);		// insertElementAt(0번째 순서에 자바 강좌 추가) = add 기능 같음
		System.out.println("size = " + data.size());				// 배열 값 개수 
		System.out.println("capacity = " + ((Vector<Object>)data).capacity());		// capacity() 용량 : 기존 3 용량이 부족해서 자동으로 용량 2배 생성됨.  
		System.out.println(data.toString());
	}

}

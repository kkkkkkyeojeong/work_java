package com.koitt.java.ch07;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public static void main(String[] args) {
		HashSet<Integer> setA = new HashSet<Integer>();		// 객체 생성
		HashSet<Integer> setB = new HashSet<Integer>();
		
		setA.add(5); 
		setA.add(3);
		setA.add(7);		// set은 중복 입력 불가. 7 하나만 입력됨 
		setA.add(8);
		setA.add(7);
		setA.add(9);
		System.out.print("A = ");
		print(setA);
		// println에서 자동으로 Argument로 전달받은 객체의 toStirng 메소드를 호출한다.
		System.out.println(" A = " + setA.toString());
		
		setB.add(5);
		setB.add(3);
		setB.add(2);
		System.out.print("B = ");
		print(setB);
		System.out.println(" B = " + setB);
		
		boolean isChanged = setA.removeAll(setB);			
		/* 
		 * removeAll() A 내용에서 B의 중복 내용 삭제 
		 * 삭제될 내용이 있으니 boolean 때문에 isChanged에 true 값이 리턴됨
		 * if(true)가 되어 setA 프린트 됨  
		 */
		System.out.print("A - B = ");
		if(isChanged) {
			System.out.println(setA);
		}
		
		// for-each 문
		for(Integer i : setA) {
			System.out.print(i + " ");
		}

	}
	public static void print(HashSet<Integer> s) {
		Iterator<Integer> i = s.iterator();
		while (i.hasNext())
			System.out.print(i.next() + " ");
	}

}

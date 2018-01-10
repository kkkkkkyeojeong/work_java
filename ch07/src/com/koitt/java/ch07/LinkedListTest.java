package com.koitt.java.ch07;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	
	public static void main(String[] args) {
		List<Object> list = new LinkedList<>();
		
		list.add("pascal");			
		((LinkedList<Object>)list).addLast(1);			// 배열의 맨 마지막에 붙음
		list.add("java");			
		((LinkedList<Object>)list).addLast(3.4);
		((LinkedList<Object>)list).addFirst("algol");		// 배열의 맨 앞에 붙음 
		((LinkedList<Object>)list).addFirst(0.87);
		list.add(3, null);			// 3번째 값 다음에 null 값 삽입
		((LinkedList<Object>)list).addLast(5.8);
		
		Iterator<Object> it = list.iterator();		// list 안의 iterator 객체 뽑아 변수 it에 저장 
		print(it);
		print(((LinkedList<Object>)list).descendingIterator());	// descendingIterator(); -> 위에 출력된 내용 역순으로 출력 
		
		// 배열로 반환하여 모든 원소 출력 가능
		for (Object e : list.toArray()) {		// 위의 내용이 담긴 배열 호출하여 출력 (맨 마지막 줄)
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static void print(Iterator<Object> it) {
		while(it.hasNext()) {						// hasNext(); -> 출력될 값이 있으면 true
			System.out.print(it.next() + " ");		// next(); 값을 꺼내 출력 
		}
		System.out.println();
	}

}

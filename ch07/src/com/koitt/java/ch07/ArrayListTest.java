package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(0.87);
		list.add("algo");
		list.add("pascal");
		list.add("null");
		list.add(1);
		list.add("java");
		list.add(3.4);
		list.add(5.8);
		
		Iterator it = list.iterator();			// list 내용들을 순차적으로 뽑아 사용하기 위해 iterator() 사용
		print(it);
		
		for (Object e : list.toArray()) {		// 위의 내용이 담긴 배열로 호출( toArray() )하여 출력 (맨 마지막 줄)
			System.out.print(e + " ");
		}
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			Object e = list.get(i);
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static void print(Iterator it) {
		while(it.hasNext()) {						// hasNext(); -> 출력될 값이 있으면 true, 없으면 false
			System.out.print(it.next() + " ");		// next(); 값을 꺼내 출력하여 다음값 확인  
		}
		System.out.println();
	}
}

package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorForEach {
	
	public static void main(String[] args) {
		
		List<Integer> array = new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		
		// for-each
		for (int item : array) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		// for-each 문의 원리: iterator 
		for (Iterator<Integer> i = array.iterator(); i.hasNext();) {
			Integer item = i.next();
			System.out.print(item + " ");
		}
	}
}

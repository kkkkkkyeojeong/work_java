package generics;

import java.util.ArrayList;

public class MyContainer <E> {
	
	private ArrayList<E> list;
	
	public MyContainer() {
		list = new ArrayList<E>();
	}
	
	public E get(int index) {
		return list.get(index);
	}
	
	public void add(E element) {
		list.add(element);
	}
	
	public static void main(String[] args) {
		MyContainer<String> p1 = new MyContainer<String>();		// 5번째 줄 <E> 전부 String 타입으로 변환
		p1.add("algol");
		p1.add("c");
		//p1.add(5);  오류
		p1.add("java");
		
		System.out.println(p1.get(0) + " ");
		System.out.println(p1.get(1) + " ");
		System.out.println(p1.get(2) + " ");
		
		MyContainer<Integer> p2 = new MyContainer<Integer>();
		p2.add(5);
	}

}

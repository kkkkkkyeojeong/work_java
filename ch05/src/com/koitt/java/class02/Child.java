package com.koitt.java.class02;

// Parent 클래스 상속받음 
public class Child extends Parent{

	// Child 클래스의 생성자
	public Child() {
		super(); 		// 부모(Parent)의 기본생성자 호출: 작성 안할경우 컴파일러가 자동으로 추가함 
		System.out.println("Child() 기본생성자 호출");
	}
	
	public Child(String msg) { 
		// super(); 자동생성됨
		System.out.println("Child(String msg) 생성자 호출 " + msg);
	}
	
	public Child(int num) {
		this("화이팅");
		// Child(String msg) 호출함. super(); 존재하기 때문에 이곳엔 생성안됨 
		System.out.println("Child(int num) 생성자 호출 " + num);
	}
}

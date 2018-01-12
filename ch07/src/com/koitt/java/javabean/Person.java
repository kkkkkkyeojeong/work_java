package com.koitt.java.javabean;

import java.io.Serializable;

// 자바 빈 (Java Bean)
public class Person extends Object implements Serializable{
	
	private String name;
	private int age;
	
	// 1. 기본생성자
	public Person() {}
	
	// 2. 생성자(필드 전체를 초기화 하는 생성자)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 3. getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 4. equals 구현
	@Override
	public boolean equals(Object obj) {
		// 4-1. 나 자신과 Argument의 객체 주소값 비교
		if (this == obj) {
			return true;
		}
		
		// 4-2. obj가 현재 클래스를 상속받고 있는지 확인
		if (!(obj instanceof Person)) {
			return false;
		}
		
		// 4-3. name 필드값이 같다면 같은 객체로 결과를 리턴
		Person p = (Person)obj;
		if (this.name.equals(p.name)) {
			return true;
		}
		return false;
	}
	
	// 5. hashCode 구현 (가짜 주소값) : 객체 하나를 하나의 숫자로 표현하는 메소드
	// age -> hashcode 없음, 값 자체가 hashcode
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.age;
	}
	
	// 6. 객체의 내용을 문자열로 표현하는 메소드 -> 배열에 문자열 저장 후(부족 시 두배씩 늘어남) 문자열로 변경 
	@Override
	public String toString() {
		//String a = "name: " + this.name + " / " + "age: "+ this.age; -> 아래와 같음. 사용시 컴퓨터에게 무리감, 그래서 StringBuilder 많이 사용 
		StringBuilder sb = new StringBuilder();
		sb.append("name = ");
		sb.append(this.name);
		sb.append(", age = ");
		sb.append(this.age);
		String a = sb.toString();		// 위 append한 문자열을 String 타입으로 변환
		return a;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("철수", 35);
		Person p2 = new Person("영희", 28);
		Person p3 = new Person("철수", 33);
		
		// 1. equals 사용법
		if (p1.equals(p2)) {		// 철수와 영희의 이름 비교
			System.out.println("두 사람은 같은 사람 입니다.");
		}
		else {
			System.out.println("두 사람은 다른 사람 입니다.");
		}
		
		if (p1.equals(p3)) {		// 철수와 철수의 이름 비교
			System.out.println("두 사람은 같은 사람 입니다.");
		}
		else {
			System.out.println("두 사람은 다른 사람 입니다.");
		}
		
		Object o = new Object();
		System.out.println(o.hashCode());
		
		Object o2 = new Object();
		System.out.println(o2.hashCode());
		
		// 2. hashcode 값 출력
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		// 3. toString 메소드 사용
		// println 메소드에서 자동으로 객체의 toString을 호출 
		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p3);
		
	}

}

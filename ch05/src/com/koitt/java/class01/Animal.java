package com.koitt.java.class01;

/*
 * Object 클래스
 * - 자바에서 모든 클래스가 기본으로 상속받는 클래스
 * - 이미 기본으로 구현되어 있는 클래스 
 * - extends로 선언하지 않아도 기본으로 상속받는 클래스 
 * 
 * 접근제한자 
 * - private - 같은 클래스 내부에서만 사용가능
 * - (default) - 같은 패키지(폴더) 내부에서만 사용가능
 * - protected - default 범위 + 상속받은 클래스까지 사용가능
 * - public - 어느곳이든 사용가능 
 */

public class Animal /*extends Object*/{

	// 필드 (Field)
	// private -> Animal 클래스에서만 쓴다 의미
	private String name;
	private int age;
	private String gender;
	
	//메소드 (Method)
	
	// getter, setter
	public String getName() {
		// return sanghoon.name;
		return this.name;
	}
	public void setName(String name) {
		// sanghoon.name = "정상훈";
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}

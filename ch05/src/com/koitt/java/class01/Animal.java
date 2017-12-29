package com.koitt.java.class01;

/*
 * Object 클래스
 * - 자바에서 모든 클래스가 기본으로 상속받는 클래스
 * - 이미 기본으로 구현되어 있는 클래스 
 * - extends로 선언하지 않아도 기본으로 상속받는 클래스 
 * 
 * 접근제한자 
 * - private
 * - public 
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

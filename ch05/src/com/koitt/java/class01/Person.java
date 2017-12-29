package com.koitt.java.class01;

public class Person extends Animal{

	/*
	 * 부모인 Animal의 필드를 상속받기 때문에 
	 * 중복으로 작성하지 않아도 된다. 	  
	 */
	
	private String ssn; 			// 주민등록번호
	private String address;;		// 주소
	
	public String getSsn() {
		return this.ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}

	
}

package com.koitt.java.exception02;

// 모델(Model), VO(Value Object), DTO(Data Transfer Object) -> 자바빈
public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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
	
	@Override
	public boolean equals(Object obj) {
		// 주소값 비교
		if (this == obj) {
			return true;
		}
		// 2. Person 클래스 상속 받았는지 검사
		if(!(obj instanceof Person)) {
			return false;
		}
		// 3.Person의 name 필드값끼리 비교 
		Person p = (Person)obj; 	// 다운캐스팅
		if(this.name.equals(p.name)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	
}

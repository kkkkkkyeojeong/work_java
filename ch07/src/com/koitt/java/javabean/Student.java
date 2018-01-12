package com.koitt.java.javabean;

import java.io.Serializable;

public class Student extends Object implements Serializable{
	
	private int studentId;
	private String name;
	
	// 1. 기본 생성자
	public Student( ) {}
	
	// 2. 모든 필드를 초기화하는 생성자
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	
	// 3. getter, setter
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 4. hashcode 구현(가짜 주소값)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + studentId;
		return result;
	}
	
	public boolean equals(Object obj) {
		// 주소값 비교
		if (this == obj) {
			return true;
		}
		// obj가 Student 클래스에 속하는지 확인
		if (!(obj instanceof Student)) {
			return false;
		}
		// obj 다운캐스팅 후 내용 비교/ 
		// int 타입은 입력된 숫자가 주소값이기 때문에 사용 '==', Integer 참조형 클래스안에 equals메소드가 존재. int -> 기본형 메소드없음 
		// String일 경우 this.name.equals(s.name) 사용해서 비교  
		Student s = (Student)obj;
		if (this.studentId == s.studentId) {
			return true;
		}
		return false;
	}

	/*// 5. equals 구현 -> 자동 완성 
	@Override
	public boolean equals(Object obj) {
		// 주소값 비교
		if (this == obj)
			return true;
		// Argument에서 받는 객체가 null 이면 false 리턴 
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}*/

	// 6. toString 구현
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentId=");
		builder.append(studentId);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		
		Student a = new Student(2018, "김영희");
		Student b = new Student(2015, "박철수");
		Student c = new Student(2018, "김영수");
		
		// 1. equals
		if(a.equals(b)) {
			System.out.println("두 사람은 같은 사람입니다.");
		}
		else {
			System.out.println("두 사람은 다른 사람입니다.");
		}
		
		if(a.equals(c)) {
			System.out.println("두 사람은 같은 사람입니다.");
		}
		else {
			System.out.println("두 사람은 다른 사람입니다.");
		}
		// 2. hashcode
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		// 3. toString 
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println(c.toString());
		
	}
	
}

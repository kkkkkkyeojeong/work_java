package com.koitt.java.javabean;

public class PersonAuto {
	
	private String name;
	private int age;

	// 1. 기본생성자
	public PersonAuto() {}
	
	// 2. 모든 필드 초기화하는 생성자
	public PersonAuto(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 3. getter, setter
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

	// 4. equals, hashcode 자동완성 - Alt + Shift + S -> Generate hashcode, equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 1. 주소값 비교
		if (this == obj)
			return true;
		// 2. Argument에서 받은 객체가 null 이면 false 리턴 
		if (obj == null)
			return false;
		// 3. 클래스의 위치 비교
		if (getClass() != obj.getClass())
			return false;
		// 4. 필드에 접근하기 위해 다운캐스팅 함 
		PersonAuto other = (PersonAuto) obj;
		// 5. age값(주소) 비교 
		if (age != other.age)
			return false;
		// 6. this의 name이 null 값일때 
		if (name == null) {
			// 비교 대상의 필드가 null이 아니면 다른 객체로 판다
			if (other.name != null)
				return false;
		} 
		// 7. name 값이 다르면 다른 객체로 판단하여 결과 리턴 
		else if (!name.equals(other.name)) {
			return false;
		}
		// 위 조건 모두 만족 안한다면 같은 객체로 판단
		return true;
	}
	
	// 5. toString 자동완성(Alt + Shift + S -> generate toString)
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonAuto [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	
	public static void main(String[] args) {
		PersonAuto p = new PersonAuto("홍길동", 30);
		System.out.println(p.getClass());
		
		System.out.println(p);		// toString 사용
		
	}	
}

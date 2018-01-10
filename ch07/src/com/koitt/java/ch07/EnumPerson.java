package com.koitt.java.ch07;

public class EnumPerson {

	/*
	 * enum은 자바 1.5 버전부터 사용가능
	 */
	// public enum StudentTest {GIL_DONG, JI_HYON, JA_MIN, BEONG_EUN}; 책에서 배운 입력방식 
	
	// 객체 생성 
	public enum Student {			
		// 컴파일러시 생성자 호출하는 것과 비슷함
		GIL_DONG(100, "홍길동"),
		JI_HYON(101, "전지현"),
		JA_MIN(102, "민자민"),
		BEONG_EUN(103, "현병은");

		// 클래스의 필드 선언과 비슷 
		private int studentId;
		private String name;

		// 클래스의 생성자와 비슷 (private만 사용 가능 -> 객체 생성 허용 안함)
		private Student(int studentId, String name) {
			this.studentId = studentId;
			this.name = name;
		}

		// 클래스의 getter, setter 와 비슷
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
	}

	public static void main(String[] args) {
		System.out.println(Student.GIL_DONG);
		System.out.println(Student.GIL_DONG.getStudentId());
		System.out.println(Student.GIL_DONG.getName());

		for (Student item : Student.values()) {
			System.out.print("학번: " + item.getStudentId());
			System.out.println(", 이름: " + item.getName());
		}
		
		Student.GIL_DONG.setName("홍길자");
		System.out.println(Student.GIL_DONG.getName());
	}
}
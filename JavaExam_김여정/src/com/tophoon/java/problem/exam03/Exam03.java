package com.tophoon.java.problem.exam03;

public class Exam03 {

	int number;
	String name;
	String division;
	String grade;

	public Exam03() {

	}

	public Exam03(int number, String name, String division, String grade) {
		this.number = number;
		this.name = name;
		this.division = division;
		this.grade = grade;
	}
	
	public void printInfo() {
		System.out.println("사원번호: " + this.number);
		System.out.println("이름: " + this.name);
		System.out.println("부서명: " + this.division);
		System.out.println("직급: " + this.grade);
	}	
		

	public static void main(String[] args) {
		Exam03 Employee = new Exam03();
		Employee.number = 1;
		Employee.name = "홍길동";
		Employee.division = "개발1팀";
		Employee.grade = "부장";
		
		Exam03 Employee2 = new Exam03(2, "김영희", "개발2팀", "대리");
		
		Employee.printInfo();
		Employee2.printInfo();
		
		
	}
}

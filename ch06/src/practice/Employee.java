package practice;

public class Employee {
	
	String name;
	int age;
	String address;
	String division;
	int Salary;

	public Employee(String name, int age, String address, String division) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.division = division;
	}
	
	public void printInfo( ) {
		System.out.println("이름: " + this.name + ", 나이: " + this.age + 
							", 주소: " + this.address + ", 부서: " + this.division);
	}
}

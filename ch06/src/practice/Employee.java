package practice;

public class Employee {
	
	private String name;
	private int age;
	private String address;
	private String division;
	private long Salary;

	public Employee(String name, int age, String address, String division) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.division = division;
	}
	
	public void printInfo( ) {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("주소: " + this.address);
		System.out.println("부서: " + this.division);
		
	}

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		this.Salary = salary;
	}
	
	public void setWorkHours(int time) {
		
	}
	
}

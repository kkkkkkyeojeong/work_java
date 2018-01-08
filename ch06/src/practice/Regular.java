package practice;

public class Regular extends Employee{

	public Regular(String name, int age, String address, String division) {
		super(name, age, address, division);
	}
	
	/*public void setSalary(int Salary) {
		this.Salary = Salary;
	}*/
/*	public int getMpay( ) {
		return Mpay;
	}*/
	
	public void printInfo() {
		System.out.println("정규직," + " " + super.getSalary());
	}
	
}

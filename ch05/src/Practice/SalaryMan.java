package Practice;

public class SalaryMan {
	
	public int salary = 1000000;
	
	public SalaryMan() {
		
	}
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualGross() {
		return (salary + (salary * 5)) * 12; 
	}
	
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
		
	}
	
}

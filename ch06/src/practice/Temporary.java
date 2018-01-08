package practice;

public class Temporary extends Employee{
	
	int time;
	int Tmoney = 10000;
	
	public Temporary(String name, int age, String address, String division) {
		super(name, age, address, division);
	}
	
	public void setWorkHours(int time) {
		this.time = time;
		//int a = time * Tmoney;
		super.setSalary(this.time * this.Tmoney);
	}
	
	
	public void printInfo( ) {
		System.out.println("비정규직, " + this.time + " / " + super.getSalary());
	}
	
	public static void main(String[] args) {
	
		// 문제 3번
		/*Regular r = new Regular("이순신", 35, "서울", "인사부");
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");
		r.setSalary(5000000);
		r.printInfo();
		t.setWorkHours(120);
		t.printInfo();*/
		
		// 문제 4번
		/*Employee r = new Regular("이순신", 35, "서울", "인사부");
		Employee t = new Temporary("장보고", 25, "인천", "경리부");
		Regular a = (Regular) r;
		a.setSalary(5000000);
		a.printInfo();
		Temporary b = (Temporary) t;
		b.setWorkHours(120);
		b.printInfo();*/
		
		// 문제 4번  ->  동적바인딩 묻는것 / 부모클래스인 Employee 에 public void setWorkHours(int time) {} 메소드 생성 
		Employee r = new Regular("이순신", 35, "서울", "인사부");
		Employee t = new Temporary("장보고", 25, "인천", "경리부");
		r.setSalary(5000000);
		r.printInfo();
		t.setWorkHours(120);
		t.printInfo();
	}
}

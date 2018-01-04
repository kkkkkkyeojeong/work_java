package inheritance.constructor;

public class Motor extends Vehicle{
	private String name = "자동차";
	private int displacement;
	
	// Motor 의 기본 생성자
	// 부모클래스에 기본생성자가 없을 경우, 자식클래스는 기본생성자를 생성할 수 없다. 부모
	public Motor() {
						// 부모가 존재해야 자식이 존재할 수 있기 때문에 항상 부모의 생성자를 먼저 한번 호출해야 한다. 
		super();		// Vehicle();과 같다 (Vehicle 호출)/ 컴파일러가 알아서 자동으로 생성해서 생략가능함
	}
	
	public Motor(double maxSpeed, int seater, int displacement) {
		super(maxSpeed, seater);
		// this.maxSpeed = maxSpeed;
		// this.seater = seater;
		this.displacement = displacement;
	}
	
	public void printInfo() {
		System.out.print(super.getName()+ " : " + this.name);
		System.out.println(", 최대속도: " + this.getMaxSpeed()+ " km");
		System.out.print("정원: " + this.getSeater() + " 명");
		System.out.println(", 배기량: " + this.displacement + " cc");
		
	}
	
	public static void main(String[] args) {
		Motor mycar = new Motor(300, 4, 5000);
		mycar.printInfo();
	}

}

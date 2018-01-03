package obj.constructor;

public class Car {
	
	private int maxSpeed;
	public String brandName;
	public int speed;
	
	public Car(String brandName) {
		this.brandName = brandName;
	}
	
	public Car(String brandName, int maxSpeed) {
		this(brandName);
		this.maxSpeed = maxSpeed;
	}
	
	public int speedUp() {
		return this.speed+=30;
	}
	
	public int speedDown() {
		return this.speed -=20;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		Car mycar = new Car("포르쉐", 300);
		mycar.speedUp();
		mycar.speedUp();
		System.out.print("차종: " + mycar.brandName);
		System.out.print(", 최고 속도: " + mycar.getMaxSpeed());
		System.out.println(", 현재 속도: " + mycar.speedDown());
	}

}

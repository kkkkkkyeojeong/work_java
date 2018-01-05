package practice;

public class Car {
	
	int maxSpeed;	// 최대속도
	int speed;		// 현재속도
	
	public Car(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}
	
	public int speedUp() {
		speed += 5;
		this.speed = speed;
		if (this.speed > this.maxSpeed) {
			this.speed = this.maxSpeed;
			return maxSpeed;
		}
		System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
		return this.speed;
	}
	
	public int speedUp(int speed) {
		int a = this.speed;
		if (speed < 0) {
			speed = 0;
		}
			if(speed >= 300 ) {
				speed = 0;
				this.speed = this.maxSpeed;
				return this.speed;
			}
		a +=speed;
	
		this.speed = a;
		System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
		return this.speed;
	}
	
	public int speedDown() {
		speed -= 5;
		this.speed = speed;
		if (this.speed < 0) {
			this.speed = 0;
			return this.speed;
		}
		System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
		return this.speed;
	}
	
	public int speedDown(int speed) {
		int a = this.speed;
		if (speed < 0) {
			speed = 0;
		}
			if(this.speed < 0 ) {
				this.speed = 0;
				return this.speed;
			}
		a -=speed;
		this.speed = a;
		System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
		return this.speed;
	}
	
	public static void main(String[] args) {
		Car mycar = new Car(300);
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp(-50);
		mycar.speedUp(50);
		mycar.speedDown(-30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedUp(100);
		mycar.speedUp(300);
		
	}
	
	

}

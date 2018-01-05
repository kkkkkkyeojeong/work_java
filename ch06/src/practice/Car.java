package practice;

public class Car {
	
	int maxSpeed;	// 최대속도
	int speed;		// 현재속도
	
	// 생성자 
	public Car(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}
	
	public int speedUp() {
		int a = this.speed;
		a += 5;
		
		// 최대속도보다 높을 경우
		if (a > maxSpeed) {
			System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
			this.speed = this.maxSpeed;
			return this.speed;
		}
		// 최대속도보다 높지 않을 경우 
		else {
			this.speed = a;
			System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
			return this.speed;
		}
	}
	
	public int speedUp(int speed) {
		int a = this.speed;
		a += speed;
		
		// 입력받은 speed가 0보다 작을 경우 
		if (speed < 0) {
			System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
			return this.speed;
		}
			// speed가 최대속도를 넘을 경우 
			else if (a > this.maxSpeed) {
				this.speed = this.maxSpeed;
				System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
				return this.speed;
			}
			else {	
				this.speed = a;
				System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
				return this.speed;
			}	
	}
		
	public int speedDown() {
		int a = this.speed;
		a -= 5;
		
		// 속도가 0 이하일 경우 
		if (a < 0) {
			System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
			this.speed = 0;
			return this.speed;
		}
		// 최대속도보다 높지 않을 경우 
		else {
			this.speed = a;
			System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
			return this.speed;
		}
	}
	
	public int speedDown(int speed) {
		int a = this.speed;
		a -= speed;
		
		// 입력받은 speed가 0보다 작을 경우 
		if (speed < 0) {
			System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
			return this.speed;
		}
			// speed가 0이하 일 경우 
			else if (a < 0) {
				this.speed = 0;
				System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
				return this.speed;
			}
			else {	
				this.speed = a;
				System.out.println("최대속도: " + this.maxSpeed + ", 현재속도: " + this.speed);
				return this.speed;
			}	
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

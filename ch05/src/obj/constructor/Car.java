package obj.constructor;

public class Car {
	
	private int maxSpeed;
	private String brandName;
	private int speed;
	
	public Car(String brandName) {
		this.brandName = brandName;
	}
	
	public Car(String brandName, int maxSpeed) {
		this(brandName);
		this.maxSpeed = maxSpeed;
	}
	
	// 속도관련 메소드
	public int speedUp() {
		int tempspeed = this.speed;
		tempspeed += 30;
		
		// 최대 속도보다 더 높다면 이전 속도 유지
		if (tempspeed > this.maxSpeed) {
			return this.speed;
		}
		// 최대 속도보다 같거다 작다면 현재 속도를 갱신
		this.speed = tempspeed;
		
		return this.speed;
	}
	
	public int speedDown() {
		// 현재 속도를 임시 저장
		int Dspeed = this.speed;
		Dspeed -= 20;
		// 현재 속도가 0보다 작다면
		if (Dspeed < 0) {
			//return this.speed;
			return 0;
		}
		// 현재 속도를 계산한 속도로 갱신 
		this.speed = Dspeed;
		
		return this.speed;
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

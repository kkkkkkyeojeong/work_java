package inheritance.abstratinterface;

// 추상클래스
public abstract class Shape {
	protected double x, y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// 일반 메소드
	public void drawCenter() {
		System.out.println("(x, y) = " + x + ", " + y);
	}
	
	// 추상 메소드
	public abstract void draw();
	/*
	 * 메소드 몸체가 없는 이유
	 * - 상속받은 클래스에서 구현을 하라는 뜻 
	 */
	
	public static void main(String[] args) {
		// shape s = new shape(3.1, 4.5)   - 객체화 오류 -> 추상메소드가 있기때문에, 아직 완전하게 구현 전이기 때문에.
		Shape s = new Circle(3.1, 4.5, 3.0);
		s.draw();
	}

}

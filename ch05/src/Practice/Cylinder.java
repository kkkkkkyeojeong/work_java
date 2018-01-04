package Practice;

public class Cylinder {
	
	// String text;
	Circle circle;
	double height;
	
	
	// 문제 4 1번째 문제 
	public Cylinder(Circle circle, double height) {
		this.circle = circle;
		this.height = height;
	}
	
	public double getVolume( ) {
		double area = circle.getArea();			// 원 넒이를 구한다.
		double volume = area * this.height;
		return volume;
	}
	
	// 방법1: circle 필드를 setter를 이용하여 초기화
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	public static void main(String[] args) {
		// 1. 원을 만든다. -> Circle 클래스를 이용하여 객체 생성함
		Circle c1 = new Circle(2.8);
		
		// 2. 실린더를 만든다. -> Cylinder 클래스를 이용하여 객체 생성함
		Cylinder cylinder = new Cylinder(new Circle(2.8), 5.6);
		//cylinder.setCircle(c1);  		// cylinder 객체의 circle 필드 초기화
		//cylinder.setHeight(5.6); 		// cylinder 객체의 height 필드 초기화 
		System.out.println(cylinder.circle + " / " + cylinder.height);
		
		// 3. 실린더의 부피 구하는 메소드를 호출 한 뒤, 리턴 값을 result 변수에 저장
		double result = cylinder.getVolume();
		System.out.println(result);
	}
	
}
package Practice;

public class Circle {

	public double radius;
	public static double PI = 3.141592;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// 반지름 이용하여 원 밑넓이(면적) 구함
	public double getArea() {
		return this.radius * this.radius * PI; 
	}
	
}

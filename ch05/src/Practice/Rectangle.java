package Practice;

public class Rectangle {
	double width, height;
	
	public Rectangle( ) {
		
	}
	public Rectangle(double width) {
		this.width = width;
	}
	
	public Rectangle(double width, double height) {
		this(width);
		this.height = height;
	}
	
	public static void main(String[] args) {
		Rectangle rc = new Rectangle();
	}

}

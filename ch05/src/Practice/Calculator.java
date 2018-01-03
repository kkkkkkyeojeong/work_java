package Practice;

public class Calculator {
	
	/*public Calculator() {
		
	}*/
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		Calculator a = new Calculator();
		System.out.println(a.add(3.4, 6.7));
	}

}

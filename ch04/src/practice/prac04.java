package practice;

public class prac04 {
	public static void main(String[] args) {

		// 5에서 10사이 0.5씩 증가하도록
		for (double x = 5.0; x < 10; x += 0.5) {
			double y = 4 * Math.pow(x, 3) + 5 * Math.pow(x, 2) + x + 2;
			System.out.printf("x = %.1f, y = %.2f%n", x, y);
		}
	}

}

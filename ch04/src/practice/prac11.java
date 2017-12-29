package practice;

public class prac11 {
	public static void main(String[] args) {
		
		for (int i = 2; i<10; i++) {
			for (int j = 1; j<10; j++ ) {
				int result = i*j;
				System.out.printf("%2d *%2d = %2d ", i, j, result);
			}
			System.out.println();
		}
	}

}

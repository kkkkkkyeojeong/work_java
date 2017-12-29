package practice;

public class prac13 {

	public static void main(String[] args) {
		
		for (int i = 1; i <10; i++) {
			for (int j = 2; j < 10; j++) {
				int result = i * j;
				System.out.printf("%2d *%2d = %2d ", j, i, result);
				
			}
			System.out.println();
		}
		
	}
}

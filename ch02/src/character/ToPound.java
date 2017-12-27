package character;

public class ToPound {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("무게를 입력하세요.");
		
		double weight = input.nextDouble();
		
		System.out.println("무게: " + weight + " kg");
		
		double result = weight * 2.2;
		
		System.out.println("무게: " + result + " Ib");
		
		input.close();
	}
}

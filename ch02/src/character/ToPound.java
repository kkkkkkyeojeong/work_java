package character;

public class ToPound {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("���Ը� �Է��ϼ���.");
		
		double weight = input.nextDouble();
		
		System.out.println("����: " + weight + " kg");
		
		double result = weight * 2.2;
		
		System.out.println("����: " + result + " Ib");
		
		input.close();
	}
}

package character;

import java.util.Scanner;

public class PersonInfo {

	public static void main(String[] args) {
		
		System.out.println("�����Կ� Ű�� �Է��ϼ���.");
		
		Scanner input = new Scanner(System.in);
		
		int weight = input.nextInt();
		double height = input.nextDouble();
		
		System.out.println(weight + ", " + height);
		System.out.printf("������: %dkg, Ű: %.2fcm", weight, height);
		
		input.close();
	}
}

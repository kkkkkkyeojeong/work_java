package operator;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Ű�� �����Ը� �Ǽ��� �Է��ϼ���.");

		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		double resulth = (height - 100) * 0.9;
		
		if (weight <= resulth) {
			System.out.println("����");
		}
		else {
			System.out.println("��");
		}
	}
}

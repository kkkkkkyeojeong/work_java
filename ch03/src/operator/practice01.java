package operator;

import java.util.Scanner;

public class practice01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("�Ǽ� �ΰ��� �Է��ϼ���.");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		int result1 = (int)(a+b);
		int result2 = (int)((a+b)/2);
		
		System.out.println("�Ǽ��� ��: " + (double)result1);
		System.out.println("�Ǽ��� ���: " + (double)result2);
	}

}

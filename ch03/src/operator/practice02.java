package operator;

import java.util.Scanner;

public class practice02 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("���Ը� �Է��ϼ���.(kg)");
		
		double w = input.nextDouble();
		double result = w*0.453592;
		
		System.out.printf("���Դ� %.3f �Դϴ�.(pound)", result);
	}
}

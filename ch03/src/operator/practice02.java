package operator;

import java.util.Scanner;

public class practice02 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("무게를 입력하세요.(kg)");
		
		double w = input.nextDouble();
		double result = w*0.453592;
		
		System.out.printf("무게는 %.3f 입니다.(pound)", result);
	}
}

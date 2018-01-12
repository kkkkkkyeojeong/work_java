package operator;

import java.util.Scanner;

public class practice02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("킬로그램(kg)을 입력하세요 >> ");

		double kg = input.nextDouble();
		double pound = kg * 1000000 / 453592;

		System.out.printf("파운드(pound): %.3f", pound);

	}
}

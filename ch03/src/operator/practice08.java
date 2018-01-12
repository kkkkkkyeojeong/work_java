package operator;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 순서대로 입력하세요 >> ");
		double height = input.nextDouble();
		double weight = input.nextDouble();
		
		if (weight <= ((height - 100) * 0.9)) {
			System.out.println("정상 입니다.");
		}
		else {
			System.out.println("비만 입니다.");
		}
	}
}

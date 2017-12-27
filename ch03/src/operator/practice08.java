package operator;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("키와 몸무게를 실수로 입력하세요.");

		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		double resulth = (height - 100) * 0.9;
		
		if (weight <= resulth) {
			System.out.println("정상");
		}
		else {
			System.out.println("비만");
		}
	}
}

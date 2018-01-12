package operator;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("문자 하나를 입력하세요 (C: 섭씨, F: 화씨) >> ");
		String inputString = input.next();
		char unit = inputString.charAt(0);

		System.out.println("온도를 입력하세요 >> ");
		double degree = input.nextDouble();

		double result = 0.0;
		switch (unit) {
		case 'F':
		case 'f':
			result = (5.0 / 9.0) * (degree - 32);
			System.out.format("섭씨 %.2f 입니다.", result);
			break;

		case 'C':
		case 'c':
			result = (9.0 / 5.0) * degree + 32;
			System.out.format("화씨 %.2f 입니다.", result);
			break;
		}
	}
}

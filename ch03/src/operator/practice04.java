package operator;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("년도를 입력하세요 >> ");
		int year = input.nextInt();

		// 1단계
		/*if (year % 4 == 0) {
			if (year % 100 != 0) {
				System.out.println("윤년 입니다.");
			}
			else if (year % 400 == 0) {
				System.out.println("윤년 입니다.");
			}
		}
		else {
			System.out.println("평년 입니다.");
		}*/

		// 2단계
		/*if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("윤년 입니다.");
		}
		else {
			System.out.println("평년 입니다.");
		}*/

		// 3단계
		boolean cond01 = year % 4 == 0;
		boolean cond02 = year % 100 != 0;
		boolean cond03 = year % 400 == 0;

		if (cond01 && cond02 || cond03) {
			System.out.println("윤년 입니다.");
		}
		else {
			System.out.println("평년 입니다.");
		}
	}
}

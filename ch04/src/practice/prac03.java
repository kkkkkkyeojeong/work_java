package practice;

import java.util.Scanner;

public class prac03 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >> ");
		String num = input.next();

		int i = num.length() - 1;
		do {
			char result = num.charAt(i);
			System.out.print(result);
			i--;
		} while (i >= 0);

		input.close();
	}

}

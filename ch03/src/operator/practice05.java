package operator;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요 >> ");

		int num = input.nextInt();

		int man = num / 10000;
		System.out.println(man);

		int chun = num % 10000 / 1000;
		System.out.println(chun);

		int beak = num % 1000 / 100;
		System.out.println(beak);

		int ten = num % 100 / 10;
		System.out.println(ten);

		int one = num % 10 / 1;
		System.out.println(one);

		System.out.printf("%d만 %d천 %d백 %d십 %d입니다. %n", man, chun, beak, ten, one);
	}
}

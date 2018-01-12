package operator;

import java.util.Scanner;

public class practice09 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >> ");
		int money = input.nextInt();

		// 방법 1
		/*int fiveMan = money / 50000;
		System.out.println(fiveMan);

		money = money - fiveMan * 50000;

		int man = money / 10000;
		System.out.println(man);

		money = money - man * 10000;

		int fiveChun = money / 5000;
		System.out.println(fiveChun);

		money = money - fiveChun * 5000;

		int chun = money / 1000;
		System.out.println(chun);*/

		//방법 2
		int fiveMan = money / 50000;
		int man = money % 50000 / 10000;
		int fiveChun = money % 10000 / 5000;
		int chun = money % 5000 / 1000;
		System.out.printf("5만원권 %d개%n1만원권 %d개%n5천원권 %d개%n천원권 %d개%n",
				fiveMan, man, fiveChun, chun);
	}
}

package character;

import java.util.Scanner;

public class PersonInfo {

	public static void main(String[] args) {
		
		System.out.println("몸무게와 키를 입력하세요.");
		
		Scanner input = new Scanner(System.in);
		
		int weight = input.nextInt();
		double height = input.nextDouble();
		
		System.out.println(weight + ", " + height);
		System.out.printf("몸무게: %dkg, 키: %.2fcm", weight, height);
		
		input.close();
	}
}

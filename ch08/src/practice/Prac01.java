package practice;

import java.util.Scanner;

public class Prac01 {

	public static void main(String[] args) {

		int x = 0, y = 0, z = 0;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("정수 두 개 입력: ");
			try {
				x = input.nextInt();
				y = input.nextInt();
				break;		// 오류 안나서 while문 멈춰서 밖으로 나감 
			}
			catch (Exception e){
				
				System.out.println("숫자만 입력하세요.");
				input.nextLine();
				
			}
		}
		z = x * y;
		System.out.printf("%d * %d = %d %n", x, y, z);


	}
}

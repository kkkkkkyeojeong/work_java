package practice;

import java.util.Scanner;

public class prac03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요. >> ");
		String num = input.next();
		
		int i = num.length() - 1;
		
		do {
			char a = num.charAt(i);
			System.out.print(a);
			i--;
			} while (i >= 0);
		
		/*int num = input.nextInt();
	       

	       do {

	           System.out.print(num % 10); // num을 10으로 나눈 나머지 출력

	           num = num / 10; // num을 10으로 나눈 몫을 num에 저장

	       } while (num > 0);*/
		
		
		/*char a = num.charAt(0);
		char b = num.charAt(1);
		
		char[] result = {b, a};
		
		System.out.println(a + ", " + b);
		System.out.println(result);*/
		
		/*for (int i = num.length() -1 ; i >= 0; i--) {

		}*/
		
	}

}

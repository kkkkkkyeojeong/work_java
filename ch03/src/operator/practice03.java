package operator;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("문자 하나와 온도(실수형)를 입력하세요.");
		
		String a = input.next();
		double b = input.nextDouble();
		
		switch(a) {
		
		case "f": case "F":
			System.out.println("섭씨: " + (5.0/9.0)*(b-32));
			break;
			
		case "C": case "c":
			System.out.println("화씨: " + (9.0/5.0)*(b+32));
			break;
			
		default:
			System.err.printf("잘못 입력하셨습니다. \n");
			 
		}
	}
}

package operator;

import java.util.Scanner;

public class practice06 {

	/*public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("월(달)을 입력하세요.");
		int month = input.nextInt();
		
		switch(month) {
		
		case 1: case 2: case 3: case 4: case 5: case 6:
			System.out.println(month + "월은 상반기 입니다.");
			break;
		
		case 7: case 8: case 9: case 10: case 11: case 12:
			System.out.println(month + "월은 하반기 입니다.");
			break;
			
		default:
			System.out.print("잘못입력하셨습니다.");
		}
	}*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("달을 입력하세요 >> ");
		
		int month = input.nextInt();
		
		/*if (month > 0 && month <= 6) {
			System.out.println("상반기입니다.");
		}
		else if (month >= 7 && month <= 12) {
			System.out.println("하반기입니다.");
		}*/
		
		String result = month > 6 ? "하반기입니다." : "상반기입니다.";
		System.out.println(result);
	}
}

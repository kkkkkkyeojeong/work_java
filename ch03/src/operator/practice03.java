package operator;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� �ϳ��� �µ�(�Ǽ���)�� �Է��ϼ���.");
		
		String a = input.next();
		double b = input.nextDouble();
		
		switch(a) {
		
		case "f": case "F":
			System.out.println("����: " + (5.0/9.0)*(b-32));
			break;
			
		case "C": case "c":
			System.out.println("ȭ��: " + (9.0/5.0)*(b+32));
			break;
			
		default:
			System.err.printf("�߸� �Է��ϼ̽��ϴ�. \n");
			 
		}
	}
}

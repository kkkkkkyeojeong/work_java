package operator;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��(��)�� �Է��ϼ���.");
		int month = input.nextInt();
		
		switch(month) {
		
		case 1: case 2: case 3: case 4: case 5: case 6:
			System.out.println(month + "���� ��ݱ� �Դϴ�.");
			break;
		
		case 7: case 8: case 9: case 10: case 11: case 12:
			System.out.println(month + "���� �Ϲݱ� �Դϴ�.");
			break;
			
		default:
			System.out.print("�߸��Է��ϼ̽��ϴ�.");
		}
	}
}

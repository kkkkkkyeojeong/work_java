package operator;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���.");
		int year = input.nextInt();
		
		if (year%4 == 0) {
			if (year%100 ==0) {
				if (year%400 == 0) {
					System.out.println(year + "��(��) �����Դϴ�.");
				}
				else {
					System.out.println(year + "��(��) ����Դϴ�.");
				}
			}
		else {
			System.out.println(year + " ��(��) �����Դϴ�.");	
		}
		}
	}
}

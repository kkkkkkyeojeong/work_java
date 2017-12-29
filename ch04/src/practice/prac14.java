package practice;

import java.util.Scanner;

public class prac14 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. >> ");
		int num = input.nextInt();
		
		String[][] star = new String[num][];
		
		for (int i = 0; i < star.length; i++) {
			
			star[i] = new String[i+1];
		}
		
		for (int i = 0; i < star.length; i++) {
			
			for (int j = 0; j < star[i].length; j++) {
				star[i][j] = "*";
				
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		
		/*for (int i = 0; i < star.length; i++) {
			//i = 1
			for (int j = 0; j < i+1; j++) {
				star[i][j] = "*";
				System.out.print(star[i][j]);
			}
			System.out.println();
		}*/
		
	}
}

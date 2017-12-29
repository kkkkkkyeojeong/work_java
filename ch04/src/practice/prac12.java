package practice;

import java.util.Scanner;

public class prac12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. >> ");
		int a = input.nextInt();
		
		String[][] result = new String[a][a];
		
		
		for (int i = 0; i < result.length; i++) {
		
			for (int j = 0; j < i+1; j++) {
				result[i][j] = "*"; 
				System.out.print(result[i][j]);
			}
			
			System.out.println();
		}
	}
}

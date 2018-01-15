package com.tophoon.java.problem.exam02;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("키와 몸무게를 실수로 입력하세요. >> ");
		
		double height = input.nextDouble();
		double weight = input.nextDouble();
		
		
		String result = (weight <= (height - 100) * 0.9) ? "정상" : "비만" ;
		
		System.out.println(result);
		
	}
}

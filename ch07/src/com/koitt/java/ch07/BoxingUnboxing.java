package com.koitt.java.ch07;

public class BoxingUnboxing {
	
	public static void main(String[] args) {
		// Double radius = new Double(2.59);	-> jdk 1.5 이전
		Double radius = 2.59;	// boxing
		// double r = radius.doubleValue();		-> jdk 1.5 이전
		double r = radius;		// unboxing
		System.out.print("반지름: " + r + ", 원 면적: ");
		System.out.println(radius * radius * Math.PI);
		
		Integer x = 5, y = 3;		// boxing
		System.out.printf("%d + %d  = %d%n", x, y, x+y);	// unboxing
		Boolean b = true; 			// boxing
		System.out.printf("%b %n", b);		// unboxing
	}

}

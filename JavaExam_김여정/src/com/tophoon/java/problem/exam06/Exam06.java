package com.tophoon.java.problem.exam06;

public class Exam06 {
	public static void main(String[] args) {
		
		Shape array[] = {new Circle(4.2, 3.8, 1.56), new Rectangle(2.5, 3.1, 1.67, 3.89)};
		
		for (int i = 0; i < array.length; i++) {
			array[i].draw();
			
		}
		
		Printer array02[] = {new Circle(4.2, 3.8, 1.56), new Rectangle(2.5, 3.1, 1.67, 3.89), 
							new Other(3)};
		
		int i = 0;
		while(i < 3) {
			array02[i].printClassName();
			i++;
		}
		
	}
}

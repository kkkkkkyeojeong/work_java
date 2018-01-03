package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {
	
	public static void main(String[] args) {
		Car a = new Car("벤츠", 200);
		Car b = new Car("포르쉐", 250);
		
		Owner mimi = new Owner("미미", a);
		Owner momo = new Owner("모모", b);
		
		mimi.introCar();
		momo.introCar();
		
	}

}

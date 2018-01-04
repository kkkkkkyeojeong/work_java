package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {
	
	public static void main(String[] args) {
		Car a = new Car("벤츠", 200);
		Car b = new Car("포르쉐", 250);
		
		/*Owner mimi = new Owner("미미", a);
		Owner momo = new Owner("모모", b);
		
		mimi.introCar();
		momo.introCar();
		
		Car c = new Car("미니", 180);
		
		momo.setCar(c);
		momo.introCar();*/
		
		Car[] cars = new Car[3];
		cars[0] = new Car("아반떼", 200);
		cars[1] = new Car("링컨", 300);
		cars[2] = new Car("SUV", 250);
		
		Owner gildong = new Owner("홍길동", cars);
		gildong.introCar();
		
		System.out.println();
		
		Car[] car2 = new Car[2];
		car2[0] = new Car("벤츠", 200);
		car2[1] = new Car("포르쉐", 250);
		
		gildong.setCar(car2);
		gildong.introCar();
		
		
	}

}

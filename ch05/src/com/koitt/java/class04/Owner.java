package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {
	
	private String name;
	private Car car;

	public Owner(String name, Car car) {
		this.name = name;
		this.car = car;
	}
	
	public void introCar() {
		System.out.print("제 이름은 " + this.name + "입니다. 제 차는 ");
		System.out.print(car.getBrandName() + "이고, 최고속도는 ");
		System.out.println(car.getMaxSpeed() + "km/h 입니다.");
	}

}

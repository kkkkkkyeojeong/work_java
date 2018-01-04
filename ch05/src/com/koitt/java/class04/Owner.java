package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {
	
	private String name;
	private Car[] car;

	public Owner(String name, Car[] car) {
		this.name = name;
		this.car = car;
	}
	
	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}

	public void introCar() {
		System.out.print("제 이름은 " + this.name + "입니다. ");
		
		for (int i = 0; i < car.length; i++) {
		System.out.print("제 차는 " + car[i].getBrandName() + "이고, 최고속도는 ");
		System.out.println(car[i].getMaxSpeed() + "km/h 입니다.");
		}
	}

}

package com.tophoon.java.problem.exam06;

public class Circle extends Shape implements Printer{

	private double radius;
	
	// getter, setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// 생성자
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		super.drawCenter();
		System.out.printf("반지름: %f, 원 면적: %f", radius, radius*radius*Math.PI );
		System.out.println();
	
	}
	
	@Override
	public void printClassName() {
		System.out.println("Circle");
		
	}

}

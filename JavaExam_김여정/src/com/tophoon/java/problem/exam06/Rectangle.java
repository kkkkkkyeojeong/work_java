package com.tophoon.java.problem.exam06;

public class Rectangle extends Shape implements Printer {

	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// 생성자
	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		super.drawCenter();
		System.out.printf("가로: %f , 세로: %f ", width, height);
		System.out.printf("사각형 면적: %f%n", width*height);
	}

	@Override
	public void printClassName() {
		System.out.println("Rectangle");
		
	}
	
	

}

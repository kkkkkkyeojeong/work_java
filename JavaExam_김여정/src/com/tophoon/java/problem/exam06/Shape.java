package com.tophoon.java.problem.exam06;

public abstract class Shape {
	
	private double x;
	private double y;
	
	// getter, setter
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	// 생성자 
	public Shape(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	// 메소드
	public void drawCenter() {
		System.out.println("중심좌표 (x, y) = " + x + " " + y);
	}
	
	public abstract void draw();

}

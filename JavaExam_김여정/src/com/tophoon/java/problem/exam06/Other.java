package com.tophoon.java.problem.exam06;

public class Other implements Printer {
	
	private int angles;

	public int getAngles() {
		return angles;
	}

	public void setAngles(int angles) {
		this.angles = angles;
	}

	// 생성자 
	public Other(int angles) {
		super();
		this.angles = angles;
	}

	@Override
	public void printClassName() {
		System.out.println("Other");
		
	}
	

}

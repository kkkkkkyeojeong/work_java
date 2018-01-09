package com.koitt.java.ch07;

public abstract class MyCalendar {
	
	public static MyCalendar getInstance() {
		return new MyGCalendar();
	}
	
	public static void main(String[] args) {
		MyCalendar c = MyCalendar.getInstance();
	}
}

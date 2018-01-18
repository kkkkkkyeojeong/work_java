package practice;

import java.util.Calendar;

public class PrintTime implements Runnable {

	private int count;
	
	public PrintTime (int count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		Calendar day = Calendar.getInstance();
		
		for (int i = 1; i <= this.count; i++) {
			
			System.out.println("순위: " + Thread.currentThread().getPriority() + " " + day.getTime() + " " + Thread.currentThread().getName());
		}
		
	}
	

}

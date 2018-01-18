package practice;

import java.util.Date;

public class PrintTime implements Runnable {

	private int count;

	public PrintTime (int count) {
		this.count = count;
	}

	@Override
	public void run() {
		// Calendar day = Calendar.getInstance();

		for (int i = 1; i <= this.count; i++) {

			// System.out.println("순위: " + Thread.currentThread().getPriority() + " " + day.getTime() + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("순위: " + Thread.currentThread().getPriority() + " " + new Date() + " " + Thread.currentThread().getName());
		}

	}


}

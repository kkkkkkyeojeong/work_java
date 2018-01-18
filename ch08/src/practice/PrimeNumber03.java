package practice;

public class PrimeNumber03 implements Runnable {
	
	private int max;
	
	public PrimeNumber03(int max) {
		this.max = max;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + ": ");
		for (int i = 2; i <= this.max; i++) {
			int count = 0;
			for (int num = 2; num < i; num++) {
				if (i%num == 0) {
					count += 1;
				}
			}
			if (count == 0) {
				System.out.print(i + " ");

			}

		}
	}

}

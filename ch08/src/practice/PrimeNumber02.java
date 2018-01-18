package practice;

public class PrimeNumber02 extends Thread {
	private int max;

	public PrimeNumber02(int max, String name) {
		this.max = max;
		this.setName(name);
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

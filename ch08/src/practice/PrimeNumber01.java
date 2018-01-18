package practice;

public class PrimeNumber01 extends Thread {

	private int max;
	
	public PrimeNumber01(int max) {
		this.max = max;
	}
	
	@Override
	public void run() {
	
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

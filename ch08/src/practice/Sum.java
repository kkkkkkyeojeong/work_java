package practice;

class NamedSum extends Thread {
	private int max;
	
	public NamedSum(String name, int max) {
		Thread a = new Thread();
		//this.name = a.currentThread().getName()
	}
}


public class Sum extends Thread{
	
	private int max;

	public Sum(int max) {
		super();
		this.max = max;
	}
	
	@Override
	public void run() {
		int total = 0;
		for(int i = 1; i <= max; i++) {
			total += i;
			System.out.print(getName() + ": ");
			System.out.printf("sum(1 : %d) = %d %n", i, total);
		}
	}
	
	public static void main(String[] args) {
		Sum s5 = new Sum(5);
		s5.start();
		
	}

}

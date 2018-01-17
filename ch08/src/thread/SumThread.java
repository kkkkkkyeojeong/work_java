package thread;

public class SumThread implements Runnable {

	private int end;
	
	public SumThread(int end) {
		this.end = end;
	}
	
	@Override
	public void run() {
		int sum = 0;
		for (int i = 1; i <= this.end; i++) {
			sum += i;
			System.out.print(" 현재 스레드 수: " + Thread.activeCount());
			System.out.print(", " + Thread.currentThread().getName());
			System.out.printf(": sum(1: %d) = %d %n", i, sum);
		}
	}
	
	public static void main(String[] args) {
		// main 스레드가 main() 메소드를 호출하므로 이 부분에도 스레드가 이미 실행
		System.out.print("main 스레드 ID: ");
		System.out.print(Thread.currentThread().getId());	// 현재 스레드의 ID 값
		System.out.print(", 현재 스레드 수: ");
		System.out.print(Thread.activeCount());				// 다른 스레드 실행안된상태라 main만 실행중임 
		System.out.print(", 현재 스레드 이름: ");
		System.out.println(Thread.currentThread().getName());
		
		// 직접 구현된 스레드를 실행
		Runnable r1 = new SumThread(5);			// 인터페이스 상속받은 현재 클래스 객체 생성(Runnable에는 스레드 기능 없음)
		Thread th1 = new Thread(r1);			// 스레드 객체 생성하여 스레드 기능 부여 
		th1.start();
	}
}

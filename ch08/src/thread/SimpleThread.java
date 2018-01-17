package thread;

class MyThread extends Thread {
	// 스레드 기능을 구현하기 위한 메소드 재정의
	@Override
	public void run() {
		
		// 기능구현
		for (int i = 1; i <10; i++) {
			System.out.println(this.getName() + ": " + i
					+ " / 실제스레드: " + Thread.currentThread().getName());
											 // 현재 스레드 가져옴  // 이름 호출
		}
	}
}	

public class SimpleThread {
	public static void main(String[] args) {
		MyThread th = new MyThread(); 	// 스레드 생성
		th.start();		// 스레드 시작 메소드 호출 -> MyThread 스레드안의 run 메소드 안의 내용 실행
		// th.run(); -> 바로 메소드로 접근. 메인메소드 스레드로 인해 순차적으로 출력됨 
		
		MyThread th2 = new MyThread();
		th2.start();
	}
}


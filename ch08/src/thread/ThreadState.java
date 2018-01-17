package thread;

public class ThreadState implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(40);		// 40밀리초 멈춤
				System.out.print(Thread.currentThread().getState() + ", ");			// 현재 스레드 상태 출력
				System.out.println(Thread.currentThread().getName() + ": " + i);	// 현재 스레드 이름 출력 
			}
			catch(InterruptedException e) {
				System.out.println("InterruptedException이 발생되어 스레드를 종료합니다. ");
				return;				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("스레드의 모든 상태: 6가지");
		
		// Thread.State enum에 정의된 값들을 하나씩 출력
		for (Thread.State c : Thread.State.values()) {
			System.out.print(c + " ");
		}
		System.out.println('\n');
		
		Thread th = new Thread(new ThreadState());
		System.out.println("기본 우선순위: " + th.getPriority());	// 우선순위 기본값 5
		// 우선순위 지정
		th.setPriority(Thread.NORM_PRIORITY + 2);		// 우선순위 1~10까지 지정가능. 숫자 클수록 우선순위 높음 
		System.out.println("우선순위 변경: " + th.getPriority());
		System.out.println("1단계: " + th.getState());
		th.start();
		System.out.println("2단계: " + th.getState());
		
		try {
			Thread.sleep(130);		// 메인 스레드가 sleep 됨
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th.interrupt();		
		System.out.println("3단계: " + th.getState()); 	// for문 돌던중 Thread.sleep(40);에 걸리게 되서 상태 TIMED_WAITING 출력됨 
		
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("4단계: " + th.getState());
	}
}

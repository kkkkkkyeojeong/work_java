package thread;

class IncThread extends Thread {
	// 생성자구현
	public IncThread(String name) {
		this.setName(name);		// 생성자 이름 지정/ 스레드 이름 입력
	}
	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(50);		// 50밀리초 동안에 잠깐 쉬어라라는 뜻 (1000밀리초 = 1초)
				System.out.print(this.getName() + ": " + i);
				System.out.println(", 활성화된 스레드 수: " + Thread.activeCount());
			}											
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class DecThread extends Thread {
	@Override
	public void run() {
		for(int i = 5; i > 1; i--) {
			try {
				sleep(50);
				System.out.print(getName() + ": " + i);
				System.out.println(", 활성화된 스레드 수: " + activeCount());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// 시작 순서는 CPU마음/ 따로 지정해야함 
		IncThread inc = new IncThread("증가 스레드");		// 생성자 통해 이름 설정 
		inc.start();
		DecThread dec = new DecThread();		// 스레드 이름 지정안해 Thread-1 출력됨
		dec.start();
	}
}

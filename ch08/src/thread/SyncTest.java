package thread;

import java.util.Random;

class BankAccount {
	int balance = 0;	// 은행잔고
	
	// 인출
	// synchronized 추가함으로써 withdraw 메소드 전체를 임계영역으로 설정
	public synchronized void withdraw(int money) {
		// 현재 출금하려는 금액보다 잔고가 많은지 검사 
		if(money >= 0 && this.balance >= money) {
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			balance -= money;
			System.out.printf("%s가 %d 인출하여 현재잔고 %d 입니다. %n", Thread.currentThread().getName(), money, this.balance);
		}
		else if (this.balance < money) {
			System.out.println("잔고가 부족하여 인출할 수 없습니다."); 
		}
	}
		
	// 입금
	// synchronized (this) { } 중괄호 시작부터 끝나는 부분까지 임계영역으로 설정
	public void deposit(int money) {
		synchronized (this) {
			if (money > 0) {
				balance += money;
				System.out.printf("%s가 %d 입금하여 현재잔고 %d 입니다. %n", Thread.currentThread().getName(), money, this.balance);
			}
		}
	}
}

public class SyncTest implements Runnable {
	BankAccount act = new BankAccount();
	
	// 임계영역-Critical Section : 문제가 되었다고 판단하는 영역 / 한덩어리로 만드는 과정 Atomic(원자화)
	@Override
	public void run() {
		//while (true) {
		for (int i = 0; i < 3; i++) {
			int amount = new Random().nextInt(10000);	// 0~10000까지 숫자 랜덤으로 뽑음 
			amount = amount % 10 * 1000;		// 10으로 나눈 나머지이기 때문에 1의 자리값에 1000 곱한 값
			System.out.printf("[%s] 금액 = %d %n", Thread.currentThread().getName(), amount);
			act.deposit(amount);		// 입금
			act.withdraw(amount * 2);	// 출금 (2배로 한 이유는 잔고를 바닥나게 하기 위해서)
			if(act.balance < 0) {
				System.out.printf("[%s] ", Thread.currentThread().getName());
				System.out.println("잔고: " + act.balance + " => 오류 종료");
				return;
			}
		}
	}
		
	public static void main(String[] args) {
		Runnable r = new SyncTest();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th1.setName("철수");
		th2.setName("영희");
		
		th1.start();
		th2.start();
	}
}

package wait;

import java.util.Random;

class BankAccount {
	int balance = 0;		// 은행잔고
	
	// 출금
	public synchronized void withdraw(int money) {
		if(money < 0) {
			System.out.println("인출 금액이 잘못됐습니다.");
			return;
		}
		int count = 0;
		while (balance < money) {
			System.out.printf("[%s] ", Thread.currentThread().getName());
			// 지속적으로 잔금이 부족하여 메소드 종료
			if (++count > 3) {		// 3회 기다린 후 입금금액이 기준에 만족하지 못하면 if문 안으로 들어가 종료됨 
				System.out.println("잔액이 부족하여 출금처리 못하고 종료합니다.");
				return;
			}
			System.out.printf("%16s", "wait(1000) 호출: ");
			System.out.printf("인출요구금액 = %6d, balance = %6d %n", money, balance);
			try {
				// this.wait();
				this.wait(1000);		// 스레드가 1초동안 멈춤
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.printf("[%s] ", Thread.currentThread().getName());
		balance -= money;
		System.out.printf(" %12s 정상인 출금액 = %6d, balance = %6d %n", "정상 출금처리: ", money, balance);
	}
	
	// 입금
	public synchronized void deposit(int money) {
		if(money < 0) {
			System.out.println("입금 금액이 잘못됐습니다.");
			return;
		}
		balance += money;
		System.out.printf("[%s] ", Thread.currentThread().getName());
		System.out.printf("%16s", "notify() 호출: ");
		System.out.printf("계좌입금금액 = %6d, balance = %6d %n", money, balance);
		// this.notify();
		this.notifyAll();		// this.wait(1000); 에 멈춰있던 스레드가 깨어남
	}
}

public class SyncTest implements Runnable {

	BankAccount act = new BankAccount();
	@Override
	public void run() {
		for (int i = 1; i < 3; i++) {
			int amount = (int) (new Random().nextDouble() * 5 + 1) * 10000;
			act.deposit(amount);
			amount = (int)(new Random().nextDouble() * 5 + 1) * 10000;
			act.withdraw(amount);
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

package inheritance.acces;

import java.util.Date;

/*
 * 접근제한자(접근지정자)
 * - private : 같은 클래스 내부에서만 사용가능
 * - (default, package 방식): 패키지 내부에서만 사용가능
 * - protected : default 접근 범위 + 상속받은 클래스 내부까지 사용가능 - 상속받은 클래스를 이용해서 생성한 객체에서 사용가능 

 * - public : 어디서든 접근가능 
 */

public class Account {
	
	public String name;			// 계좌주
	protected Date open;		// 계좌일자
	/*package*/ int number;		// 계좌번호
	private long balance;		// 잔고 
	
	// 생성자(동일 패키지, 하위 클래스에서 사용가능)
	protected Account(String name, int number) {
		this.name = name;
		this.number = number;
		this.open = new Date();
	}
	
	//일반메소드
	//입금메소드
	public long deposit(long amount) {
		return balance += amount;
	}
	
	// 출금메소드
	public long withdraw(long amount) {
		return balance -= amount;
	}
	
	// 계좌정보 및 잔액출력 메소드
	public long checkBalance() {
		System.out.println(name + ": 계좌번호 -> " + number + ", 잔액 -> " + balance);
		return balance;
	}
	
	
	

}

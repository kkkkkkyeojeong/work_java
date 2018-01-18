package practice;

class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}

public class BankAccount {

	private int money;
	private int balance;		// 최저 잔금

	public BankAccount(int balance) {
		this.balance = balance;
	}

	// 입금
	public void deposit (int money) {
		// 입금금액이 양수일 경우에만 입금
		if (money > 0) {
			balance += money;
			System.out.printf("정상 입금처리: 입금금액 = %d, 잔금 = %d %n", money, this.balance);
		}
	}

	// 출금
	public void withdraw(int money) {
		// 출금 금액이 양수이고, 잔고보다 적을 경우에만 출금
		if(money >= 0 && this.balance >= money) {
			this.balance -= money;
			System.out.printf("정상 출금처리: 출금금액 = %d, 잔금 = %d %n", money, this.balance);
		}
		else {
			System.out.println("금액을 잘못 입력하셨습니다.");
		}
		
		/*try {
			
		}
		catch (Exception e) {
			System.out.println("예외발생: " + e);
			return;
		}	*/
		
	}
}

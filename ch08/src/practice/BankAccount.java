package practice;

							// 체크예외 만들기  : 반드시 예외처리가 필요할 경우 
class InvalidWithdraw extends /*Exception*/ RuntimeException { // -> 비체크 예외
	// serialVersionUID 버전 설정 /  다른 컴퓨터로 이동시 같은 버전이 아니면 서로 받아들이지 못함
	private static final long serialVersionUID = 1L;
	
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}

public class BankAccount {

	private int money;
	private int minbalance ;	// 최저 잔금 
	private int balance;		// 잔금

	public BankAccount(int minbalance) {
		this.minbalance = minbalance;
	}

	// 입금
	public void deposit (int money) {
		// 입금금액이 양수일 경우에만 입금
		if (money > 0) {
			this.balance += money;
			System.out.printf("정상 입금처리: 입금금액 = %d, 잔금 = %d %n", money, this.balance);
		}
	}

	// 출금
	public void withdraw(int money) throws InvalidWithdraw {
		// 출금 금액이 음수
		if (money < 0) {
			throw new InvalidWithdraw ("E01: 요청 금액이 음수 입니다.");
		}
		// 최저 잔금 이하로 인출 요청  
		else if (this.balance - money < this.minbalance) {
			throw new InvalidWithdraw ("E02: 최저 잔금 이하로 인출을 요청하였습니다.");
		}
		
		this.balance -= money;
		System.out.printf("정상 출금처리: 출금금액 = %d, 잔금 = %d %n", money, this.balance);
	}
}

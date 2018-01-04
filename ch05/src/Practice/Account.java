package Practice;

public class Account {
	
	private String owner;
	private long balance;
	private long amount;
	
	public Account( ) {
		
	}
	public Account(String owner) {
		this.owner = owner;
	}
	public Account(long balance) {
		this.balance = balance;
	}
	public Account(String owner, long balance) {
		this(owner);
		this.balance = balance;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return this.owner;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getBalance() {
		return this.balance;
	}
	
	public long deposit(long amount) {
		return this.balance += amount;
	}
	
	public long withdraw(long amount) {
		long rewith = this.balance;
		rewith -= amount;
		if (rewith <= 0) {
			System.out.println("잔액이 없습니다.");
			return this.balance = 0;
		}
		this.balance = rewith;
		return this.balance;
		//return this.amount -= amount;
	}
	
	public static void main(String[] args) {
		Account gildong = new Account("홍길동", 1000000);

		System.out.println("현재 잔액: " + gildong.deposit(30000));
		System.out.println("현재 잔액: " + gildong.withdraw(60000));
	}

}

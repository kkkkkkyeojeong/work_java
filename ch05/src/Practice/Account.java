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
		return this.amount += amount;
	}
	
	public long withdraw(long amount) {
		long rewith = this.amount;
		rewith -= amount;
		if (rewith <= 0) {
			System.out.println("잔액이 없습니다.");
			return 0;
		}
		this.amount = rewith;
		return this.amount;
		//return this.amount -= amount;
	}
	
	public static void main(String[] args) {
		Account mama = new Account();
		//mama.amount = 100;
		mama.deposit(300);
		mama.deposit(200);
		//mama.withdraw(150);
		System.out.println("잔금: " + mama.withdraw(600));
	}

}

package obj.setter;

public class CreditCard {
	public String owner;
	private long number;
	private int point;
	private int balance;
	
	public void use(int amount) {
		this.balance += amount;
	}
	
	public void payBill(int amount) {
		this.balance -= amount;
		this.addPoint(amount);
	}
	
	private void addPoint(int amount) {
		this.point += amount/1000;
	}
	
	
	// setter & getter (캡슐화)
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		if (number < 1000_0000_0000_0000L) {
			System.err.println("잘못된 카드 번호입니다.");
			return;
		}
		this.number = number;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

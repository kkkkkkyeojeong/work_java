package obj.constructor;

public class Account {
	
	public String owner;
	public long balance;
	
	// 생성자 구현
	public Account(String owner) {
		this.owner = owner;
	}
	
	public Account(long balance) {
		this.balance = balance;
	}
	public Account(String owner, long balance) {
		
		/*this: Account의 객체, this: 자기자신, super: 부모
		 * 맨위 Account(String owner) 생성자 호출 */
		this(owner);
		// this(balance);
		// == this.owner = owner;
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		Account act1 = new Account("최여진");
		Account act2 = new Account(1000000);
		act2.owner = "홍혜빈";
		Account act3 = new Account("신세경", 200000);
		
		System.out.printf("act1: %s %d %n", act1.owner, act1.balance);
		System.out.printf("act2: %s %d %n", act2.owner, act2.balance);
		System.out.printf("act3: %s %d %n", act3.owner, act3.balance);
	}

}

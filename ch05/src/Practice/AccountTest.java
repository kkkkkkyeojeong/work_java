package Practice;

public class AccountTest {
	
	public static void main(String[] args) {
		Account account = new Account("홍길동", 1000000);
		System.out.println("현재잔액: " + account.withdraw(1100000));
	
		
	}

}

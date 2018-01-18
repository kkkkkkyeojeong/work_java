package practice;

public class Ex03 {

	public static void main(String[] args) {

		/*// 문제 2번
		BankAccount ba = new BankAccount(-100000);

		try {
			ba.withdraw(500000);
		} catch (InvalidWithdraw e) {
			System.out.println(e.getMessage());
		}*/

		BankAccount ba = new BankAccount(-100000);
		ba.deposit(100000);
		ba.withdraw(100000);

		try {
			ba.withdraw(200000);
		}
		catch (InvalidWithdraw e) {
			System.out.println(e.getMessage());
		}
		
	}
}

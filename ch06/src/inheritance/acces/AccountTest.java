package inheritance.acces;

public class AccountTest {
	
	public static void main(String[] args) {
		SavingAccount myaccount = new SavingAccount("강민경", 123567834, 0.32);
		myaccount.deposit(50000);
		myaccount.withdraw(4000);
		myaccount.checkBalance();
		
		System.out.println(myaccount.name);
		System.out.println(myaccount.open);
		System.out.println(myaccount.number);
		// System.out.println(myaccount.balance);		접근불가 
	}

}

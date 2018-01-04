package inheritance.acces;

public class SavingAccount extends Account{
	
	public double rates; 		// 이자율
	
	public SavingAccount(String name, int number, double rates) {
		super(name, number);
		this.rates = rates;
	}
	
	public static void main(String[] args) {
		
		SavingAccount myaccount = new SavingAccount("김태희", 234567654, 0.34);
		myaccount.deposit(400000);
		myaccount.withdraw(50000);
		myaccount.checkBalance();
		
		System.out.println(myaccount.name);
		System.out.println(myaccount.open);
		System.out.println(myaccount.number);
		// System.out.println(myaccount.balance);		접근불가 
	}

}

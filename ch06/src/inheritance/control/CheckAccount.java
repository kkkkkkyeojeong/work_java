package inheritance.control;

import inheritance.acces.Account;
import inheritance.acces.SavingAccount;

public class CheckAccount extends Account {
	
	long minimum;		// 최소 잔액 금액
	 
	public CheckAccount(String name, int number, long minimum) {
		super(name, number);
		this.minimum = minimum;
		super.deposit(minimum);			// deposit(minimum); 으로도 가능
	}
	
	public static void main(String[] args) {
		
		SavingAccount myaccount = new SavingAccount("김태희", 234567654, 0.34);
		myaccount.deposit(250000);
		myaccount.withdraw(50000);
		myaccount.checkBalance();
		
		System.out.println(myaccount.name);
		// System.out.println(myaccount.open);			접근불가
		// System.out.println(myaccount.number);		접근불가
		// System.out.println(myaccount.balance);		접근불가 
		
		CheckAccount caccount = new CheckAccount("이민정", 87542356, 500000);
		caccount.deposit(250000);
		caccount.withdraw(50000);
		caccount.checkBalance();
		
		System.out.println(caccount.name);
		System.out.println(caccount.open);			
		// System.out.println(myaccount.number);		접근불가
		// System.out.println(myaccount.balance);		접근불가 
	}

}

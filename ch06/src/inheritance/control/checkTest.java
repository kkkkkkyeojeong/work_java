package inheritance.control;

import inheritance.acces.SavingAccount;

public class checkTest {
	public static void main(String[] args) {
		SavingAccount myaccount = new SavingAccount("김태희", 234567654, 0.34);
		myaccount.deposit(400000);
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
		System.out.println(caccount.minimum);			
		// System.out.println(myaccount.number);		접근불가
		// System.out.println(myaccount.balance);		접근불가 
	}

}

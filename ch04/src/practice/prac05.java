package practice;

public class prac05 {

	public static void main(String[] args) {
		
		int money = 1000000;
		double rate = 4.5;
		
		
		for (int i = 1; i <=10; i++) {
			double rateM = money * rate * i;
			double result = (int)money*(1 + rate * i) + rateM;
			System.out.println(i + "년 총 금액: " + result);
				
		}
	}
}

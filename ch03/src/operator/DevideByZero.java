package operator;

public class DevideByZero {
	
	public static void main(String[] args) {
		
		short data1 = 32766;
		short data2 = 1;
		// short data3 = data1 + data2;				// 숫자더하면 자동으로 int형이 됨, int가 기본값이라 
		short data3 = (short)(data1 + data2);		// 명시적형변환 int -> double
		short data4 = 32766 + 1;
		System.out.println(data3 + " " + data4);
		
		System.out.println(0.0 / 0.0); 				// Not a Number (숫자가 아니다)
		System.out.println(3 / 0.0);				// 무한대(3이 double 형으로 변환)
		// System.out.println(3 / 0);				// 정수를 0으로 나눌 수 없기 때문에 예외발생
		
		String money = "NaN";
		double moneyDouble = Double.parseDouble(money);
		if (!Double.isNaN(moneyDouble)) {			// isNaN -> 실수형에만 존재
			double balance = 30000;					// 묵시적형변환 int -> double
			balance = balance + moneyDouble;
			System.out.println(balance);
		}
		else {
			System.out.println("금액을 다시 입력해주세요.");
		}
	}

}

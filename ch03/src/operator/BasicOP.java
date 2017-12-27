package operator;

public class BasicOP {

	public static void main(String[] args) {
		
		int day, remainder;
		day = remainder = 365;
		int week = 365 / 7;
		
		System.out.format("1년은 %d일이며 %d주이다.%n", day, week);
		System.out.println(remainder %= 7);
		System.out.println(remainder);
	}
}

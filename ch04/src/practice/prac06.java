package practice;

public class prac06 {
	public static void main(String[] args) {
	
		int degreec = -60;
		double degreef;
		
		while(degreec <= 140) {
			degreef = (9.0 / 5.0)*degreec + 32;
			System.out.println("화씨온도(F) >> " + (int)degreef);
			degreec += 20;
		}
	}
}

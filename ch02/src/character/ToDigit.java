package character;

public class ToDigit {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("���� �ϳ��� �Է��ϼ���.");
		
		int num = input.nextInt();
		printStream(num);
	}
	
	public static void printStream(int result) {
		System.out.printf("%1$o %1$d %1$x", result);
		
	}
}

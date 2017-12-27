package programming.basic;

public class HelloDefaultValue {

	// 필드 선언 - 초기값 자동으로 설정됨 
	static int def;
	static boolean bool;
	static String name;
	
	public static void main(String[] args) {
		
		// 지역변수 선언. 무조건 초기화 해야함 
		int n = 100;
		
		System.out.println(n);
		
		System.out.println(def);
		System.out.println(bool);
		System.out.println(name);
	}
}

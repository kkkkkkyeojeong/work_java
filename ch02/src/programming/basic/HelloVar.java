package programming.basic;

public class HelloVar {
	
	public static void main(String[] args) {
		
	// 변수선언
	int var01;
	
	// 초기화
	var01 = 100;
	
	// 변수 선언 + 초기화
	int var02 = 100;
	
	// 여러 변수의 선언
	int a1, b1, c1;
	
	// 지역변수는 초기화해야 사용가능함
	// int x, y = 3; x는 초기화 안되어있음
	
	int x1 = 1, y1 = 3;
	System.out.println(x1);
	
	byte b = 0xA;
	short s = 32767;
	long distance = 1500_00_000000L;
	double d = 1500E8D; // 1500*E^8
	
	int y = 10, z = 20;
	
	System.out.println(b);
	System.out.println(s);
	System.out.println(distance);
	System.out.println(d);
	System.out.println(y);
	System.out.println(z);
	}
}

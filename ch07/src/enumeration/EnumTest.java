package enumeration;

public class EnumTest {
	public enum P1 {c, cpp, java, csharp};		// P1 은 하나의 클래스, 배열이라 생각  
	public int[] a = {10, 20, 30, 40, 50};
	
	public static void main(String[] args) {
		P1 clang = P1.c;								// 정의한 열거 유형은 하나의 자료 유형으로 이용
		System.out.println(clang.toString());			// 저장된 상수 문자열이 출력 
		
		clang = P1.csharp;
		switch(clang) {
		case csharp:
			System.out.println(clang + ": C# 언어 ");
		}
		
		// for-each 문
		for (P1 p : P1.values()) {				// P1.values() -> 배열이라 생각, 순차적으로 호출 
			System.out.print(p + " ");
		}
		System.out.println();
		
		EnumTest t = new EnumTest();
		for (int item : t.a) {
			System.out.print(item + " ");
		}
	}

}

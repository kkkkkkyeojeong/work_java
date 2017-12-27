package programming.basic;

public class HelloProgramming {

	static String fd = " -- 필드";
	static String md = " -- 메소드";
	
	public static void main(String[] args) {
		System.out.println("자바 클래스의 구조");
		write(fd);
		write(md);
		
	}
	
	public static void write(String word) {
		System.out.println(word);
	}

}

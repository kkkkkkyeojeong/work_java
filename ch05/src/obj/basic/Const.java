package obj.basic;

public class Const {
	public static void main(String[] args) {
		// final 사용시 선언과 초기화 동시에 해야함 
		final int maxSize = 5;
		// maxSize = 8; -> 오류발생
		
		int data[] = new int[maxSize];
		
		System.out.println("배열 크기: " + data.length);
		System.out.println("배열 크기: " + maxSize);
	}

}

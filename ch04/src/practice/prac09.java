package practice;

public class prac09 {
	
	public static void main(String[] args) {
		
		// [0]~[1000] 만들기 위해서 
		int[] prime = new int[1001];
		
		// 0으로 초기화
		for(int i = 0; i < prime.length; i++) {
			prime[i] = 0;
		}
		
		// prime[2]~[1000]까지 1 대입
		for (int i = 2; i<prime.length; i++) {
			prime[2] = 1;
		}
		
	}

}

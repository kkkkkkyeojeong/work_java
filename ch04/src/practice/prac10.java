package practice;

public class prac10 {
	public static void main(String[] args) {
		// 배열 선언과 초기화
		int[][] pascal = new int[10][];

		// 래기드 배열 만들기
		for (int i = 0; i < pascal.length; i++) {
			pascal[i] = new int[i + 1];
		}

		// 순차적으로 돌면서 계산결과 저장
		for (int n = 0; n < pascal.length; n++) {
			for (int r = 0; r < pascal[n].length; r++) {
				pascal[n][r] = factorial(n) / (factorial(r) * factorial(n-r));
			}
		}

		// 순차적으로 출력
		for (int n = 0; n < pascal.length; n++) {
			for (int r = 0; r < pascal[n].length; r++) {
				System.out.print(pascal[n][r] + " ");
			}
			System.out.println();
		}
	}

	static int factorial(int n) {
		int mult = 1;

		// 0! 일 때
		if (n == 0) {
			return 1;
		}

		// 1부터 n까지 곱하는 for문
		for (int i = 1; i <= n; i++) {
			mult *= i;
		}

		return mult;
	}

}

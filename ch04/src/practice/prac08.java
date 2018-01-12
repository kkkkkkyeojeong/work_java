package practice;

public class prac08 {


	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 100; i++) {
			// 2, 3, 5, 7의 배수를 제외한 수
			if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)) {
				System.out.print(i + " ");
				count++;

				// 10개 출력 후 줄바꿈
				if (count == 10) {
					System.out.println();
					count = 0;
				}
			}
		}
	}

}

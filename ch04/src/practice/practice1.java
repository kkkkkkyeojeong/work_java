package practice;

public class practice1 {

	public static void main(String[] args) {
		/*int unit[] = {1, 2, 3, 9, 11};
		char ch[] = {'@', '#', '$', '&'};
		
		System.out.printf("%c %c \n", ch[unit[1]], ch[unit[2]]);*/		
		
		int n = 10;
		
		for (int i=1; i<=n; i++) {
			int mult = 1;
			for(int j=1; j <=i; j++) {
				System.out.printf("%d", j);
				String str = j == i ? "=" : "*";
				System.out.printf("%s", str);
				mult *= j;
			}
			System.out.printf("%d\n", mult);
		}
	}
}

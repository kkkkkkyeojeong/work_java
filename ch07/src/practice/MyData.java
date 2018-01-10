package practice;

import java.util.HashMap;
import java.util.Scanner;

public class MyData<K, V1, V2> {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("김미현", "010-3675-8754");
		hm.put("홍길동", "010-3342-3255");
		hm.put("김이용", "010-3196-3985");
		
		hm.put("김미현", "SKT");
		hm.put("홍길동", "LG");
		hm.put("김이용", "KT");

		Scanner input = new Scanner(System.in);
		System.out.println("검색할 이름을 적으세요. >> ");
		String name = input.next();
		
	}
}

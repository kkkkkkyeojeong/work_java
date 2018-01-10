package practice;

import java.util.HashMap;
import java.util.Scanner;

public class Prac09 {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("김미현", "010-3675-8754");
		hm.put("홍길동", "010-3342-3255");

		Scanner input = new Scanner(System.in);
		System.out.println("검색할 이름을 적으세요. >> ");
		String name = input.next();

		for (String item : hm.keySet()) {
			if (item.equals(name)) {
				String value = hm.get(item);
				System.out.println("입력하신 " + name + "의 전화번호는 " + value + " 입니다.");
			}
		}
	}
}

package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Prac07 {
	
	public static void main(String[] args) {
		
		HashSet<String> setA = new HashSet<String>();		// 입력된 값 
		HashSet<String> setB = new HashSet<String>();		// 입력받은 값
	
		// 문자열 입력받기
		Scanner input = new Scanner(System.in);
		String str = "표준입력으로 문자열을 여러 줄에 입력하세요.\n결과를 보시려면 마지막에 표준입력으로 quit를 입력하세요.";
		System.out.println(str);
		String data = input.nextLine();
		
		// 입력된 문자열, 입력받은 문자열 HashSet에 넣기
		setA.add(str);
		setB.add(data);
		
		while (setB.equals("quit")) {
			break;
		}
		
		//StringTokenizer setAa = new StringTokenizer(str);		// 입력된 값 
		
	}
}

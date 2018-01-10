package practice;

import java.util.Calendar;
import java.util.Scanner;

public class Prac04 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("년도를 입력하세요. >> ");
		int year = input.nextInt();
		System.out.print("월 을 입력하세요. >> ");
		int month = input.nextInt();
		System.out.print("일 을 입력하세요. >> ");
		int day = input.nextInt();
		
		Calendar now = Calendar.getInstance();
		now.add(Calendar.YEAR, year);
		now.add(Calendar.MONTH, month);
		now.add(Calendar.DATE, day);
		
		Integer dOw = now.get(Calendar.DAY_OF_WEEK);
		
		switch(dOw) {
		case 1 :
			System.out.println("요일: 일요일");
			break;
		case 2 :
			System.out.println("요일: 월요일");
			break;
		case 3 :
			System.out.println("요일: 화요일");
			break;
		case 4 :
			System.out.println("요일: 수요일");
			break;
		case 5 :
			System.out.println("요일: 목요일");
			break;
		case 6 :
			System.out.println("요일: 금요일");
			break;
		case 7 :
			System.out.println("요일: 토요일");
			break;
		}
		
	}

}

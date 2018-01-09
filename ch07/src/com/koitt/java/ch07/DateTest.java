package com.koitt.java.ch07;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class DateTest {
	
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);				// 객체가 만들어진 시간 
		System.out.println(now.getTime());		// 1970년 1월 1일 이후 지난 천분의 1초 시간으로 계속 증가되고 있음 
		
									// getDateInstance 타입을 생성하여 변수에게 줌 
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);			// 날짜를 상세하게 표현한다.(LONG <-> SHORT로 간단하게 표현 가능 	
		System.out.println(df.format(now));
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT, Locale.KOREA);// Date, Time 을 구분하여 LONG타입으로 표현 
		System.out.println(df.format(now));
		System.out.println();
		
		// 1970년 1월 1일 이후 지난 천분의 1초 시간으로 생성
		Date when = new Date(100_000_000_000L);		// 1970년 1월 1일 기준 1억 초 이후의 날짜 출력 	
		System.out.println(when + " == " + (Date)when.clone());		// clone-> 객체 when을 다른 메모리위치에 복제한다.
		System.out.println(when.before(now));		// when기준 now보다 더 이전 시간인지 비교. when 이 더 이전 시간이라 true 출력
		System.out.println(when.equals(now));		// 실제 날짜가 같은지 비교 
		System.out.println(when.compareTo(now));	// when - now 비교하여 when 시간이 더 작아 -1 출력  
			
		
	}

}

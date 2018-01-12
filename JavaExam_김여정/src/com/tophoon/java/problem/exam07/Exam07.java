package com.tophoon.java.problem.exam07;

import java.util.Calendar;
import java.util.TimeZone;

public class Exam07 {
	
	public static void printTime(int year, int month, int date, int time) {
		System.out.println(year + "년 " + month + "월 " + date + "일 " + time);
		
	}
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		//Timezone timezone = TimeZone.getTimeZone("Asia/Seoul);"
				
		now.setTime(now.getTime());
		
	
		
		
		
	
	}

}

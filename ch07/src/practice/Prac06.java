package practice;

import java.util.Calendar;

public class Prac06 {
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		int dOfw = now.get(Calendar.DAY_OF_WEEK);
			
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println();
		
		for (int i = 1; i <= 7; i++) {
			String dofws = "";
			switch(i) {
			case 1 :
				dofws = "일요일";
				break;
			case 2 :
				dofws = "월요일";
				break;
			case 3 :
				dofws = "화요일";
				break;
			case 4 :
				dofws = "수요일";
				break;
			case 5 :
				dofws = "목요일";
				break;
			case 6 :
				dofws = "금요일";
				break;
			case 7 :
				dofws = "토요일";
				break;
			}
			System.out.print(dofws + " ");
		}
		
	
		
		
		
	}

}

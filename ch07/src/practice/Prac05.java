package practice;

import java.util.Calendar;

public class Prac05 {
	
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		int dOfw = now.get(Calendar.DAY_OF_WEEK);
		
		String dofws = "";
		switch(dOfw) {
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
		
		int dayCount = now.get(Calendar.DAY_OF_WEEK_IN_MONTH);  // 달에서 요일 횟수 반환
		int dOw = now.get(Calendar.WEEK_OF_MONTH);			 	// 이 달의 몇번째 주
		int dOy = now.get(Calendar.DAY_OF_YEAR);				// 해의 날짜 반환
		int wOy = now.get(Calendar.WEEK_OF_YEAR);				// 해의 주 횟수를 반환
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 " + dofws + " 입니다." );
		System.out.println("이 달의 " + dayCount + "번째 " + dofws + " 입니다.");
		System.out.println("이 달의 " + dOw + "번째 주 입니다.");
		System.out.println("이 해의 " + dOy + "일 입니다.");
		System.out.println("이 해의 " + wOy + "번째 주 입니다.");
		
		
	}

}

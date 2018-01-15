package exception;

public class ExceptionHandling {
	
	static int num[];
	
	public static void main(String[] args) {
		String str[] = {"안녕하세요!", "Hello!"};
		
		try {
			System.out.println(str[0]);
			System.out.println(num.length);			// 예외발생 -> num 자체가 null이라 예외발생(NullPointerException)
			System.out.println(str[2]);				// 예외발생으로 이 문장 실행 안됨
		}
		// catch (NullPointerException e) 경우 위 12번째줄 예외만 받고 나머진 받지 못함/ Exception이라는 상위객체 설정 
		catch (Exception e) {						// 발생한 예외가 이 유형의 하부 객체여야 catch 내부를 실행함 
			// System.out.println("예외 발생: " + e.toString()); 과 같음 
			System.out.println("예외 발생: " + e);
			System.out.println("예외 발생 메시지: " + e.getMessage());
			e.printStackTrace();
		}
		finally {									// 예외 발생과 상관없이 한번 실행되는 모듈
			System.out.println("try 실행");
		}
		
		System.out.println("프로그램이 정상적으로 종료됩니다.");
	}

}

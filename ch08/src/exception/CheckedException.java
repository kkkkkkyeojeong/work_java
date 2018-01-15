package exception;

public class CheckedException {
	
	public static void main(String[] args) {
		// 메소드 Class.forName()을 사용하려면 반드시 예외처리 해야 함
		// forName -> " " 안의 내용을 검색한다. / <?> 컴파일 해봐야 타입을 알 수 있기 때문에 ?로 표시 
		
		/* Class<?> forName = Class.forName("java.lang.Object");	// 빨간줄 -> 컴파일 오류 
		System.out.println(forName); */
		
		Class<?> forName = null;
		try {
			forName = Class.forName("java.lang.Object");	// 컴파일 오류
		} 
		catch (ClassNotFoundException e) {
			/* 
			 * 자동완성의 폐해
			 * printStackTrace() 는 예외에 대한 상세한 정보를 콘솔에 출력하기 때문에,
			 * 프로그램 배포시에는 꼭 막아야 한다.
			 * (Debug용으로만 사용해야함)
			 */
			e.printStackTrace();
		}	
		System.out.println(forName);
		
	}

}

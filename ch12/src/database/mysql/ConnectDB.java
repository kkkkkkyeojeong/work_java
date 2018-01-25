package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) {

		try {
			// JDBC 드라이버의 이름 지정
			String driverName = "com.mysql.jdbc.Driver";	// Driver라는 클래스를 사용하기 위해 경로지정
			// JDBC 드라이버 로드
			Class.forName(driverName);		// 위 경로지정한걸 실행 / Class.forName 메소드: static 블록이 제일 먼저 실행됨 안에 객체생성 코드있음
			// 접속할 정보인 URL 지정
			String dbURL = "jdbc:mysql://localhost:3306";
			// 데이터베이스에 연결
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			System.out.println("Mysql 데이터베이스에 성공적으로 접속했습니다.");
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Mysql 데이터베이스 접속에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
/* C:\mysql-connector-java-5.1.45에서 mysql-connector-java-5.1.45-bin.jar 파일을 복사하여
 * 왼쪽 src에서 새로만든 폴더 lib에 복사 붙여넣기 한다
 * lib폴더에서 오른쪽 클릭 - bulid path 클릭 
 * Referneced Libraries 부분이 생성되면 다시 이클립스를 실행한다.
 *  
 * https://github.com/mysql/mysql-connector-j에서 다운받은 후 C:\mysql-connector-java-5.1.45 붙여넣기 한 후
 * Driver + ctrl 두번째꺼 선택 후 파일 선택에서 다운받은 걸로 바꾸기 
 * 
 */

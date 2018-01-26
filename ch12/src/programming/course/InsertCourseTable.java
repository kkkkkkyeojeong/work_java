package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertCourseTable {
	
public static void main(String[] args) {
		
		String driverName = "org.gjt.mm.mysql.Driver";
		String DBname = "univ";
		String dbURL = "jdbc:mysql://localhost:3306/" + DBname;
		
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// 테이블 생성
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("insert into course (name, professor, maxnum) values ('영어회화', '권해동', 200);");
			stmt.executeUpdate("insert into course (name, professor, maxnum) values ('국어의 이해', '신용현', 120);");
			stmt.executeUpdate("insert into course (name, professor, maxnum) values ('한국 근대사', '전성욱', 80);");
			stmt.executeUpdate("insert into course (name, professor, maxnum) values ('대화의 기법', '김희천', 60);");
			stmt.executeUpdate("insert into course (name, professor, maxnum) values ('컴퓨터 개론', '권순락', 40);");
			System.out.println("테이블에 5개의 레코드가 삽입되었습니다.");
			
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}


}

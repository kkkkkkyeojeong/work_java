package programming.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDeptTable {
	
public static void main(String[] args) {
		
		String driverName = "org.gjt.mm.mysql.Driver";
		String DBname = "univ";
		String dbURL = "jdbc:mysql://localhost:3306/" + DBname;
		
		String sqlCT = "create table department (" + 
				"id 			int 		  auto_increment, " +
				"name			varchar(50), " +
				"numstudent 	int, " + 
				"PRIMARY KEY(id) " + 
				");";
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// 테이블 생성
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("insert into department (name, numstudent) values ('경영학과', 120);");
			stmt.executeUpdate("insert into department (name, numstudent) values ('컴퓨터공학과', 60);");
			stmt.executeUpdate("insert into department (name, numstudent) values ('기계공학과', 80);");
			stmt.executeUpdate("insert into department (name, numstudent) values ('전자공학과', 80);");
			stmt.executeUpdate("insert into department (name, numstudent) values ('국어국문학과', 40);");
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

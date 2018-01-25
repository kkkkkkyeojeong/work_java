package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTable {

	public static void main(String[] args) {

		String driverName = "org.gjt.mm.mysql.Driver";
		String DBName = "mujavadb";
		String dbURL = "jdbc:mysql://localhost:3306/" + DBName;
		String SQL = "select * from student;";

		// JDBC 드라이버 로드
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// 질의를 할 Statement 만들기
			Statement stmt =  con.createStatement();
			
			// 데이터베이스 mujavadb의 테이블 student에 레코드 조회
			ResultSet result = stmt.executeQuery(SQL);
			System.out.println("  --- 테이블 student 내용 조회 ---  ");
			
			// next() -> 커서가 한칸씩 아래로 이동함 (튜플 한줄씩 가져옴)
			while(result.next()) {
				System.out.print(result.getString(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getInt(3) + "\t");
				System.out.println(result.getString(4));			
			}
			
			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("MYsql 데이터베이스에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

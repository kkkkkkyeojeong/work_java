package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

	public static void main(String[] args) {
		try {
			String driverName = "org.gjt.mm.mysql.Driver";
			String dbURL = "jdbc:mysql://localhost:3306";

			// JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			// 질의를 할 Statement 만들기 (작성한 sql문(쿼리문)을 실행하는 부분)
			Statement stmt = con.createStatement();

			// 데이터베이스  myjavadb 만들기
			// select 를 제외한 나머지는 executeUpdate() 사용한다
			int num = stmt.executeUpdate("CREATE DATABASE mujavadb;");	
			if(num == 1) {
				System.out.println("데이터베이스 mujavadb가 생성되었습니다.");
			}
			else {
				System.out.println("이미 생성되어 있는 데이터베이스 입니다.");
			}
			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩에 실패했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Mysql 데이터베이스에 문제가 있습니다.");
			e.printStackTrace();
		}
	}

}

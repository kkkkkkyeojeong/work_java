package database.world_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatDB {

	public static void main(String[] args) {

		String driverName = "org.gjt.mm.mysql.Driver";
		String dbURL = "jdbc:mysql://localhost:3306";

		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			Statement stmt = con.createStatement();
			
			// 데이터베이스 생성
			stmt.executeUpdate("CREATE DATABASE world_0;");
			System.out.println("데이터베이스가 생성되었습니다.");
			
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

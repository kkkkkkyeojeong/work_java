package database.world_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OutResult6 {

	public static void main(String[] args) {

		String driverName = "org.gjt.mm.mysql.Driver";
		String DBname = "world_0";
		String dbURL = "jdbc:mysql://localhost:3306/" + DBname;

		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			// 질의를 할 Statement 만들기
			Statement stmt =  con.createStatement();

			String sql = "SELECT * FROM city WHERE pop >= 3000000;";
			ResultSet result = stmt.executeQuery(sql);
			System.out.println("  --- 테이블 student 내용 조회 ---  ");

			while(result.next()) {
				System.out.print(result.getInt(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getString(3) + "\t");
				System.out.println(result.getInt(4) + "\t");
			}

			stmt.close();
			result.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}

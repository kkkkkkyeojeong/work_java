package database.world_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateInsert {

	public static void main(String[] args) {


		// 참고용 
		
		
		String driverName = "org.gjt.mm.mysql.Driver";
		String DBname = "world_0";
		String dbURL = "jdbc:mysql://localhost:3306/" + DBname;

		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			// Insert 
			String sql = "INSERT INTO city(name, major, pop) VALUES(?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, "서울");
			pstmt.setString(2, "김동훈");
			pstmt.setInt(3, 20000000);
			pstmt.executeUpdate();

			pstmt.setString(1, "인천");
			pstmt.setString(2, "김동훈");
			pstmt.setInt(3, 3500000);
			pstmt.executeUpdate();

			pstmt.setString(1, "대구");
			pstmt.setString(2, "강수복");
			pstmt.setInt(3, 3000000);
			pstmt.executeUpdate();

			pstmt.setString(1, "부산");
			pstmt.setString(2, "남기문");
			pstmt.setInt(3, 5000000);
			pstmt.executeUpdate();

			pstmt.setString(1, "목포");
			pstmt.setString(2, "신용현");
			pstmt.setInt(3, 2000000);
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}
}

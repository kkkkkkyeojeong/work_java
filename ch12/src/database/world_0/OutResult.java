package database.world_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OutResult {

	public static void main(String[] args) {

		String driverName = "org.gjt.mm.mysql.Driver";
		String DBname = "world_0";
		String dbURL = "jdbc:mysql://localhost:3306/" + DBname;

		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// 쿼리문 준비
			// 모든 정보 출력 
			String sql = "SELECT * FROM city;";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
				System.out.print(result.getInt(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getString(3) + "\t");
				System.out.println(result.getInt(4) + "\t");
			}
			
			pstmt.close();
			result.close();
			
			
			sql = "SELECT name FROM city WHERE pop >= 3000000";
			pstmt = con.prepareStatement(sql);
			ResultSet result2 = pstmt.executeQuery();
			System.out.println(result2.getString(0));
				
			/*ResultSet result2 = pstmt.executeQuery();
			
			while(result2.next()) {
			System.out.println(result2.getString(2));
			}*/
			

			
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}

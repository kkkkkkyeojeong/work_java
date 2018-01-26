package programming.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDeptTable {

	public static void main(String[] args) {

		try {
			String DBname = "univ";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBname;

			Class.forName("org.gjt.mm.mysql.Driver");
			
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			String sql = "SELECT * FROM department";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			// 질의결과 처리 
			// executeQuery 메소드 실행시 리턴타입이 ResultSet으로 실행결과 가져옴 
			ResultSet rs = pstmt.executeQuery();
			
			System.out.printf("%s\t%s\t%s\n", "id", "name", "numstudent");
			
			while(rs.next()) {						//rs.getInt(1) 숫자 입력, 필드명 입력 둘다 가능 
				System.out.printf("%s\t%s\t%s\n", rs.getInt("id"), rs.getString("name"), rs.getInt("numstudent"));
			}

			rs.close();
			pstmt.close();
			con.close();



		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}



	}

}

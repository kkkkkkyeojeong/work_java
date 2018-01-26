package database.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Univ {

	public static void main(String[] args) {

		String driverName = "org.gjt.mm.mysql.Driver";
		String dbURL = "jdbc:mysql://localhost:3306";

		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("CREATE DATABASE univ;");
			System.out.println("데이터베이스 univ가 생성되었습니다.");

			stmt.close();
			con.close();

			/* PreparedStatemnet 사용 
			 * 
			 * try {
			 * 	String url = "jdbc:mysql://localhost:3306";
			 * 
			 * 1. 드라이버 로드
				Class.forName("com.mysql.jdbc.Driver");
				
				2. 데이터 베이스 연결
				Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
				
				3. SQL을 위한 객체 생성 및 sql 문 설정
				PreparedStatemnet pstmt = con.prepareStatement("CREATE DATABSE univ");
				
				4. SQL문 실행 
				int result = pstmt.executeUpdate();
				System.out.println(result);

				5. ResultSet을 이용해 질의결과 처리 (생략)
				
				6. 객체연결해제
				stmt.close();
				con.close();*/

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}

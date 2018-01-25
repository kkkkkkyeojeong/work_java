package com.koitt.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStmtTestDrive {
	
	public static void main(String[] args) {
		
		String driverName = "org.gjt.mm.mysql.Driver";
		String DBName = "mujavadb";
		String dbURL = "jdbc:mysql://localhost:3306/" + DBName;
		
		try {
			// JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// SELECT 문 사용
			// 먼저 SQL문을 준비해야한다. / PreparedStatement ? 사용, 쿼리문 재사용 가능 
			String SQL = "SELECT * FROM student;";
			PreparedStatement pstmt = con.prepareStatement(SQL);
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
				System.out.print(result.getString(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getInt(3) + "\t");
				System.out.println(result.getString(4));			
			}
			
			result.close();
			pstmt.close();
			
			// INSERT 문
			SQL = "INSERT INTO student VALUES(?, ?, ?, ?)";
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setString(1, "04");
			pstmt.setString(2, "고길동");
			pstmt.setInt(3, 20131122);
			pstmt.setString(4, "컴퓨터공학과");
			pstmt.executeUpdate();		// 이때 db에 정보 입력됨 
			
			pstmt.setString(1, "05");
			pstmt.setString(2, "또치");
			pstmt.setInt(3, 20140012);
			pstmt.setString(4, "전자기계학과");
			pstmt.executeUpdate();
			
			pstmt.close();
			
			// 종료
			con.close();
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}

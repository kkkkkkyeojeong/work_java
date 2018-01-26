package com.koitt.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.model.Board;

public class DBManager {
	
	public static final String URL = "jdbc:mysql://localhost:3306";
	public static final String DB_NAME = "koitt";
	public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String ID = "root";
	public static final String PASSWORD = "koitt";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// 싱글턴 패턴(Singleton Pattern)
	// 프로그램(board 전체) 내부에서 객체 하나만 생성하도록 하는 패턴 (관리 용이함)
	private static DBManager instance;		// 내부에서 만든 객체를 담는 역할 
	
	private DBManager() {	// private: 클래스 내부에서만 객체를 생성하도록 하기 위해 
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 실패");
		}
	}
	
	public static DBManager getInstance() {
		if (instance == null) {		// null값은 아직 한번도 객체생성을 하지 않은 상태 
			instance = new DBManager();	// 객체생성한다
		}
		return instance; // 방금 생성한 객체를 리턴하거나 기존에 생성했었던 객체를 리턴 
	}
	///////////// 여기까지 싱글턴 패턴
	
	public List<Board> selectAll() throws ClassNotFoundException, SQLException {
		
		conn = DriverManager.getConnection(URL, ID, PASSWORD);
		String sql = "SELECT * FROM board";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		List<Board> list = new ArrayList<Board>();
		while (rs.next()) {
			Board item = new Board(rs.getInt("no"), rs.getString("title"), rs.getString("content"), rs.getString("writer"), rs.getDate("regdate"), rs.getDate("modidate"));
			
			list.add(item);
		}
		
		this.close();
		
		return list;
		
	}
	
	// 객체 연결 해제 
	private void close() throws SQLException {
		if (rs != null) { rs.close(); }
		if (pstmt != null) { pstmt.close(); }
		if (conn != null) { conn.close(); }
	}
	
	
	
	
	
	
	
	
	
	

}

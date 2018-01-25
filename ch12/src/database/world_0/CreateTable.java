package database.world_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	
	public static void main(String[] args) {
		
		String driverName = "org.gjt.mm.mysql.Driver";
		String DBname = "world_0";
		String dbURL = "jdbc:mysql://localhost:3306/" + DBname;
		
		String sqlCT = "create table city (" + 
					"id 	int 		  NOT NULL 	 auto_increment, " +
					"name	varchar(50)   NOT NULL, " +
					"major 	varchar(20), " + 
					"pop	int, " +
					"PRIMARY KEY(id) " + 
					");";
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// 테이블 생성
			Statement stmt = con.createStatement();
			//stmt.executeUpdate(sqlCT);
			//System.out.println("테이블 world_0가 생성되었습니다.");
			
			stmt.executeUpdate("insert into city(name, major, pop) values ('서울', '이명길', 20000000);");
			stmt.executeUpdate("insert into city(name, major, pop) values ('인천', '김동훈', 3500000);");
			stmt.executeUpdate("insert into city(name, major, pop) values ('대구', '강수복', 3000000);");
			stmt.executeUpdate("insert into city(name, major, pop) values ('부산', '남기문', 5000000);");
			stmt.executeUpdate("insert into city(name, major, pop) values ('목포', '신용현', 2000000);");
			System.out.println("테이블에 5개의 레코드가 삽입되었습니다.");
			
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}

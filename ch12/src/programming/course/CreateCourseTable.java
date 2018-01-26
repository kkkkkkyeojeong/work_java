package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCourseTable {
	
	public static void main(String[] args) {
		String driverName = "org.gjt.mm.mysql.Driver";
		String DBName = "univ";
		String dbURL = "jdbc:mysql://localhost:3306/" + DBName;
		
		String sqlCT = "create table course (" + 
				"id 			int 		  auto_increment, " +
				"name			varchar(30), " +
				"professor	 	varchar(30), " + 
				"maxnum		 	int, " + 
				"PRIMARY KEY(id) " + 
				");";
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sqlCT);	
			
			
			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

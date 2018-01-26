package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectCourseMax {

	public static void main(String[] args) {

		try {
			String DBname = "univ";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBname;

			Class.forName("org.gjt.mm.mysql.Driver");
			
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			String sql = "SELECT * FROM course where name LIKE ?";
			
			// 표준입력 받기
			System.out.println("강좌 이름을 입력하세요. >>> ");
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
			name = "%" + name + "%";
			input.close();
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);		// 22번째 ? 자리로 들어감 / 첫번째 ?에 name을 넣는다.
			
			// 질의결과 처리 
			// executeQuery 메소드 실행시 리턴타입이 ResultSet으로 실행결과 가져옴 
			ResultSet rs = pstmt.executeQuery();
			
			System.out.printf("%s\t%s\t%s\t%s\n", "id", "name", "professor", "maxnum");
			
			while(rs.next()) {						//rs.getInt(1) 숫자 입력, 필드명 입력 둘다 가능 
				System.out.printf("%s\t%s\t%s\t%s\n", rs.getInt("id"), rs.getString("name"), rs.getString("professor"), rs.getInt("maxnum"));
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

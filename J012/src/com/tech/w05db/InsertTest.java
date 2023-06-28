package com.tech.w05db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
//		Insert
		String sql = "insert into bookinfo values('0004','난 정말 JAVA를 공부한적이 없다구요','오렌지미디어','신재환','28000')";
		Statement stmt = con.createStatement();
		int count = stmt.executeUpdate(sql);// sql의 오라클에서 가져온 값을 고치려면 executeUpdate를 사용한다. 그 값을 출력했을 때 옳게 됐다면 1이 나온다.
		System.out.println("실행결과 : " + count);

	}

	private static Connection makeConnection() {
		Connection con = null;
//		DB접속 메소드
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "111111";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("DB연결성공");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 없음");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결실패");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
}

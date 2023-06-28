package com.tech.w05db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
//		데이터베이스의 bookinfo를 자바로 가져오기
		Statement stmt = con.createStatement();
		String sql = "select * from bookinfo"; // 오라클에서 가져올 때 ;은 빼야된다.
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {// rs.next는 오라클 테이블의 다음 줄을 가져와라. while은 테이블의 줄만큼 실행되고 없다면 while문을 빠져나간다.
//			받아서 출력하기
			String code = rs.getString("BB_CODE");
			String name = rs.getString("BB_NAME");
			String shop = rs.getString("BB_SHOP");
			String writer = rs.getString("BB_WRITER");
			int price = rs.getInt("BB_price");
//			출력
			System.out.println(code + ":" + name + ":" + shop + ":" + writer + ":" + price);
		}

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

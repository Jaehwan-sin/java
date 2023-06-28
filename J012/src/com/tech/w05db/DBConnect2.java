package com.tech.w05db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 	자바에서 오라클에 접속
public class DBConnect2 {
	public static void main(String[] args) {
//		데이터베이스 연결
		Connection con = makeConnection();

	}

	private static Connection makeConnection() {
		Connection con = null;
//		커넥션을 완성해서 리턴해주기
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

package com.tech.w05db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest2 {
	public static void main(String[] args) throws SQLException {
		addBook("0007","java8","goott미디어","홍길동",20000); // 호출
	}

	public static void addBook(String code, String name, String shop, String writer, int price) throws SQLException {
		Connection con = makeConnection();
//		Insert
		String sql = "insert into bookinfo values("+"'"+code+"','"+name+"','"+shop+"','"+writer+"','"+price+"')";
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

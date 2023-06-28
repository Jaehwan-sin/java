package com.tech.w05db;

import java.sql.DriverManager;

// 	자바에서 오라클에 접속
public class DBConnect {
	public static void main(String[] args) {
//		데이터베이스 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//127.0.0.1 이랑 localhost랑 같은 의미
		String user = "hr";
		String pass = "111111";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection(url,user,pass);
			System.out.println("DB연결 성공");
		} catch (Exception e) {
			System.out.println("DB연결 실패");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}

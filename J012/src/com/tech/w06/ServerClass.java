package com.tech.w06;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(5005);
		System.out.println("서버 준비");

		try {
			while (true) {
				Socket socket = ss.accept();// 서버는 무한으로 돌려야해서 while문을 사용한다.

				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				out.println("홍길동 메시지 전달");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("서버 종료");
			ss.close();
		}
	}

}

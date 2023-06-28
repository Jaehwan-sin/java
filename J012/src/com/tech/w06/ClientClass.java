package com.tech.w06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientClass {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.1.117", 5011);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String res = input.readLine();
		System.out.println("응답내용 : " + res);
		System.exit(0);

	}
}

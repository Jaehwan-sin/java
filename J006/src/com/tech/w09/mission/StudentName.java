package com.tech.w09.mission;

public class StudentName {
	private String pass;

	public void passSet(String name) {

		if (name == "홍길동") {
			pass = "1234";
		} else if (name == "홍길순") {
			pass = "5678";
		}

	}

	public String getPass() {
		return pass;
	}

}

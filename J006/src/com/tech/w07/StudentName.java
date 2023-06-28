package com.tech.w07;


public class StudentName {
	private String pass;
	
	public void name (String a, String b) {
		if (a.equals("홍길동")) {
			pass="1234";
			System.out.println(a+"의 비밀번호는 "+pass+"입니다.");
		}else if (b.equals("홍길순")) {
			pass="5678";
			System.out.println(b+"의 비밀번호는 "+pass+"입니다.");
		}
		
	}

	public String getPass() {
		return pass;
	}
	
}

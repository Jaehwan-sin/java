package com.tech.w09.mission;

public class ProfessorMgrTest {

	public static void main(String[] args) {
//		이름을 전달하고 (StudentName)으로
//		해당하는 비밀번호를 리턴받아 메인에서 출력
//		(홍길동 1234)
//		(홍길순 5678)
//		메인에서 출력 : 홍길동 비밀번호는 1234이다.

		StudentName sn = new StudentName(); // 객체생성

		String name = "홍길순";
		sn.passSet(name);

		System.out.println(name + " 비밀번호는 " + sn.getPass() + "입니다.");

	}
}

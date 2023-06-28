package com.tech.w07;

public class ProfessorMgrTest {
	
	public static void main(String[] args) {
//		이름을 전달하고 (StudentName)으로
//		해당하는 비밀번호를 리턴받아 메인에서 출력
//		(홍길동 1234)
//		(홍길순 5678)
//		메인에서 출력 : 홍길동 비밀번호는 1234이다.
		
		StudentName name = new StudentName();
		
//		String.name=홍길동;
//		String.name=홍길순;
		String str="홍길동";
		String str2="홍길순";
		name.getPass();
		
		System.out.println(name+"의 비밀번호는 "+name.getPass()+"입니다.");
		
	}
}

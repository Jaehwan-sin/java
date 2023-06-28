package com.tech.w09;

public class KoreanTest {
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바","123456-123456");// 숫자를 보내더라도 연산할 목적이 아니라면 문자로 보낸다. ex) 주민번호,전화번호
		
		//전달 한 내용을 메인에서 출력
//		System.out.println(k1.name+k1.ssn); // private로 설정해서 출력이 안되서 메소드로 결과값만 보내서 출력한다.
		
//		메소드를 통해서 접근
		System.out.println(k1.getName());
		System.out.println(k1.getSsn());
		System.out.println(k1.getNation());
		
	}
}

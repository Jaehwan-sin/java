package com.tech.w13;

public class HobbyTest {
	public static void main(String[] args) {
//		취미 취미1 취미2 취미3
//		누구의 취미 : 취미출력
//		출력은 Hobby에서 리턴
//		생성자를 통해서 취미전달

		Hobby hb = new Hobby("홍길동", "운동", "음악듣기", "독서");

		System.out.println(hb.getName() + "의 취미는 " + hb.getA() + "," + hb.getB() + "," + hb.getC());

	}
}

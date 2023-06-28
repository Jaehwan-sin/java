package com.tech.w01;

public class ThirdClass {
	public static void main(String[] args) {

		SecondClass sc = new SecondClass();// 세컨드클래스에서 상속받아 퍼스트클래스가 불러진다.
		// Secondclass 의 출력값이 나오지만 Secondclass를 주석처리하면 firstclass의 값이 출력된다.
		sc.print();

	}
}

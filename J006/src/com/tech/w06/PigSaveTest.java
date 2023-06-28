package com.tech.w06;

public class PigSaveTest {
	public static void main(String[] args) {

		PigSave save = new PigSave();
		save.deposit(100);
		save.deposit(10000);
		save.deposit(2000);
		save.deposit(2000);
//		save.total = 0; 쓰면 total 값이 다 날라감.
//		위에 처럼 private 이면 접근이 안되지만 public으로 메소드를 결과값만 호출하면 값이 불러와진다.

		System.out.println("total : " + save.getTotal());

	}
}

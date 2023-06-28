package com.tech.w11;

public class orderutill {
	private static int count;

	// static은 공간을 객체간 사용

	public static void main(String[] args) {
		orderutill u1 = new orderutill();
		orderutill u2 = new orderutill();
		orderutill u3 = new orderutill();

		u1.pressButton();
		u2.pressButton();
		u3.pressButton();

	}

	public void pressButton() {
		count++;
		System.out.println("고객님 접수 번호는 " + count + "번째 입니다.");
	}
}

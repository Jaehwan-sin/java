package com.tech.w08;

public class Ball {
	private double radius;

	public Ball(double radius) {
//		System.out.println("마더파더");
//		this는 이 곳 클래스를 의미한다.
		System.out.println("1:" + this.radius);

		this.radius = radius;// radius를 구분짓기 위해 this를 사용한다.
		System.out.println("2:" + this.radius);
	}

	@Override
	public String toString() {
//		System.out.println("호출");
		return "공의 반지름 : " + radius; // this 안 써도 된다.
	}

}

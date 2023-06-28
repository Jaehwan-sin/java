package com.tech.w08;

public class BallTest extends Ball {
	public static void main(String[] args) {

		BallTest ball = new BallTest(50);// 객체생성
		System.out.println("ball : " + ball);
	}

	public BallTest(double radius) { // 생성자 호출, public ???이 없으므로 생성자이다 구분하는 법 알아두기
//		System.out.println("hihihihi");
		super(radius);// super는 부모클래스인 Ball에게 ()값을 전달한다.
	}
}
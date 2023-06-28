package com.tech.w02;

// 클래스 안에 한 개 이상의 추상메소드가 존재한다면 그 클래스는 추상클래스이다.
public abstract class Employee {
	private String empno;// 사번
	private String ename;// 이름
	private int pay;// 급여

	// 추상메소드
	public abstract void getMonthPay(); // 중괄호가 없다. 추상 메소드는 메소드와 클래스에 abstract를 꼭 써줘야한다.

	public abstract void getMonthPay2(); // 중괄호가 없다. 추상 메소드는 메소드와 클래스에 abstract를 꼭 써줘야한다.

	public abstract void getMonthPay3(); // 중괄호가 없다. 추상 메소드는 메소드와 클래스에 abstract를 꼭 써줘야한다.
	// 중괄호 내용이없다. 하지만 상속 받는 곳에서 구체적으로 구현해줘야한다.

	// 일반메소드
	public void ppp() {
		// todo
	}

}

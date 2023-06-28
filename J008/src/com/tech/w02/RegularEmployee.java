package com.tech.w02;

public class RegularEmployee extends Employee {

	@Override
	public void getMonthPay() { // 추상 메소드를 상속받게되면 받는 쪽에서 구체적으로 그 메소드를 표현해야한다.
		// 여기서 새로운 정의를 해야한다.

	}

	@Override // 부모 클래스의 있는 것을 자식 클래스에서 재정의
	public void getMonthPay2() {
		// 여기서 새로운 정의를 해야한다.

	}

	@Override
	public void getMonthPay3() {
		// 여기서 새로운 정의를 해야한다.

	}

}

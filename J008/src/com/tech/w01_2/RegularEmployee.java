package com.tech.w01_2;

public class RegularEmployee extends Employee {

	private int bonus; // bonus는 여기에만 있는 값이니까 여기 필드에서 생성

	public RegularEmployee(String empno, String ename, int pay, int bonus) {
		super(empno, ename, pay);// 3개의 정보는 부모클래스로부터 받는다.
		this.bonus = bonus;// bonus만 여기서 받는다.
	}

	@Override
	public double getMonthPay() {
		// 한달급여 계산
		float monthpay=pay/12+bonus/12;
		return monthpay;
	}

	

}

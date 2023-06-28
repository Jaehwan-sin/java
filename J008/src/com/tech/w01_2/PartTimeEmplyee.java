package com.tech.w01_2;

public class PartTimeEmplyee extends Employee {
	private int workDay;

	public PartTimeEmplyee(String empno, String ename,
			int pay, int workDay) {
		super(empno, ename, pay);
		this.workDay = workDay;

	}

	@Override
	public double getMonthPay() {
		// 한달급여 계산
		float monthpay=pay*workDay;
		return monthpay;
	}

}

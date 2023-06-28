package com.tech.w01;

public class EmployeeTest {
	public static void main(String[] args) {
//		사번 이름 연봉 보너스 등 내용 전달하고 급여 산출

		Employee emp1 = new RegularEmployee("E001", "홍길동", 3000, 500);

		System.out.println(emp1);
		System.out.println(emp1.getMonthPay());
	}
}

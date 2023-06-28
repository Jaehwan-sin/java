package com.tech.w01_2;

public class EmployeeTest {
	public static void main(String[] args) {
//		사번 이름 연봉 보너스 등 내용 전달하고 급여 산출

		Employee emp1 = new RegularEmployee("E001", "홍길동", 3000, 500);
		Employee emp2 = new TempEmployee("E002", "홍길순", 4000, 0);
		Employee emp3 = new PartTimeEmplyee("E003","황진희", 50,10);
		
		System.out.println(emp1);
		System.out.println(emp1.getMonthPay());
		
		System.out.println(emp2);
		System.out.println(emp2.getMonthPay());
		
		System.out.println(emp3);
		System.out.println(emp3.getMonthPay());
	}
}

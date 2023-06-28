package com.tech.w05;

public class SalaryTest {
	public static void main(String[] args) {
//		급여 명세서를 작성
//		조건 1 = 기본급이 1,500,000원 수당이 55,000원 세금은 기본급의 10%
//		조건 2 = 실수령액 = 기본급 + 수당 - 세금
//		출력은 메인에서 출력

		Salary sal = new Salary();
		int gibon = 1500000;
		int sudan = 55000;
		int X = sal.getSalary(gibon, sudan);

		System.out.println("실수령액 출력 : " + X);

	}
}

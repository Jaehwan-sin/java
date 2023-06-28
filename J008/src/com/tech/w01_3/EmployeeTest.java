package com.tech.w01_3;

public class EmployeeTest {
	public static void main(String[] args) {
//		사번 이름 연봉 보너스 등 내용 전달하고 급여 산출

		Employee[] emps = new Employee[4];// 배열 선언 후 출력
		// 애초에 배열안에 선언을 하기위해 Employee라는 클래스를 공통적으로 넣어서 Employee 배열로 정의가 가능하다.
		emps[0] = new RegularEmployee("E001", "홍길동", 3000, 500);
		emps[1] = new TempEmployee("E002", "홍길순", 4000, 0);
		emps[2] = new PartTimeEmplyee("E003", "황진희", 50, 10);
		emps[3] = new RegularEmployee("E004", "홍길동2", 5000, 1500);
//		Employee emp1 = new RegularEmployee("E001", "홍길동", 3000, 500);
//		Employee emp2 = new TempEmployee("E002", "홍길순", 4000, 0);
//		Employee emp3 = new PartTimeEmplyee("E003","황진희", 50,10);

//		System.out.println(emps[0]);
//		System.out.println(emps[0].getMonthPay());
//		System.out.println(emps[1]);
//		System.out.println(emps[1].getMonthPay());

		// 반복 없애기 (for문 활용)
		for (int i = 0; i < emps.length; i++) {
			printpay(emps[i]); // 출력문을 메소드로 생성
		}

	}

	private static void printpay(Employee emp) {//emp는 개발자 마음으로 정한다.
		System.out.println("===================");
		System.out.println(emp);
		System.out.println("-------------------");
		System.out.println(emp.getMonthPay());
	}
}

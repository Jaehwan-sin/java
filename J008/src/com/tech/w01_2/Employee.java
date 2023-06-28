package com.tech.w01_2;

public abstract class Employee {
	protected String empno;// 사번
	protected String ename;// 이름
	protected int pay;// 급여

	public Employee(String empno, String ename, int pay) {
		this.empno = empno;
		this.ename = ename;
		this.pay = pay;
	}

	public abstract double getMonthPay();
	
	@Override
	public String toString() {// toString은 object의 메소드로 object는 최상위 부모클래스에서 상속받으며 생략이 가능하다.
		// TODO Auto-generated method stub
		return empno+":"+ename+":"+pay;
	}

}

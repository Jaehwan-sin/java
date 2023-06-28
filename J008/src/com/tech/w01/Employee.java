package com.tech.w01;

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
	public String toString() {
		// TODO Auto-generated method stub
		return empno+":"+ename+":"+pay;
	}

}

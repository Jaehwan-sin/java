package com.tech.w02lunch2;

public abstract class Lunch {
	protected String fname;//3
	protected int fprice;
	protected int personCnt;

	public Lunch(String fname, int fprice, int personCnt) {//2
		this.fname = fname;//4
		this.fprice = fprice;
		this.personCnt = personCnt;
	}

	public abstract double getTotal();//5

	@Override
	public String toString() {
		return fname+":"+fprice+":"+personCnt;
	}

}

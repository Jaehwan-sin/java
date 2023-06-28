package com.tech.w05mission;

public abstract class Trans {
	protected int num;
	protected int distance;

	public Trans(int num, int distance) {
		this.num = num;
		this.distance = distance;
	}
 
	public abstract double getCharge();
	
	@Override
	public String toString () {
		return "인원 : "+num+" 거리 : "+distance;
	}
}

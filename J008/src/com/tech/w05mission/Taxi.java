package com.tech.w05mission;

public class Taxi extends Trans {
	protected int price;

	public Taxi(int num, int distance, int price) {
		super(num, distance);
		this.price=price;
	}

	@Override
	public double getCharge() {
		float charge = num * distance * price;
		return charge;
	}

}

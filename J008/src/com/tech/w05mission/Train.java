package com.tech.w05mission;

public class Train extends Trans {
	protected int price;

	public Train(int num, int distance, int price) {
		super(num, distance);
		this.price = price;
	}

	@Override
	public double getCharge() {
		float charge = num * distance * price;
		return charge;
	}

}

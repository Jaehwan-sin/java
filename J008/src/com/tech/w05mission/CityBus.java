package com.tech.w05mission;

public class CityBus extends Trans {
	protected int price;

	public CityBus(int num, int distance, int price) {
		super(num, distance);
		this.price = price;
	}

	@Override
	public double getCharge() {
		float charge = num * distance;
		return charge;
	}

}

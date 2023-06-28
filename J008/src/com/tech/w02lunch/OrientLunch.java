package com.tech.w02lunch;

public class OrientLunch extends Lunch {
	private double discount;
	
	public OrientLunch(String menu, int price,
			int num, double discount) {
		super(menu, price, num);
		this.discount=discount;
		
	}

	@Override
	public double getTotal() {
		double Total=(price*num)-price*num * discount;
		return Total;
	}

	
	
	
}

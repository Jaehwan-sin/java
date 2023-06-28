package com.tech.w02lunch;
	
public class ChinaLunch extends Lunch {
	private double discount;

	public ChinaLunch(String menu, int price,
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

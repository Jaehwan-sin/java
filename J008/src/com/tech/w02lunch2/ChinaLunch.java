package com.tech.w02lunch2;

public class ChinaLunch extends Lunch {// 6
	private double discount;// 9

	public ChinaLunch(String fname, int fprice,
			int personCnt, double discount) {// 7
		
		super(fname, fprice, personCnt);
		this.discount = discount;// 10
	}

	@Override
	public double getTotal() {// 8
		double tot = fprice * personCnt * (1 - discount);// 11
		return tot;
	}

}

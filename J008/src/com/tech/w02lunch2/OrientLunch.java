package com.tech.w02lunch2;

public class OrientLunch extends Lunch {
	private double discount;
	
	public OrientLunch(String fname, int fprice, 
			int personCnt, double discount) {
		
		super(fname, fprice, personCnt);
		this.discount=discount;
	}

	@Override
	public double getTotal() {
		double tot=fprice * personCnt *(1-discount);//11
		return tot;
	}
	
	

	
	
	
}

package com.tech.w04inter2;

public class BurCookTest {
	public static void main(String[] args) {
		BurCook cook1 = new FastCook();
		BurCook cook2 = new HotelCook();
		BurCook cook3 = new TotalCook();
		
		cook1.makeBur();
		cook1.makeSalad();
		
		cook2.makeBur();
		cook2.makeSalad();
		
		cook3.makeBur();
		cook3.makeSalad();
//		cook3.makeRiceBur();
	}
}

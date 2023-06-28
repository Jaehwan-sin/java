package com.tech.w04inter2;

public class HotelCook implements BurCook {

	@Override
	public void makeBur() {
		System.out.println("호텔 햄버거");

	}

	@Override
	public void makeSalad() {
		System.out.println("호텔 샐러드");

	}

}

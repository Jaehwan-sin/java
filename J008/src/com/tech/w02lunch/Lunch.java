package com.tech.w02lunch;

public abstract class Lunch {

	protected String menu;
	protected int price;
	protected int num;
//	protected double discount;

	public Lunch(String menu, int price, int num) {
		this.menu = menu;
		this.price = price;
		this.num = num;
//		this.discount = discount;
	}

	public abstract double getTotal();

	@Override
	public String toString() {
		return "메뉴 : "+menu+" 가격 : "+price+" 인원 : "+num;
	}

}

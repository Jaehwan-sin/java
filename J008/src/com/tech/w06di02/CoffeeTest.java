package com.tech.w06di02;

public class CoffeeTest {// di를 쓰면 유지보수가 쉽다.
	public static void main(String[] args) {

//		HotAmericano hot = new HotAmericano();
//		IceAmericano ice = new IceAmericano();

		Coffee coffee = new Coffee(new HotAmericano());
		coffee.coffeeType();

	}
}

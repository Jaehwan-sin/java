package com.tech.w02;

public class CarMakeClass {
	public static void main(String[] args) {

		BenzClass bc = new BenzClass();
		EquusClass ec = new EquusClass();
		SonataClass sc = new SonataClass();
		
		bc.carBase();
		bc.doJoripBenz();

		ec.carBase();
		ec.doJoripEquus();

		sc.carBase();
		sc.doJoripSonata();

	}
}

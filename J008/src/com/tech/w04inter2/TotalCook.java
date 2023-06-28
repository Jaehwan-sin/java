package com.tech.w04inter2;

public class TotalCook implements BurCook, HomeCook {// 인터페이스는 여러개 상속 받을 수 있다.

	@Override
	public void makeBur() {
		System.out.println("Home 햄버거");

	}

	@Override
	public void makeSalad() {
		System.out.println("Home 샐러드");

	}

	@Override
	public void makeRiceBur() {
		System.out.println("Home Rice 햄버거");

	}

}

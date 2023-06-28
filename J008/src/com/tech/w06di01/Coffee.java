package com.tech.w06di01;

public class Coffee {
	private HotAmericano ame;// = new HotAmericano(); 이렇게 하면 무조건 ame는 핫 아메리카노여서 융퉁성이 없다.
	private IceAmericano ame2;

	public Coffee() {
		ame = new HotAmericano();// 실제 객체생성
		ame2 = new IceAmericano();
		System.out.println("생성자 : contructor");
	}

	public void coffeeType() {
		System.out.println(ame.getName());
	}

	public void coffeeType2() {
		System.out.println(ame2.getName2());
	}
}

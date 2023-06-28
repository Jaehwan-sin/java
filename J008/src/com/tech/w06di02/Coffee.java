package com.tech.w06di02;

public class Coffee {
//	private HotAmericano ame;// = new HotAmericano(); 이렇게 하면 무조건 ame는 핫 아메리카노여서 융퉁성이 없다.
//	private IceAmericano ame;
//	인터페이스를 접목한 di 구현
	private Americano ame;

	public Coffee(Americano ame) {// di 주입
//		ame = new HotAmericano();// 실제 객체생성
//		ame = new IceAmericano();

		this.ame = ame;
		System.out.println("생성자 : contructor");
	}

//	public Coffee(Americano ame) {
//
//	}

	public void coffeeType() {
		System.out.println(ame.getName());
	}
}

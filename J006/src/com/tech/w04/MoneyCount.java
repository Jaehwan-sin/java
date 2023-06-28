package com.tech.w04;

public class MoneyCount {

	public void moneyPrint(int money) {
		// 65430원을 만들기 위한 화폐의 갯수를 구하시오.
		// money = 65430원
		// 만원 = 6 천원 = 5 백원 = 4 십원 = 3
		System.out.println("금액은 : " + money);
		int m10000, m1000, m100, m10, m1;

		m10000 = money / 10000;
		System.out.println("만원 갯수는 : " + m10000);

		money = money - m10000 * 10000;
		m1000 = money / 1000;
		System.out.println("천원 갯수는 : " + m1000);

		money = money - m1000 * 1000;
		m100 = money / 100;
		System.out.println("백원 갯수는 : " + m100);

		money = money - m100 * 100;
		m10 = money / 10;
		System.out.println("십원 갯수는 : " + m10);

		money = money - m10 * 10;
		m1 = money;
		System.out.println("일원 갯수는 : " + m1);
	}

}

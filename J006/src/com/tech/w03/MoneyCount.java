package com.tech.w03;

public class MoneyCount {

	public void moneyPrint(int money) {
		// 65430원을 만들기 위한 화폐의 갯수를 구하시오.
		// money = 65430원
		// 만원 = 6 천원 = 5 백원 = 4 십원 = 3
		int a = money / 10000;
		int b = (money / 10000) / 1000;
		int c = (money / 1000) / 100;
		int d = (money / 100) / 10;
		System.out.println("금액 : " + money);
		System.out.println("만원은 : " + a + "\n천원은 : " + b + "\n백원은 : " + c + "\n십원은 : " + d);

	}

}

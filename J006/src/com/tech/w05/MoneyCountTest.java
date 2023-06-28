package com.tech.w05;

public class MoneyCountTest {
	public static void main(String[] args) {
		MoneyCount mc = new MoneyCount();
		int money=65430;
		int[] arr=mc.moneyPrint(money);
		
		System.out.println("금액은 : "+money);
		System.out.println("만원 갯수는 : "+arr[0]);
		System.out.println("천원 갯수는 : "+arr[1]);
		System.out.println("백원 갯수는 : "+arr[2]);
		System.out.println("십원 갯수는 : "+arr[3]);
		System.out.println("일원 갯수는 : "+arr[4]);
	}
	
	
}

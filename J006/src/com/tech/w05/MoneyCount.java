package com.tech.w05;

public class MoneyCount {
	
	public int[] moneyPrint (int money) {
		// 65430원을 만들기 위한 화폐의 갯수를 구하시오.
		// money = 65430원
		// 만원 = 6 천원 = 5 백원 = 4 십원 = 3
		
//		int m10000,m1000,m100,m10,m1;
		int[] arr = new int[5];
		
		arr[0]=money/10000;
		
		money=money-arr[0]*10000;
		arr[1]=money/1000;
		
		money=money-arr[1]*1000;
		arr[2]=money/100;
		
		money=money-arr[2]*100;
		arr[3]=money/10;
		
		money=money-arr[3]*10;
		arr[4]=money;
		
		return arr;
	}
	
}

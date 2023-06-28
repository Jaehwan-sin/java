package com.tech.w02lunch2;

public class LunchTest {
	public static void main(String[] args) {
//		메뉴이름,가격,갯수,할인율
//		토탈금액 리턴

		Lunch[] lunch = new Lunch[3]; // 배열선언
		lunch[0] = new ChinaLunch("마라탕", 10000, 3, 0.4); // 1
		lunch[1] = new OrientLunch("소갈비", 20000, 5, 0.3);
		lunch[2] = new WestLunch("안심스테이크", 30000, 4, 0.15);

		for (int i = 0; i < lunch.length; i++) {
			printLunch(lunch[i]);
		}
	}

	private static void printLunch(Lunch food) {
		System.out.println("==============");
		System.out.println("홍길동 " + food);
		System.out.println(food.getTotal());

	}
}

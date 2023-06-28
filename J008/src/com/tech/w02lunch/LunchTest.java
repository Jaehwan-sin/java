package com.tech.w02lunch;

public class LunchTest {
	public static void main(String[] args) {
//		메뉴이름,가격,갯수,할인율
//		토탈금액 리턴

		Lunch[] luncharray = new Lunch[3];
		luncharray[0] = new ChinaLunch("짜장면(재환)", 8000, 4, 0.1);
		luncharray[1] = new OrientLunch("쌀국수(재환)", 9000, 5, 0.11);
		luncharray[2] = new WestLunch("햄버거(재환)", 10000, 6, 0.12);

		for (int i = 0; i < luncharray.length; i++) {
			printFood(luncharray[i]);
		}

	}

	private static void printFood(Lunch food) {
		System.out.println("===============");
		System.out.println(food);
		System.out.println(food.getTotal());
	}
}
//Lunch lunch = new ChinaLunch("짜장면(재환)", 8000, 4, 0.1);
//Lunch lunch2 = new OrientLunch("쌀국수(재환)", 9000, 5, 0.11);
//Lunch lunch3 = new WestLunch("햄버거(재환)", 10000, 6, 0.12);

//System.out.println(lunch.toString());
//System.out.println(lunch.getTotal());
//System.out.println(lunch2.toString());
//System.out.println(lunch2.getTotal());
//System.out.println(lunch3.toString());
//System.out.println(lunch3.getTotal());
package com.tech.w05;

public class IfSeason1 {
	public static void main(String[] args) {
//		봄 여름 가을 겨울 switch를 if로 수정
		int season = (int) (Math.random() * 12) + 1;
		System.out.println(season);
		if (season == 1) {
			System.out.println("겨울");
		} else if (season == 2) {
			System.out.println("겨울");
		} else if (season == 3) {
			System.out.println("봄");
		} else if (season == 4) {
			System.out.println("봄");
		} else if (season == 5) {
			System.out.println("봄");
		} else if (season == 6) {
			System.out.println("여름");
		} else if (season == 7) {
			System.out.println("여름");
		} else if (season == 8) {
			System.out.println("여름");
		} else if (season == 9) {
			System.out.println("가을");
		} else if (season == 10) {
			System.out.println("가을");
		} else if (season == 11) {
			System.out.println("겨울");
		} else if (season == 12) {
			System.out.println("겨울");
		}

	}
}

package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam3 {
	public static void main(String[] args) {
//		윤년 판단계속
//		연도를 계속입력하도록 -> 판정
//		프로그램을 빠져나오기 -1

		Scanner s = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		while (true) {// 무한루프
			String str = "";
			System.out.println("연도를 입력하세요");
			int year = sc.nextInt();

			if (year == -1) {
				System.out.println("프로그램종료");
				break;
			}

			if (year % 400 == 0) {
				str = "윤년1";
			} else if (year % 100 == 0) {
				str = "평년1";
			} else if (year % 4 == 0) {
				str = "윤년2";
			} else {
				str = "평년2";
			}
			System.out.println(year + ":는" + str);
		}

	}
}

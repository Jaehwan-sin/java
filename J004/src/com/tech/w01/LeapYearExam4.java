package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam4 {
	public static void main(String[] args) {
//		윤년 판단계속
//		연도를 계속입력하도록 -> 판정
//		프로그램을 빠져나오기 -1

		Scanner s = new Scanner(System.in);

		while (true) {// 무한루프
			String str = "";
			System.out.println("연도를 입력하세요");
			int yearNum = s.nextInt();

			if (yearNum == -1) {
				System.out.println("프로그램종료");
				break;
			}

			if (yearNum % 400 == 0) {
				str = "윤년1";
			} else if (yearNum % 100 == 0) {
				str = "평년1";
			} else if (yearNum % 4 == 0) {
				str = "윤년2";
			} else {
				str = "평년2";
			}
			System.out.println(yearNum + ":는" + str);
		}

	}
}

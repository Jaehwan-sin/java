package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam2 {
	public static void main(String[] args) {
//		서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로한다.
//		서력 기원 연수가 4,100으로 나누어 떨어지는 해는 평년으로 한다.
//		서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.

		Scanner s = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

//		if (year%4==0) {
//			System.out.println("윤년");
//		}if (year%4==0 && year%100==0) {
//			System.out.println("평년");
//		}if (year%4==0 && year%100==0 && year%400==0) {
//			System.out.println("윤년");
//		}

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}

	}
}

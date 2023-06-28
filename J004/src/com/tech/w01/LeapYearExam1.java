package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam1 {
	public static void main(String[] args) {
//		서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로한다.
//		서력 기원 연수가 4,100으로 나누어 떨어지는 해는 평년으로 한다.
//		서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.

//		출력
		Scanner s = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
//		Scanner sc = new Scanner(System.in);
		int year = s.nextInt();
		System.out.println(year);

	}
}

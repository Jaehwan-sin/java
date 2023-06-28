package com.tech.w03;

import java.util.Scanner;

public class AlbaExam {
	public static void main(String[] args) {
//		시급 일한 시간 수 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("시급 입력하세요");
		int basepay = scanner.nextInt();
		System.out.println("몇시간 일하는 지 입력하세요");
		int workHours = scanner.nextInt();
		int pay = basepay * workHours;
		System.out.println("총임금 : " + pay);

	}
}

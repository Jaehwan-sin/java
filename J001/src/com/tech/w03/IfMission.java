package com.tech.w03;

public class IfMission {
	public static void main(String[] args) {
//		랜덤정수를 입력받고 (100~200)
//		랜덤 정수가 짝인지 홀수인지 판정하세요
//		
//		추가로
//		3의 배수
//		5의 배수 판정

		int score = (int) (Math.random() * 100) + 100;

		System.out.println(score);

		if (score % 2 == 1) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}

		if (score % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else if (score % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
		if (score % 15 == 0) {
			System.out.println("3의 배수이며 5의 배수입니다.");
		}

	}

}

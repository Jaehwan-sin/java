package com.tech.w03mission;

import java.util.Random;

public class DiceCountExam {

	public static void main(String[] args) {
//		주사위를 10000번 던져서 1의 숫자가 몇회, 2의 숫자가 몇회

		int[] dice = new int[6];
		Random random = new Random();

		for (int i = 0; i <= 10000; i++) {
			dice[random.nextInt(6)]++;
		}

		System.out.println("1이 나온 횟수는 : " + dice[1]);
		System.out.println("2가 나온 횟수는 : " + dice[2]);
	}
}

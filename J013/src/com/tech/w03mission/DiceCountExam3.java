package com.tech.w03mission;

import java.util.Arrays;

public class DiceCountExam3 {

	public static void main(String[] args) {
//		주사위를 10000번 던져서 1의 숫자가 몇회, 2의 숫자가 몇회

		int size = 6;
		int dice[] = new int[size];

		System.out.println(Arrays.toString(dice));

		for (int i = 0; i <= 10000; i++) {
			++dice[(int) (Math.random() * 6)];
		}
		System.out.println(Arrays.toString(dice));
	}
}

package com.tech.w01;

import java.util.Arrays;

public class ForEachExam {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(numbers));

//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		for (int num : numbers) {// foreach
			System.out.print(num + ",");
		}

	}
}

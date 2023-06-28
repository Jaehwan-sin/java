package com.tech.w02;

import java.util.Arrays;

public class LottoArrayExam {
	public static void main(String[] args) {
		// lotto
		// 1~45까지

		int[] arr = new int[6];
//		System.out.println(num);
		System.out.println("로또 번호 추출 개수 : ");

		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
	}
}

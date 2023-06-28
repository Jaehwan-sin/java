package com.tech.w02;

import java.util.Arrays;

public class LottoArrayExam2 {
	public static void main(String[] args) {
		// lotto
		// 1~45까지

		int[] arr = new int[6];
//		System.out.println(num);
		System.out.println("로또 번호 추출 개수 : ");

		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			arr[i] = num;
			System.out.println("arr : " + i + ">>" + arr[i]);
//			중복회피
			for (int j = 0; j < i; j++) { // i번째보다 작을때까지 검사한다.
				if (arr[j] == num) {// 이미 입력된 값과 new 값이 같은 값이 있느냐 (중복된 값)
					i--;
				}
			}

		}
		// 정렬전
		System.out.println(Arrays.toString(arr));
		// 정렬후
//		오름차순 정렬 내림차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

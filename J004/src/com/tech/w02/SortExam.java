package com.tech.w02;

import java.util.Arrays;

public class SortExam {
	public static void main(String[] args) {
		// 버블정렬
		int[] arr = { 20, 10, 5, 30, 2 };
		// 소트 전 출력
		System.out.println(Arrays.toString(arr));

//		제공되는 함수를 이용하는 방법
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("==================");
		int[] arr2 = { 30, 10, 50, 35, 2 };
		System.out.println("정렬전 : " + Arrays.toString(arr2));
//		정렬 알고리즘
		int tmp; // 데이터를 추가할때 데이터를 임시로 저장해놓는 역할
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length - 1; j++) {
				if (arr2[j] < arr2[j + 1]) {
//				데이터교환
					tmp = arr2[j + 1];
					arr2[j + 1] = arr2[j];
					arr2[j] = tmp;
				}
			}
			System.out.println((i + 1) + "차정렬 : " + Arrays.toString(arr2));
		}
		System.out.println("정렬후 : " + Arrays.toString(arr2));
	}
}

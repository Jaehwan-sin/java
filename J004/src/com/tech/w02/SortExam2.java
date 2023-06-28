package com.tech.w02;

import java.util.Arrays;

public class SortExam2 {
	public static void main(String[] args) {
		// 선택정렬

		System.out.println("==================");
		int[] arr2 = { 30, 10, 50, 35, 2 };
		System.out.println("정렬전 : " + Arrays.toString(arr2));
//		정렬 알고리즘
		int tmp; // 데이터를 추가할때 데이터를 임시로 저장해놓는 역할
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length - 1; j++) {
				if (arr2[i] < arr2[j]) {
//				데이터교환
					tmp = arr2[j];
					arr2[j + 1] = arr2[i];
					arr2[i] = tmp;
				}
			}
			System.out.println((i + 1) + "차정렬 : " + Arrays.toString(arr2));
		}
		System.out.println("정렬후 : " + Arrays.toString(arr2));
	}
}

package com.tech.w02;

import java.util.Arrays;

public class TwoDemonArray2 {
	public static void main(String[] args) {
//		이차원 배열 선언
//		5,4 arr 만들어서
		int[][] arr = new int[5][4];
//		값을 1씩 증가된 값이 배열에 쌓이고
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
//		출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

//		Arrays 출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}

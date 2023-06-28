package com.tech.w02;

import java.util.Arrays;

public class TwoDemonArray3 {
	public static void main(String[] args) {
//		이차원 배열 선언
//		5,4 arr 만들어서
//		int[][] arr = new int[5][4];
		int[][] arr= new int[5][]; // 이차원 배열 선언할 때 렬의 값은 생략 가능하다. (행의 값은 생략 불가능)
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[4];
		arr[4]=new int[5];
		
//		값을 1씩 증가된 값이 배열에 쌓이고
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
//		출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ "\t" );
			}
			System.out.println();
		}
	}
}

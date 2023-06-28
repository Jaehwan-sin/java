package com.tech.w02;

import java.util.Arrays;

public class TwoDemonArray4 {
	public static void main(String[] args) {
		
//		이차원배열선언 후 바로 초기화방법
//		
//		5,4 arr 만들어서
//		int[][] arr = new int[5][4];
		int[][] arr = { //이차원 배열 선언할 때 렬의 값은 생략 가능하다. (행의 값은 생략 불가능)
				{1,2,3,4},
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34},		
				{41,42,43,44}		
		};
//		출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		

		}
		
	}


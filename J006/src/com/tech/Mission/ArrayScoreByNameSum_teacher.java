package com.tech.Mission;

import java.util.Scanner;

public class ArrayScoreByNameSum_teacher {
	public static void main(String[] args) {
		// 2차원 배열 성적처리
		
		Scanner scanner = new Scanner(System.in);
		int [][] arr = new int[3][2];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("국어 입력");
			arr[i][0]=scanner.nextInt();
			System.out.println("영어 입력");
			arr[i][1]=scanner.nextInt();
		}
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}
}
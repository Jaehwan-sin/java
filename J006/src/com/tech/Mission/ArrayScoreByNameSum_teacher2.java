package com.tech.Mission;

import java.util.Scanner;

public class ArrayScoreByNameSum_teacher2 {
	public static void main(String[] args) {
		// 2차원 배열 성적처리
		
		Scanner scanner = new Scanner(System.in);
		int [][] arr = new int[3][2];
		int[] sumby = new int[arr.length];
		String[] names = {"학생 A","학생 B","학생 C"}; // 학생이름 a,b,c 변수 선언
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("국어 입력");
			arr[i][0]=scanner.nextInt();
			System.out.println("영어 입력");
			arr[i][1]=scanner.nextInt();
			sumby[i]=arr[i][0]+arr[i][1];
		}
		// sumby 출력
		for (int i = 0; i < sumby.length; i++) {
//			System.out.println(i+1+"번 학생의 합계 : "+sumby[i]);
			System.out.println(i+1+"번("+names[i]+") 학생의 합계 : "+sumby[i]);
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
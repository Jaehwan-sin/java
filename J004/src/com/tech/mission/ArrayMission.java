package com.tech.mission;

import java.util.Scanner;

public class ArrayMission {
	public static void main(String[] args) {
//		10개의 요소를 저장할 수 있는 배열 선언
//		배열에 성적입력을 받는다 50~100점 사이
//		합계 평균 최대점수 최소점수 출력
//		
//		배열선언
		int[] arr = new int[10];
//		입력받기
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		int max = 0;
		int min = 101;

//		for문 활용 합계,평균,최대점수,최소구하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 성적을 입력하세요 : ");
			arr[i] = scanner.nextInt();
			sum += arr[i];
			avg = sum / arr.length;
		}
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
//		출력
		System.out.println("합계는 : "+sum);
		System.out.println("평균은 : "+avg);
		System.out.println("최대값은 : "+max);
		System.out.println("최소값은 : "+min);
	}
}

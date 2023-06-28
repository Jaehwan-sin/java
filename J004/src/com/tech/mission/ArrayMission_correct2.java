package com.tech.mission;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMission_correct2 {
	public static void main(String[] args) {
//		5개의 요소를 저장할 수 있는 배열 선언
//		배열에 성적입력을 받는다 50~100점 사이
//		합계 평균 최대점수 최소점수 출력
//		배열선언
//		입력받기
//		출력
		
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);
		// 입력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "입력");
			arr[i] = scanner.nextInt();
//			입력제한
			if (arr[i] < 50 || arr[i] > 100) {
				i--;
				continue;
			}

		}

//		for문 활용 합계,평균,최대점수,최소구하기
		int sum = 0, max = 0, min = 110;
		float avg = 0.0f;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}
		// 평균
		avg = (float) sum / arr.length;

		System.out.printf("sum : %d,avg : %.1f", sum, avg);
		System.out.printf("\nmax : \n%d, min : %d\n", max, min);

//		System.out.println("sum :"+sum);
//		System.out.println("max :"+max);
//		System.out.println("min :"+min);
//		System.out.println("avg :"+avg);

		System.out.println(Arrays.toString(arr));
		
		
		
	}
}

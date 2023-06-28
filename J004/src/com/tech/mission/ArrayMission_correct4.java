package com.tech.mission;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayMission_correct4 {
	public static void main(String[] args) {
//		5개의 요소를 저장할 수 있는 배열 선언
//		배열에 성적입력을 받는다 50~100점 사이
//		합계 평균 최대점수 최소점수 출력
//		배열선언
//		입력받기
//		출력
		
		Integer[] arr = new Integer[5];
		Scanner scanner = new Scanner(System.in);
		// 입력
		for (int i = 0; i < arr.length; i++) {
			

		}

//		for문 활용 합계,평균,최대점수,최소구하기 + 입력제한
		int sum = 0, max = 0, min = 110;
		float avg = 0.0f;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "입력");
			arr[i] = scanner.nextInt();
//			입력제한
			if (arr[i] < 50 || arr[i] > 100) {
				i--;
				continue;
			}
			
			sum += arr[i];
//			if (max < arr[i])
//				max = arr[i];
//			if (min > arr[i])
//				min = arr[i];
			
			//삼항연산자를 활용해서 최대값 최소값 구하기
			max = arr[i]>max ? arr[i]:max;
			min = arr[i]<min ? arr[i]:min;
			
			
		}
		// 평균
		avg = (float) sum / arr.length;

		System.out.printf("sum : %d, avg : %.1f", sum, avg);
		System.out.printf("\nmax : %d, min : %d\n", max, min);

//		System.out.println("sum :"+sum);
//		System.out.println("max :"+max);
//		System.out.println("min :"+min);
//		System.out.println("avg :"+avg);

		System.out.println(Arrays.toString(arr));
		
		//sort
		Arrays.sort(arr); //입력한 값을 나타내게 하는 명령
		System.out.println(Arrays.toString(arr));
		//역정렬
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

		
	}
}

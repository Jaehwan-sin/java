package com.tech.w01;

import java.util.Scanner;

public class ArrayExam5 {
	public static void main(String[] args) {
//	int[] arr = new int[5];
//	배열선언 다른방법
		int[] arr = { 10, 20, 30, 40, 53 };
//	총점매기기
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];// 배열안의 요소 값을 하나씩 가져와야하니까 arr[i];를 쓴다.
		}
		float avg = sum / (float) arr.length;// float을 안 쓰면 int와 int가 만나 소수점이 없어져서 float으로 미리 형변환을 시킨다.

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("인원수 : " + arr.length);
	}
}

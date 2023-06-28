package com.tech.w01;

import java.util.Scanner;

public class ArrayExam4 {
	public static void main(String[] args) {
//	int[] arr = new int[5];
		int[] arr = { 10, 20, 30, 40, 50 }; // 배열선언 다른방법
		System.out.println("길이 : " + arr.length);
		// 출력

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 한줄출력

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ","); // print 는 가로로 한줄출력
		}
		System.out.println("\n=============");

		// 한줄출력 ,제거

		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) { // , 제거는 legnth-1로 마지막 뒷 글자 하나 제거한다.
				System.out.print(arr[i] + ",");
			} else {
				System.out.print(arr[i]);
			}
		}
		System.out.println("\n=============");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) { // 아니면 참
				System.out.print(arr[i] + ",");
			} else {
				System.out.print(arr[i]);
			}
		}
	}
}

package com.tech.w01;

import java.util.Arrays;

public class AnnonyArray2 {
	public static void main(String[] args) {

//		익명배열, 무영배열
//		사용되는 곳이 한 차례일때, 재사용이 없을때
		System.out.println("sum:" + sum(new int[] { 5, 5, 5, 5, 5 }));

	}

	private static int sum(int[] arrs) {
		int total = 0;
		for (int i = 0; i < arrs.length; i++) {
			total += arrs[i];
		}
		return total;
	}
}

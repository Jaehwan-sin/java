package com.tech.w01;

import java.util.Arrays;

public class AnnonyArray {
	public static void main(String[] args) {
		int[] aa = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(aa));
//		익명배열, 무영배열
//		사용되는 곳이 한 차례일때, 재사용이 없을때
		System.out.println(Arrays.toString(new int[] { 5, 5, 5, 5, 5, 5 }));

	}
}

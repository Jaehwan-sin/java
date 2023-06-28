package com.tech.w07gen3;

import java.util.Arrays;

class GenSwapMethod {

	public static <T> void swap(T[] a, int i, int j) {
//		swap 구현
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;

	}

}

public class GenSwapTest {
	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "orange" };

		System.out.println(Arrays.toString(fruits));
		GenSwapMethod.swap(fruits, 0, 2);
		System.out.println(Arrays.toString(fruits));
	}
}

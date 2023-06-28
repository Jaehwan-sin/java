package com.tech.w08star;

public class StarTest {
	public static void main(String[] args) {

		System.out.println("===========");

		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		System.out.println("===========");

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("===========");

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		System.out.println("===========");

	}
}

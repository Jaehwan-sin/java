package com.tech.w01;

import java.util.Scanner;

public class MoumCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("영어 단어를 입력하세요: ");
		String word = scanner.nextLine();

		countmoum(word);
	}

	public static void countmoum(String word) {
		int count = 0;
		word = word.toLowerCase();

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
			}
		}
		System.out.println("입력한 단어 : " + word);
		System.out.println("영어 모음의 개수: " + count);
	}
}

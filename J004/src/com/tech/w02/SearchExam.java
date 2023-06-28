package com.tech.w02;

import java.util.Scanner;

public class SearchExam {
	public static void main(String[] args) {
		int[] s = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		// 데이터 위치값 찾아가기
		Scanner scan = new Scanner(System.in);
		int value, index = -1; // index=-1 은 인덱스에서 아예 올 수 없는 숫자로 초기화시키는거다.
		System.out.println("탐색할 값을 입력하세요 : ");
		value = scan.nextInt();
		System.out.println(value);

		for (int i = 0; i < s.length; i++) {
			// 검색
			if (value == s[i]) {
				index = i; // i가 위치정보
				break;
			}
		}

		System.out.println(value + "값은 " + (index + 1) + "번째에 위치합니다.");

	}
}

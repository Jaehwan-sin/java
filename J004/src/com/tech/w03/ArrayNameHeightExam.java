package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//	배열1 names에 이름 5인을 미리 입력하고
//	배열2 heights 각각 이름의 키를 입력받아
//	배열 1의 이름에 해당하는 키를 출력하시오.
//	신장토탈 신장평균 출력
		String name[] = { "name1", "name2", "name3", "name4", "name5" };
		int[] heights = new int[name.length];

		int total = 0;
		for (int i = 0; i < heights.length; i++) {
			System.out.println("키를 입력하세요 : ");
			heights[i] = scanner.nextInt();
			total += heights[i];
		}
		for (int i = 0; i < heights.length; i++) {
			System.out.println(name[i] + "의 키는 " + heights[i]);
		}

		System.out.println("키의 합계 : " + total);
		System.out.println("키의 평균 : " + total / (float) heights.length);

	}
}

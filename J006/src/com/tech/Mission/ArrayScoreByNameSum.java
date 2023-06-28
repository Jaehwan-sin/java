package com.tech.Mission;

import java.util.Scanner;

public class ArrayScoreByNameSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 학생 3명의 국어, 영어 성적을 입력받아 2차원 배열에 저장
		int[][] scores = new int[3][2];
		String[] students = { "A", "B", "C" };
		for (int i = 0; i < 3; i++) {
			System.out.print("학생 " + students[i] + "의 국어 성적을 입력하세요: ");
			scores[i][0] = scanner.nextInt();
			System.out.print("학생 " + students[i] + "의 영어 성적을 입력하세요: ");
			scores[i][1] = scanner.nextInt();
		}	

		// 각 학생의 합계를 구하고 출력
		for (int i = 0; i < 3; i++) {
			int total = scores[i][0] + scores[i][1];
			int avg = total/2;
			System.out.println("학생 " + students[i] + "의 성적 합계: " + total + " 평균 : "+avg);
		}
	}
}

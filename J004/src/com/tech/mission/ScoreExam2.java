package com.tech.mission;

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class ScoreExam2 {
	public static void main(String[] args) {
//		배열사이즈는 5
//		점수를 입력받아 배열에 저장
//		평균 합계 인원 출력
//		배열의 이름은 scores
//		배열로 총점매기기
//		입력제한 (0~100)
		
		int[] scores = new int[5];
		int sum=0;
		float avg=0.0f;
		
		Scanner sc= new Scanner(System.in);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"번째 점수를 입력하세요");
			scores[i]=sc.nextInt();
			
			if (scores[i] > 100 || scores[i] < 0) {
				System.out.println("입력제한");
				i--;
			} else {
				sum = sum + scores[i];
				avg = (float) sum / scores.length;
			}
			
			
			}
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("인원수 : " + scores.length);
		
	}
}

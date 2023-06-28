package com.tech.mission;

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class ScoreExam_correct2 {
	public static void main(String[] args) {
//		배열사이즈는 5
//		점수를 입력받아 배열에 저장
//		평균 합계 인원 출력
//		배열의 이름은 scores
//		배열로 총점매기기
//		입력제한 (0~100)
		
		int[] scores = new int[5];
		Scanner scores1=new Scanner(System.in);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"번점수입력: ");
			scores[i]=scores1.nextInt(); // 입력용
		}
		
		int sum=0;
		for (int i = 0; i < scores.length; i++) {
			sum=sum+scores[i];
		}
		
		
		float avg=1.0f;
		avg=sum/scores.length;
//		System.out.println("인원:"+scores.length);
		System.out.println("총점:"+sum);
		System.out.println("평균"+avg);
		
		
		
		
		
		
		
	}
}

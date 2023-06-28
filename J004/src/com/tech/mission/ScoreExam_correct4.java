package com.tech.mission;

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class ScoreExam_correct4 {
	public static void main(String[] args) {
		
		int[] scores = new int[5];
		Scanner scores1=new Scanner(System.in);
		
		int sum=0;
		float avg=1.0f;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"번점수입력: ");
			scores[i]=scores1.nextInt(); // 배열에 입력값 받기	
//			입력데이터제한
			if (!(scores[i]>=0 && scores[i]<=100)) { // 제대로 들어온 범위가 아닌 거냐? 라는 의미 !은 not의 의미 
				//다시 넣기
				i--;// 인덱스를 조정해서 다시 넣기
				continue; // 1번째에 값이 제대로 안 들어가면 다시 진행하게하는 명령어
			}
			sum=sum+scores[i]; // 누적
		}
		
		avg=sum/(float)scores.length;
		System.out.println("인원 : "+scores.length);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
	}
}

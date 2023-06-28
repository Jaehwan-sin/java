package com.tech.mission;

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class ScoreExam_correct3 {
	public static void main(String[] args) {
//		배열사이즈는 5
//		점수를 입력받아 배열에 저장
//		평균 합계 인원 출력
//		배열의 이름은 scores
//		배열로 총점매기기
//		입력제한 (0~100)
		
		int[] scores = new int[5];
		Scanner scores1=new Scanner(System.in);
		
		int sum=0;
		float avg=1.0f;
		boolean flag;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"번점수입력: ");
			scores[i]=scores1.nextInt(); // 배열에 입력값 받기	
//			입력데이터제한
//			flag=scores[i]>=0 && scores[i]<=100; // 이 코드를 살린다면 if (!flag)해도 된다.
//			System.out.println(flag);
			if (!(scores[i]>=0 && scores[i]<=100)) { // 제대로 들어온 범위가 아닌 거냐? 라는 의미 !은 not의 의
				//다시 넣기
				i--;// 인덱스를 조정해서 다시 넣기
			}
			sum=sum+scores[i]; // 누적
		}
		
		avg=sum/scores.length;
		System.out.println("인원:"+scores.length);
		System.out.println("총점:"+sum);
		System.out.println("평균"+avg);
		
	}
}

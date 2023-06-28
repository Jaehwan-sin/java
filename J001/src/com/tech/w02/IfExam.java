package com.tech.w02;

public class IfExam {
	public static void main(String[] args) {
//		if문형식
//		if(조건식) {
//			조건이 참 일때 표현하고 싶은 문장;
//		}else {
//			조건식이 거짓일때 표현하고 싶은 문장;
//		}
		
		int score=80;
		System.out.println(score>=90);
		// 점수가 90점 이상이면 pass로 조건을 달다
		if(score>=90) {
			System.out.println("시험통과");
		} else {
			System.out.println("시험불합격");
		}
	}
}

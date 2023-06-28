package com.tech.w02;

public class IfelseExam3 {
	public static void main(String[] args) {
//		if문을 활용한 데이터 분기
		
		int score=80;
//		String grade; 초기화 명령값임.
		String grade=""; //초기화
		if (score>=90) {
			grade="90점대 점수";
		} else if (score>=80) {
			grade="80점대 점수";
			
		} else if (score>=70) {
			grade="70점대 점수";
			
		} else if (score>=60) {
			grade="60점대 점수";
			
		} else {// 위 조건 이외의 점수
			grade="나머지";
			
		}
		System.out.println(grade);
		}
	}

package com.tech.w02;

public class IfelseExam2 {
	public static void main(String[] args) {
//		if문을 활용한 데이터 분기
		
		int score=50;
		if (score>=90) {
			System.out.println("90점대 점수");
		} else if (score>=80) {
			System.out.println("80점대 점수");
		} else if (score>=70) {
			System.out.println("70점대 점수");
		} else if (score>=60) {
			System.out.println("60점대 점수");
		} else {// 위 조건 이외의 점수
			System.out.println("60미만 점수");
		}
		}
	}

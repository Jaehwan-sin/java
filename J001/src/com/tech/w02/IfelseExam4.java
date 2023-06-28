package com.tech.w02;

public class IfelseExam4 {
	public static void main(String[] args) {
//		if문을 활용한 데이터 분기
//		point를 받기 = 800;
//		
//		point가 900이상 level1
//		point가 800이상 level2
//		point가 700이상 level3
//		나머지는 level0
	
		int point=800;
		String grade;
		
		if (point>=900) {
			grade="Level1";
		} else if (point>=800) {
			grade="Level2";
		} else if (point>=700) {
			grade="Level3";
		} else {
			grade="Level0";
		}
		System.out.println(grade);
		}
	}

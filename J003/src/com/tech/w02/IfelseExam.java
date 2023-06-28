package com.tech.w02;

public class IfelseExam {
	public static void main(String[] args) {
//		if문을 활용한 데이터 분기
//		point를 받기 = 800;
//		
//		point가 900이상 level1
//		point가 800이상 level2
//		point가 700이상 level3
//		나머지는 level0
	
		int point=800;
		
		if (point>=900) {
			System.out.println("level1");
		} else if (point>=800) {
			System.out.println("level2");
		} else if (point>=700) {
			System.out.println("level3");
		} else {
			System.out.println("level0");
		}
		}
	}

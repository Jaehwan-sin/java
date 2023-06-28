package com.tech.w01;

import java.util.Scanner;

public class BMIExam2 {
	public static void main(String[] args) {
//		객체생성
		BMIExam2 m = new BMIExam2();
	
//		float h=1.76f;
//		float w=76.0f;
		
		float h =0.0f;// 키와 몸무게를 입력 받아야 하기 때문에 초기화 명령
		float w =0.0f;
		float index=m.calculate(h,w);
		
		System.out.println("키를 입력하세요");// 키 입력하는 함수
		Scanner c = new Scanner(System.in);
		h = c.nextFloat();
		
		System.out.println("몸무게를 입력하세요");// 몸무게 입력하는 함수
		Scanner d = new Scanner(System.in);
		w = d.nextFloat();
		
		System.out.println("체질량지수 : "+index);
		
//		체질량 지수로 비만도 판정
		String message=m.getResult(index);
		System.out.println("판정 : "+message);
	}
	
	public float calculate (float h, float w) {// calculate는 함수명
		// 계산식
		float hmulti=h*h;
		float index=w/hmulti;
		return index;
	}
	
	public String getResult (float index) {
		String msg;
		if (index>=25) {
			msg = "비만";
		}else if (index>=23) {
			msg = "과체중";
		}else if (index>=18.5) {
			msg = "정상";
		}else {
			msg = "저체중";
		}
		return msg;
//		return ""; 리턴을 위에서 모든값에 대해 리턴을 줬기 때문에 중복 리턴이 되어 삭제해야한다.
	}
}

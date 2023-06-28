package com.tech.w06;

public class ForExam3 {
//	For 반복문
	public static void main(String[] args) {
//		반복문을 사용한 합계 구하기
//		1~10 합계
		int sum = 0; // sum=누적변수
		for (int i = 0; i <= 10; i++) {
//			sum=sum+i;
			sum += i;// += : 복합연산자
//			sum*=i;// *= : 복합연산자 * 할때는 초기값을 0을 주면 안됨.
		}
		// 최종출력
		System.out.println("tot : " + sum);

		// for(초기값;조건식;증감식) {
//			문장
//		}
//	실행순서 : 초기값->조건식->문장->증감식->조건식[조건식->문장->증감식]
//		증가for문

	}
}

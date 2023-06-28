package com.tech.w06;

public class ForExam4 {
//	For 반복문
	public static void main(String[] args) {
//		반복문을 사용한 합계 구하기
//		짝수의 합계 even
//		홀수의 합계 odd
		
		int even=0,odd=0;
//		int sum=0; // sum=누적변수
		for (int i = 0; i <= 10; i++) {
			if (i%2==0) {// 짝수 조건식
				even+=i;// if 다음 한 문장일땐 중괄호 생략 가능
			}else {// 홀수 조건식
				odd+=i;
			}	

		}
		// 최종출력
		System.out.println("짝수 : "+even);
		System.out.println("홀수 : "+odd);
		
		
		even=0;
		odd=0;
		for (int i = 0; i <= 10; i=i+2)
				even+=i;// for 문도 for 다음 한 문장일땐 중괄호 생략 가능
		// 최종출력
		System.out.println("짝수 : "+even);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		for(초기값;조건식;증감식) {
//			문장
//		}
//	실행순서 : 초기값->조건식->문장->증감식->조건식[조건식->문장->증감식]
//		증가for문
		
			
	}
}

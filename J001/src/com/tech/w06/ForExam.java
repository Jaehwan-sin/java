package com.tech.w06;

public class ForExam {
//	For 반복문
	public static void main(String[] args) {
//		for(초기값;조건식;증감식) {
//			문장
//		}
//	실행순서 : 초기값->조건식->문장->증감식->조건식[조건식->문장->증감식]
//		증가for문
		for (int i = 0; i < 10; i++) { // i++는 1씩 증가한다는 뜻
			System.out.println(i + " 반복");
		}

//		2씩 증가for문
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println(i + " 반복");
		}

//		감소for문
		for (int i = 10; i > 0; i--) {
			System.out.println(i + " 반복");
		}

	}
}

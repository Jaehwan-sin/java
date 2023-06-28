package com.tech.w03;

public class IfrandomExam {
	public static void main(String[] args) {

//		double score=Math.random()+50;
//		double score=(Math.random()*50)+50;
		int score = (int) ((Math.random() * 50) + 50);
		System.out.println(score);

		String grade = "";
		if (score >= 90) {
			grade = ("A");
		} else if (score >= 80) {
			grade = ("B");
		} else if (score >= 70) {
			grade = ("C");
		} else if (score >= 60) {
			grade = ("D");
		} else {
			grade = ("F");
		}
		System.out.println(grade + "등급");
//		짝홀구분
//		%나머지 연산자
		if (score % 2 == 1) {// socre를 2로 나눈 나머지가 1이냐?
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}

	}
}

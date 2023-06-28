package com.tech.w10;

public class ScoreTest {

	public static void main(String[] args) {
//		점수 국어 영어 수학
//		누구의 총점 300
//		누구의 평균 100
//		계산은 score에서 리턴
//		생성자를 통해서 점수전달

//		홍길순의 총점 getTotal : 240
//		홍길동의 평균 getAvg : 80
//		출력은 홍길동의 총점은 몇점입니다.

		Score st = new Score("홍길순", 70, 80, 90);
//		ScoreTest scores = new ScoreTest("100","50");

		System.out.println(st.getName()+"의 총점 : "+st.getTotal());
		System.out.println(st.getName()+"의 평균 : "+st.getAvg());
	}
}

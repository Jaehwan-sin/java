package com.tech.w02;


public class Mission4 {
	public static void main(String[] args) {
//		삼각형면적
//		사각형의면적구하기
//		가로 100 width 
//		세로 50 height
//		변수명 
//		면적 recsquare, trisquare
//		타입 stype=4,3 
		
		int width=5;
		int height=5;
		int stype=3;
		String typeStr="";
		float resultsquare=0.0f;
			
		if (stype==4) { // == : 같다의 의
			resultsquare=width*height;	
			typeStr="사각형";
		} else {
			resultsquare=width*height/2.0f;
			typeStr="삼각형";
		}
		System.out.println(typeStr+" 면적은 : "+resultsquare);
	}
}

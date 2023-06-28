package com.tech.w02;


public class Mission3 {
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
		int stype=4;
		
		float recsquare=width*height;
//		float recsquare=width*height/2;
		System.out.println("사각형 : "+recsquare);
		
		float trisquare=width*height/2.0f;
		System.out.println("삼각형 : "+trisquare);
		
		float resultsquare=0;
					
		if (stype==4) {
			resultsquare=width*height;	
		} else {
			resultsquare=width*height/2.0f;
			
		}
		System.out.println("면적은 : "+resultsquare);
	}
}

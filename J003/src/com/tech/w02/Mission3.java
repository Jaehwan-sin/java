package com.tech.w02;


public class Mission3 {
	public static void main(String[] args) {
//		�ﰢ������
//		�簢���Ǹ������ϱ�
//		���� 100 width 
//		���� 50 height
//		������ 
//		���� recsquare, trisquare
//		Ÿ�� stype=4,3 
		
		int width=5;
		int height=5;
		int stype=4;
		
		float recsquare=width*height;
//		float recsquare=width*height/2;
		System.out.println("�簢�� : "+recsquare);
		
		float trisquare=width*height/2.0f;
		System.out.println("�ﰢ�� : "+trisquare);
		
		float resultsquare=0;
					
		if (stype==4) {
			resultsquare=width*height;	
		} else {
			resultsquare=width*height/2.0f;
			
		}
		System.out.println("������ : "+resultsquare);
	}
}

package com.tech.w02;


public class Mission4 {
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
		int stype=3;
		String typeStr="";
		float resultsquare=0.0f;
			
		if (stype==4) {
			resultsquare=width*height;	
			typeStr="�簢��";
		} else {
			resultsquare=width*height/2.0f;
			typeStr="�ﰢ��";
		}
		System.out.println(typeStr+" ������ : "+resultsquare);
	}
}

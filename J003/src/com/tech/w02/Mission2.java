package com.tech.w02;


public class Mission2 {
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
		
		float recsquare=width*height;
//		float recsquare=width*height/2;
		System.out.println("�簢�� : "+recsquare);
		
		float trisquare=width*height/2.0f;
		System.out.println("�ﰢ�� : "+trisquare);
		
		int stype=4;
		
		if (stype==4) {
			System.out.println("�簢�� : "+recsquare);
		} else {
			System.out.println("�ﰢ�� : "+trisquare);
		}
	}
}

package com.tech.w05;

public class IfSeason4 {
	public static void main(String[] args) {
//		봄 여름 가을 겨울 switch를 if로 수정
		int season=(int) (Math.random()*12)+1;
		System.out.println(season);
		if (season==1 || season==2 || season==11 || season==12) {
			System.out.println("겨울");
		}else if (season==3 || season==4 ) {
			System.out.println("봄");
		}else if (season==5 || season==6 || season==7 || season==8) {
			System.out.println("여름");
		}else if (season==9 || season==10) {
			System.out.println("가을");
		}
	}	
		
}


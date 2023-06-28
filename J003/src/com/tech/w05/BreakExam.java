package com.tech.w05;

public class BreakExam {
	public static void main(String[] args) {
		//
//		for (int i=0; i <= 10 ; i++) {
//			System.out.println(i);
//			if (i==5) {
//				break ; // 반복문을 탈출
//			}
//		}
		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 3; j++) {
//				if (i==3) {
//					break ;
//				}
//							
//				System.out.println("i:"+i+",j:"+j);
//			}
//		}
		
		gotolabel: //goto 문법은 많이 쓰이니 잘 써야함.
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				if (i==3) {
//					break ;
					break gotolabel;
				}
				
				System.out.println("i:"+i+",j:"+j);
			}
		}
	}
}

package com.tech.w06;


public class ForGuGuExam3 {
	public static void main(String[] args) {
		//2~9단 출력
		//for문 중첩
		for (int dan = 2; dan < 10; dan++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d \t*\t %d \t= \t%2d \n",dan,j,dan*j);// \t는 탭키만큼 띄워진다. %2d는 2자리의 여백을 확보한다.
			}
			System.out.println("==================");
			
		}
	}
}

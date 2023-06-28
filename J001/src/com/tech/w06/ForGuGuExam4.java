package com.tech.w06;


public class ForGuGuExam4 {
	public static void main(String[] args) {
		//2~9단 출력
		//for문 중첩
		
		//가로로 구구단 출력 (미션) , 횡으로 출력 \n은 줄바꿈(가로세로 출력 바꿔짐)
		
		for (int dan = 1; dan < 10; dan++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d * %d = %2d \t",j,dan,dan*j);// \t는 탭키만큼 띄워진다. %2d는 2자리의 여백을 확보한다.
		}
			System.out.println();
		}		
		
	}

}
 package com.tech.Mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame_teacher4 {
//		가위 바위 보의 인식을 편리하게
//		final 상수활용, 숫자를 문자화
	static final int GAWI=1; // static은 컴퓨터 메모리에 저장된다. 따라서 마지막으로 GAWI라는 변수는 int 타입이다.
	static final int BAWI=2; 
	static final int BO=3; 
	
	
 	public static void main(String[] args) {
		
//		출력 : 컴:가위, 유저:바위 / 유저 승
//		가위 1, 바위 2, 보 3
//		두 값을 입력받기 Scanner Random
		Random ra = new Random();
		Scanner sc = new Scanner(System.in);
		int cNum = 0; // 컴
		int yNum = 0; // 유저

		System.out.println("가위바위보 게임");
		System.out.println("가위 1 바위 2 보 3");
		// 유저 숫자입력
		System.out.println("유저 컴 숫자(가위 1 바위 2 보 3)");
		yNum = sc.nextInt();
		cNum = ra.nextInt(3) + 1;
		System.out.println("유저 : " + yNum);
		System.out.println("컴퓨터 : " + cNum);
		
		GBBGame_teacher4 g2 = new GBBGame_teacher4();
		g2.judge(cNum , yNum);
		

	}
	
	public void judge(int cNum, int yNum) {
		// 판정
		if ((cNum == GAWI && yNum == BO) || 
				(cNum == BAWI && yNum == GAWI) || 
				(cNum == BO && yNum == BAWI)) // 컴퓨터가 승리할 때
			System.out.println("컴퓨터 승리");
		else if ((yNum == GAWI && cNum == BO) || 
				(yNum == BAWI && cNum == GAWI) || 
				(yNum == BO && cNum == BAWI)) // 유저가 승리할 때
			System.out.println("유저 승리");
		else
			System.out.println("무승부");
	}
}

 package com.tech.Mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame_teacher3 {
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

		judge(cNum, yNum); 

	}

	private static void judge(int cNum, int yNum) { // 이클립스의 메소드를 만들어주는 기능 덕분에 static이 생김.
		// 판정
		if ((cNum == 1 && yNum == 3) || (cNum == 2 && yNum == 1) || (cNum == 3 && yNum == 2)) // 컴퓨터가 승리할 때
			System.out.println("컴퓨터 승리");
		else if ((yNum == 1 && cNum == 3) || (yNum == 2 && cNum == 1) || (yNum == 3 && cNum == 2)) // 유저가 승리할 때
			System.out.println("유저 승리");
		else
			System.out.println("무승부");
	}
	
//	public void judge(int cNum, int yNum) {
//		
//	}
}

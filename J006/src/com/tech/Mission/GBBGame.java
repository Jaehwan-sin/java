package com.tech.Mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame {
	public static void main(String[] args) {
//		출력 : 컴:가위, 유저:바위 / 유저 승
//		가위 1, 바위 2, 보 3
//		두 값을 입력받기 Scanner Random
		
		int c = (int) (Math.random() * 3) + 1;
		int d = (int) (Math.random() * 3) + 1;
		
		if (c == 1)// 유저가 내는 경우의 수
			System.out.println("유저가 가위를 냈습니다.");
		else if (c == 2)
			System.out.println("유저가 바위를 냈습니다.");
		else if (c == 3)
			System.out.println("유저가 보자기를 냈습니다.");
		

		if (d == 1)// 컴퓨터가 내는 경우의 수
			System.out.println("컴퓨터가 가위를 냈습니다.");
		if (d == 2)
			System.out.println("컴퓨터가 바위를 냈습니다.");
		else if (d == 3)
			System.out.println("컴퓨터가 보자기를 냈습니다.");

		// 승패 경우의 수
		if ((c == 1 && d == 3) || (c == 2 && d == 1) || (c == 3 && d == 2))
			System.out.println("유저 승!");
		else if ((d == 1 && c == 3) || (d == 2 && c == 1) || (d == 3 && c == 2))
			System.out.println("컴퓨터 승!");
		else if (c == d)
			System.out.println("무승부");

	}
}

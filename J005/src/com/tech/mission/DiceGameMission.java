package com.tech.mission;

import java.util.Scanner;

public class DiceGameMission {
	public static void main(String[] args) {
//		주사위 게임
//		랜덤 주사위 받기
//		영수, 컴퓨터
//		큰 수를 받는 사람이 승리
//		판정
//		결과는 영수는 3, 컴퓨터는 5 컴퓨터 승
		
		int num = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		System.out.println("영수 : "+num);
		System.out.println("컴퓨터 : "+num2);
		
		if (num > num2) {
			System.out.println("영수가 이겼습니다");
		}else if (num == num2) {
			System.out.println("비겼습니다");	
		}else if ( num2 > num)
			System.out.println("컴퓨터가 이겼습니다");	
			
		}
	}


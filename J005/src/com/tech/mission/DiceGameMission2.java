package com.tech.mission;

import java.util.Random;
import java.util.Scanner;

public class DiceGameMission2 {
	public static void main(String[] args) {
//		주사위 게임
//		랜덤 주사위 받기
//		영수, 컴퓨터
//		큰 수를 받는 사람이 승리
//		판정
//		결과는 영수는 3, 컴퓨터는 5 컴퓨터 승
		
//		Random 사용하기
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		System.out.println("Hi Start Dice Game!!");
		System.out.println("영수의 주사위 굴리기 Enter!");
//		잠시 멈춤
		System.out.println(s.nextLine());
		int userNum=r.nextInt(6)+1;
		System.out.println(userNum);
		
		System.out.println("컴퓨터의 주사위 굴리기 Enter!");
//		잠시 멈춤
		System.out.println(s.nextLine());
		int comNum=r.nextInt(6)+1;
		System.out.println(comNum);
		
		
		
		String result="";
		if (userNum > comNum) {
			System.out.println("영수가 이겼습니다"); result="유저 승";
		}else if (userNum == comNum) {
			System.out.println("비겼습니다");	result="무승부";
		}else if ( comNum > userNum) 
			System.out.println("컴퓨터가 이겼습니다");	result="컴퓨터 승";
			
		}
	}


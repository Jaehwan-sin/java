package com.tech.w01;

public class ArrayExam1 {
	public static void main(String[] args) {
				
//		int score1=0;
//		int score2=0;
//		int score3=100;
//		int score4=100;
//		int score5=20;
//		
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
		
//		배열선언 
		int[] scores=new int[10]; // 배열선언 하는 방법 scores는 복수의 개념 int scores[]도 가능. 
//		Index number 0부터시작 중요하다! 꼭 외워놓기!
		scores[0]=10;
		scores[1]=20;
		scores[2]=30;
		scores[3]=40;
		scores[4]=50;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		System.out.println(scores[5]); // Error : Index 5 out of bounds
		
		
//		반복문을 활용한 출력 
		for (int i = 0; i < scores.length; i++) { // length는 위의 new int[] 괄호 안의 숫자를 의미 
			System.out.println(scores[i]);
			
		}
			System.out.println(scores.length);
		}
	}

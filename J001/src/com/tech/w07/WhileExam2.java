package com.tech.w07;

public class WhileExam2 {
	public static void main(String[] args) {
//	1~10합계
		int i=1;
		int sum=0;
		while (i<=10) {
			System.out.println(i);
			sum=sum+i;
			i++; //1씩 증가 
		}
		System.out.println("sum : "+sum);
		
	}
}

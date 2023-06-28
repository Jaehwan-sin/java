package com.tech.w02;

public class LogicalExam {
	public static void main(String[] args) {
//		조건식
//		결과가 True false
		System.out.println(10>10);
		int num1=10;
		int num2=10;
		boolean result3=false;
		System.out.println(num1>=num2);
		System.out.println(num1>=num2 || result3);// ||=or의 의미 or는 둘 중 하나만 true여도 전체가 true, 왼쪽 먼저 계산한다. 둘 중 하나만 만족하면 true
	}
}

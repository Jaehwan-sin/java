package com.tech.w02;

public class BitLogicalExam {
	public static void main(String[] args) {// 비트연산 &(and) |(or) ^(배타적 or)
		System.out.println(45 & 25);// &은 and의 의미
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" "+Integer.toBinaryString(25));
		System.out.println("\n\n");//띄어쓰기
		System.out.println(45 | 25);// |는 or의 의미
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" "+Integer.toBinaryString(25));
		System.out.println("\n\n");//띄어쓰기
		System.out.println(45 ^ 25);//^은 배타적 or의 의미, 서로 다를때만 or
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" "+Integer.toBinaryString(25));
	}
}

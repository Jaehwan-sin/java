package com.tech.w02;

public class BitLogicalExam {
	public static void main(String[] args) {// ��Ʈ���� &(and) |(or) ^(��Ÿ�� or)
		System.out.println(45 & 25);// &�� and�� �ǹ�
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" "+Integer.toBinaryString(25));
		System.out.println("\n\n");//����
		System.out.println(45 | 25);// |�� or�� �ǹ�
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" "+Integer.toBinaryString(25));
		System.out.println("\n\n");//����
		System.out.println(45 ^ 25);//^�� ��Ÿ�� or�� �ǹ�, ���� �ٸ����� or
		System.out.println(Integer.toBinaryString(45));
		System.out.println(" "+Integer.toBinaryString(25));
	}
}

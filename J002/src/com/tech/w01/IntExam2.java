package com.tech.w01;

public class IntExam2 {
	public static void main(String[] args) {
//		����������
		int a=10;
		int b=5;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
//		a=a+a;
//		System.out.println("a:"+a);
//		a=a+(++a);
//		System.out.println("a:"+a);
		a=a+(a++);
		System.out.println("a:"+a);
		
		b=++b;
		System.out.println("b:"+b);
		b=b++;
		System.out.println("b:"+b);
		System.out.println("b2:"+(b++));//��� �� ����
		System.out.println("b:"+b);
		
//		Ÿ���� ���� � ���Ѵ�
//		����� Ÿ��		
	}
}

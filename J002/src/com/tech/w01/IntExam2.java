package com.tech.w01;

public class IntExam2 {
	public static void main(String[] args) {
//		증감연산자
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
		System.out.println("b2:"+(b++));//출력 후 증가
		System.out.println("b:"+b);
		
//		타입의 종류 몇개 무한대
//		사용자 타입		
	}
}

package com.tech.w07;

public class DowhileExam {
	public static void main(String[] args) {
//		최소 한 번은 꼭 실행하고 싶을 때 dowhile문을 사용한다. - 이게 while 문과의 차이점 조건이 먼저 나오고 while를 쓴다. dowhile은 while에 ; 을 꼭 해줘야한다.
		int i = 1;
		int sum = 0;
		do {
			System.out.println(i);
			sum = sum + i;
			i++;
		} while (i <= 10);
		System.out.println("sum : " + sum);
	}
}

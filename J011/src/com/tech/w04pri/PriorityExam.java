package com.tech.w04pri;

public class PriorityExam {
	public static void main(String[] args) {
//		Thread의 우선 순위 1~10까지 지정가능 숫자가 높으면 우선순위는 높다.
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
//		현재 우선순위
		System.out.println("priority of t1 : "+t1.getPriority());
		System.out.println("priority of t2 : "+t2.getPriority());
//		기본값이 5
		
//		우선순위 변경
		t1.setPriority(9);
		t2.setPriority(1);
		System.out.println("priority of t1 : "+t1.getPriority());
		System.out.println("priority of t2 : "+t2.getPriority());
		
//		우선순위 변경2
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("priority of t1 : "+t1.getPriority());
		System.out.println("priority of t2 : "+t2.getPriority());
		
	}
}

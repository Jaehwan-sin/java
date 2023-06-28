package com.tech.w01;

public class MethodExam2 {
	public static void main(String[] args) {
//		자신의 클래스를 객체로만들기
		MethodExam2 m1 = new MethodExam2();
//		호출
		m1.makeSum();

	}

////		makeSum
	public void makeSum() { // static 을 붙이면 그냥 호출이 가능하다.
		int sum = 0;
		int start = 50;
		int end = 100;
		for (int i = start; i < end; i++) {
			sum += i;
		}
		System.out.println("start : " +start);
		System.out.println("end : " +end);
		System.out.println("sum : " +sum);
	}

}

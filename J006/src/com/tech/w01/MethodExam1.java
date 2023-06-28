package com.tech.w01;

public class MethodExam1 {
	public static void main(String[] args) {
//		자신의 클래스를 객체로만들기
		MethodExam1 m1 = new MethodExam1();
//		호출
		m1.makeSum();
		m1.hihi();

	}

////		makeSum
	public void makeSum() { // static 을 붙이면 그냥 호출이 가능하다.
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println("합계구하러 왔느뇨? sum : " + sum);
	}

//	메소드의 기본 틀
	public void hihi() {
		System.out.println("hihi 오랜만");
	}

}

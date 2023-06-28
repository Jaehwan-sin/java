package com.tech.w01;

public class MethodExam3 {
	public static void main(String[] args) {
//		자신의 클래스를 객체로만들기
		MethodExam3 m1 = new MethodExam3();
//		호출
//		param값 전달
		m1.makeSum(1,10);
		m1.makeSum(10,10000);
		m1.makeSum(15,500);
		
	}

////		makeSum
	public void makeSum(int getStart,int getEnd) { // static 을 붙이면 그냥 호출이 가능하다.
		int sum = 0;
		int start = getStart;
		int end = getEnd;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("start : " +start);
		System.out.println("end : " +end);
		System.out.println("sum : " +sum);
	}
	
//		public void makeSum(int a,int b)) {
//		System.out.println("불렀슈");
//		}
	
	
	
}

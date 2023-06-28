package com.tech.w01;

public class MethodExam5 {
	public static void main(String[] args) {
//		자신의 클래스를 객체로만들기
		MethodExam5 m1 = new MethodExam5();
//		호출
//		param값 전달
		int getSum = m1.makeSum(1, 10);
		System.out.println("Sum : " + getSum);// 값을 되돌려받아서 출력
//		float getAvg = m1.makeAvg(getSum);
//		System.out.println("Avg : " + getAvg);// 값을 되돌려받아서 출력
	}

////	makeSum 여기서 조작한 내용이 int 로 만들어주고 int로 리턴을 해야한다.
	public int makeSum(int getStart, int getEnd) { // static 을 붙이면 그냥 호출이 가능하다.
		int sum = 0;
		int start = getStart;
		int end = getEnd;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
//		System.out.println("start : " +start);
//		System.out.println("end : " +end);
//		System.out.println("sum : " +sum);
		return sum; // return은 sum을 구하기때문에 sum을 보내준다.

	}

	public float makeAvg(int sum, int cnt) {
//		int cnt = 10;
		float avg=(float)sum/cnt;
		return avg;
	}
		
	}
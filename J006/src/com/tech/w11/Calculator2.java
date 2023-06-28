package com.tech.w11;

public class Calculator2 {
	public static void main(String[] args) {
//		Calculator2 cal = new Calculator2(); static을 넣으면 바로 접근하기때문에 객체생성을 안 해도 된다.

		double returnVal1 = add(7, 5);// static을 안 넣으면 cal.add
		System.out.println("결과 : " + returnVal1);

		double returnVal2 = sub(7, 5);
		System.out.println("결과 : " + returnVal2);

		double returnVal3 = multi(7, 5);
		System.out.println("결과 : " + returnVal3);

		double returnVal4 = div(7, 5);
		System.out.println("결과 : " + returnVal4);
	}

	public static double add(double x, double y) {// 더하기
		return x + y;
	}

	public static double sub(double x, double y) {// 빼기
		return x - y;
	}

	public static double multi(double x, double y) {// 곱하기
		return x * y;
	}

	public static double div(double x, double y) {// 나누기
		return x / y;
	}
}

package com.tech.w11;

public class Calculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();

		double returnVal1 = cal.add(7, 5);
		System.out.println("결과 : " + returnVal1);

		double returnVal2 = cal.sub(7, 5);
		System.out.println("결과 : " + returnVal2);

		double returnVal3 = cal.multi(7, 5);
		System.out.println("결과 : " + returnVal3);

		double returnVal4 = cal.div(7, 5);
		System.out.println("결과 : " + returnVal4);
	}

	public double add(double x, double y) {// 더하기
		return x + y;
	}

	public double sub(double x, double y) {// 빼기
		return x - y;
	}

	public double multi(double x, double y) {// 곱하기
		return x * y;
	}

	public double div(double x, double y) {// 나누기
		return x / y;
	}
}

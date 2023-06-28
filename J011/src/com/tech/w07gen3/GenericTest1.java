package com.tech.w07gen3;

import java.util.Arrays;
import java.util.List;

public class GenericTest1 {

	public static void main(String[] args) {
//		java.util.List<Object> li = Arrays.asList(1,2,3,4,5);
		java.util.List<Integer> li = Arrays.asList(1, 2, 3, 4, 5);
//		java.util.List<Double> li = Arrays.asList(1.1,2.2,3.3,4.4,5.5);

		System.out.println(sumOfList(li));

	}
//	상한이 있는 제너릭
	private static double sumOfList(List<? extends Number> list) {// extends Number는 넘버까지만 제한하겠다라는 의미(자바 API의 대한 설명)
		double s = 0.0;
		for (Object n : list) {
			s+=Double.parseDouble(n.toString());
		}
		return s;
	}
}

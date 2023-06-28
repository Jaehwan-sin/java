package com.tech.w07gen2;

class GenericMethod {
// Generic 형식의 메소드
	public static <T> T getLast(T[] a) {
		return a[a.length - 1];// 배열의 마지막 요소를 리턴

	}

}

public class GenericMethodTest {
	public static void main(String[] args) {
		String[] language = new String[3];
		language[0] = "C#";
		language[1] = "C++";
		language[2] = "Java";

		String last = GenericMethod.getLast(language);
		System.out.println(last);
	}

}

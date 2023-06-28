package com.tech.w09;

public class IndexOverExam {
//	예외처리
	public static void main(String[] args) {
		int[] array = new int[10]; // 배열선언

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		try {
			System.out.println(array[99]);
		} catch (Exception e) {// try 블럭에서 오류가 생기면 catch 블럭이 진행된다.
			System.out.println("예외발생");
//			e.printStackTrace();
		}

	}
}
//	예외상황
//	사용자 입력오류 : 사용자가 숫자를 잘못 입력, 문자로 입력하는 경우 등등
//	장치오류 : 네트워크 고장, 디스크 고장
//	코드오류 : 입력코드오류, 배열의 인덱스번호
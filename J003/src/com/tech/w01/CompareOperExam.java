package com.tech.w01;


public class CompareOperExam {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		
		boolean result1=(num1==num2);// ==은 같으냐? 라고 묻는 것
		boolean result2=(num1!=num2);// !=은 다르냐? 라고 묻는 것
		boolean result3=(num1<=num2);// num1이 num2보다 작거나 같으냐?
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1='A';
		char char2='B';
		boolean result4=char1<char2;
		System.out.println(result4);
		
		// 기본형 타입 
//		byte 1
//		char 2
//		short 2
//		int 4
//		long 8
//		boolean 1
//		float 4
//		double 8
		
	}
}

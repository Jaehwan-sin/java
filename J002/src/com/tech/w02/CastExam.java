package com.tech.w02;

public class CastExam {
	public static void main(String[] args) {
		//형변환 : Casting
		int intvalue=65; //ASCII 코드 10,13번 코드는 ENTER를 의미한다.
		char charValue=(char) intvalue;//이 과정이 강제형변환, 또는 명시적 형변환
		// 큰 사이즈->작은사이즈에 넣을때
//		byte<char<short<int<long<float<double
		System.out.println(charValue);
		System.out.println(intvalue);
		
		char charValue2='a';
		int intvalue2=charValue2;//자동형변환, 묵시적 형변환 작은->큰 사이즈에 넣기
		System.out.println(charValue2);
		System.out.println(intvalue2);
	}
}

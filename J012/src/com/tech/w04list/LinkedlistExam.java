package com.tech.w04list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//* 컴퓨터 처리속도
//초(cs): 1/100초
//밀리초(ms): 1/1,000초
//마이크로초(㎲): 1/1,000,000초
//나노초(ns): 1/1,000,000,000초
//피코초(ps): 1/1,000,000,000,000초
//펨토초(fs):  1/1,000,000,000,000,000초
//아토초(as): 1/1,000,000,000,000,000,000초

//cs:            0.01  = 10^(-2)초
//ms: 밀리초 0.001 = 10^(-3)초
//㎲:  마이크로초 0.000001 = 10^(-6)초
//ns:  나노초 0.000000001 = 10^(-9)초
//ps:  피코초 0.000000000001 = 10^(-12)초
//fs:   펨토초 0.000000000000001 = 10^(-15)초
//as:   아토초 0.000000000000000001 = 10^(-18)초   
public class LinkedlistExam {
	public static void main(String[] args) {
//		ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>();
//		LinkedList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<String>();
		
//		시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
//		ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간 : ", (endTime-startTime) );
 
//		LinkedList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간 : ", (endTime-startTime) );
		
// 		LinkedList 처리 속도가 훨씬 빠른 이유는 ArrayList는 0번 인덱스에 새로운 객체가 추가되면서
//		기존 객체의 인덱스를 한 칸씩 뒤로 미는 작업을 하기 때문이다.
	}
}

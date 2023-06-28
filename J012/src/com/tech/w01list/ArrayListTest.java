package com.tech.w01list;

import java.util.ArrayList;

// 아주 활용도가 높다.
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
//		사이즈를 미리 정하지 않는다.
		list.add("Milk1");
		list.add("Milk2");
		list.add("Butter");
		list.add("Apple");
		list.add("Grape");
		list.add("Bread");
		
//		출력, list는 for each를 많이 사용한다.
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("---------------------");
		
//		삭제 by index
		list.remove(2);
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("---------------------");
		
//		삭제 by Value
		list.remove("Apple");
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("---------------------");
		
//		last에 추가
		list.add("Apple");
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("---------------------");
		
//		위치지정해서 추가
		list.add(1,"Bread2");
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("---------------------");
		System.out.println("길이출력 : "+list.size());
		System.out.println("검색 : "+list.get(2));
		System.out.println("Milk2 인덱스 넘버 : "+list.indexOf("Milk2"));
	}
}

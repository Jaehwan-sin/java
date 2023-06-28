package com.tech.w01list;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("홍1");
		list.add("홍2");
		list.add("홍3");
		list.add("홍4");
		list.add("홍5");
		
//		데이터 추가
		list.add(2,"추가 홍");
		list.add(2,"추가 홍");
		
//		Index로 데이터 삭제
		list.remove(3);
		
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("-------------------");
//		모든 요소 삭제
		list.clear();
		for (String str : list) {
			System.out.println(str);
		}
	}
}

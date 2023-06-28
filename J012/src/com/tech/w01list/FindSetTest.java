package com.tech.w01list;

import java.util.HashSet;
import java.util.Set;

//set은 중복된 값을 넣을 수 없다.

public class FindSetTest {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] sample = {"Butter", "Apple", "Orange", "Butter"};
		System.out.println(s);
		
//		sample 데이터를 s에 데이터 추가
		for (String ele : sample) {
			s.add(ele);
			System.out.print(ele+" ");
		}
		System.out.println(s);
	}
}

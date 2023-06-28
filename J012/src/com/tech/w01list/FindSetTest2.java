package com.tech.w01list;

import java.util.HashSet;
import java.util.Set;

//set은 중복된 값을 넣을 수 없다.
//어떤 데이터가 중복인지 걸러내기
public class FindSetTest2 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] sample = { "Butter", "Apple", "Orange", "Butter", "Apple" };
		System.out.println(s);

//		sample 데이터를 s에 데이터 추가
		for (String ele : sample) {
//			데이터가 중복되면 코드로 변형
			if (!s.add(ele)) {// s.add(ele)는 중복된 값이 있으면 false 인데 ! 붙여 true로 바꿔준다.
				System.out.println("중복데이터 : " + ele);
			}
		}
		System.out.println(s);
	}
}

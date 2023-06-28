package com.tech.w02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsorTest {
	public static void main(String[] args) {
		String[] sample = { "a", "b", "d", "c" };
		List<String> list = Arrays.asList(sample);// 배열을 리스트로 전환
		System.out.println(list);

		Collections.reverse(list);// reverse는 순서를 전환
		System.out.println(list);

//		오름차순 정렬
		Collections.sort(list);
		System.out.println(list);

//		내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());// reverseOrder는 내림차순정렬
		System.out.println(list);

	}
}

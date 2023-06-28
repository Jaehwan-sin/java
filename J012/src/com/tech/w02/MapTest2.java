package com.tech.w02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest2 {
	public static void main(String[] args) {
//		Map은 키와 밸류로 구성
		Map<String, Integer> m = new HashMap<String, Integer>();
		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "a", "a", "problem", "to", "be" };

//		단어의 중복횟수를 출력
		for (String a : sample) {
			Integer freq = m.get(a);
//			System.out.println(freq);
//			m.put(a, 1);
			m.put(a, freq == null ? 1 : freq + 1);
		}

		System.out.println(m);
	}
}

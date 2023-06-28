package com.tech.w02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// 많이 쓰이고 중요하다!
public class MapTest {
	public static void main(String[] args) {
//		Map은 키와 밸류로 구성
		Map<String, String> m = new HashMap<String, String>();
//		데이터 입력
		m.put("q1", "ans1");
		m.put("q2", "ans2");
		m.put("q3", "ans3");
//		System.out.println(m);
		
//		데이터 가져오기
		System.out.println(m.get("q1"));// value 를 끌어올때는 key 값을 입력
		System.out.println(m.get("q2"));
		System.out.println(m.get("q3"));
		
//		키 밸류 동시에 출력
		for (Entry<String, String> e : m.entrySet()) {// key가 중복되는건 가져올 수 없다.
			String key = e.getKey();
			String val = e.getValue();
			System.out.println(key+":"+val);
		}
	}
}

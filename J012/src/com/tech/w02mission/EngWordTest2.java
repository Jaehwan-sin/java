package com.tech.w02mission;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class EngWordTest2 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);

		m.put("apple", "사과");
		m.put("banana", "바나나");
		m.put("grape", "포도");
		m.put("map", "지도");
		m.put("dog", "강아지");
		m.put("cat", "고양이");
		m.put("monkey", "원숭이");
		m.put("elephant", "코끼리");
		m.put("rabbit", "토끼");
		m.put("lion", "사자");

		do {// dowhile 문의 do 부분을 무조건 한번은 실행시킨다.
			System.out.println("영어 단어 입력 : ");
			String keys = sc.next(); // 내가 입력하는 값을 keys 로 정의하고 m.get(keys)를 써서 그에 맞는 value값을 가져온다.
			if (keys.equals("-1")) {
				System.out.println("프로그램 종료");
				break;
			}
//			검색
			if (m.get(keys) == null) {
				System.out.println("다시 입력하세요");
			} else {
				System.out.println(keys + "의 의미는 : " + m.get(keys));
			}
		} while (true);

	}

}

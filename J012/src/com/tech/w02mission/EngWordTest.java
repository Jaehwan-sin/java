package com.tech.w02mission;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class EngWordTest {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);
		boolean bl = true;

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

		while (true) {
			System.out.println("영어 단어 입력 : ");
			String str = sc.next();

			if (str.equals("-1")) {
				System.out.println("프로그램 종료");
				break;
			} 
			for (Entry<String, String> e : m.entrySet()) {
				String key = e.getKey();
				String val = e.getValue();

				if (str.equals(e.getKey())) {
					System.out.println(str + "의 의미는 " + val + "입니다.");
					bl = true;
					break;
				}
			} if (!bl) {
				System.out.println("다시 입력하세요");
			}
			
		}
		

	}

}

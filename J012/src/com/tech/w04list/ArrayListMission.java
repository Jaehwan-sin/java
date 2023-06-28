package com.tech.w04list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMission {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("길동1");
		list.add("길동2");
		list.add("길동1");
		list.add("길동3");
		list.add("길동1");
		list.add("길동1");
		list.add("길동4");
		list.add("길동1");

//		remove value
//		list.remove("길동4");

//		길동4를 인덱스로 지우기 조건
		list.remove(list.indexOf("길동4"));

//		길동1을 모두 제거하기
//		while (list.indexOf("길동1")!=-1) {// 길동1이 없으면 -1이 나오니까 -1이 나올때까지 삭제해라.
//			list.remove(list.indexOf("길동1"));
//		}

//		길동1을 모두 제거하기 2, 람다식사용
//		list.removeIf(listss->listss.equals("길동1"));

//		길동1을 모두 제거하기 3, removeall 사용
		list.removeAll(Arrays.asList("길동1"));

		for (String ele : list) {
			System.out.print(ele + " ");
		}
	}
}

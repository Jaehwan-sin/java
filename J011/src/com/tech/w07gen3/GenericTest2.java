package com.tech.w07gen3;

import java.util.Arrays;
import java.util.List;

class MyList {
// 	제한이 없는 Generic
	public static void printList(List<?> li) {// 제한이 없다는걸 표시하는건 ? <Object>해도 상관없다 Object는 최상위 클래스이기때문에
		for (Object elem : li) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}

}

public class GenericTest2 {

	public static void main(String[] args) {
		java.util.List<Object> li = Arrays.asList(1, 2, 3, 4, 5);
		java.util.List<String> ls = Arrays.asList("one", "two", "three");
		java.util.List<Object> lo = Arrays.asList("one", "two", "three");

//		메소드 호출
		MyList3.printList(li);
//		MyList3.printList(ls);// 하한과 상관없는 String
		MyList3.printList(lo);

	}
}

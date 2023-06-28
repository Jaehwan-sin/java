package com.tech.w07gen2;

public class BoxTest {
	public static void main(String[] args) {
//		Box bx = new Box();
//		generic의 타입은 값을 넘겨줄때 정한다.
		
//		Box<String> bx = new Box<String>();
		Box<String> bx = new Box<>();// 앞에서 String 선언이 되어서 뒤에는 생략가능.
		bx.setData("Hello");
		
		String str = bx.getData();
		System.out.println(str);
		
		Box<Integer> bx2 = new Box<Integer>();
		bx2.setData(100);
		
		Integer num = bx2.getData();
		System.out.println(num);
	}
}

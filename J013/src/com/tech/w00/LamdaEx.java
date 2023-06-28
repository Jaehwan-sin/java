package com.tech.w00;

interface MyFunction {
	int calc(int x, int y); // 리턴이 있는 추상 메소드
}

public class LamdaEx {
	
	public static void main(String[] args) {
		
		MyFunction add = (x,y)->{return x+y;};
		MyFunction minus = (x,y)->x-y;
		
		System.out.println(add.calc(1, 2));
		System.out.println(minus.calc(10, 5));
	}
}

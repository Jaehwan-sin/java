package com.tech.w02;

import java.util.Stack;
// 자료구조형태
public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);// stack에 추가할 땐 add가 아니라 push
		stack.push(200);
		stack.push(300);
		System.out.println(stack);
		System.out.println(stack.empty());
		
//		데이터 제거
		System.out.println(stack.pop());// 300이 나중에 들어가서 먼저 나온다. (LIFO Last In First Out)
		System.out.println(stack.pop());// 데이터를 빼낼 땐 pop
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.empty());
		
	}
}

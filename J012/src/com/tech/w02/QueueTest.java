package com.tech.w02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<Integer>();

		que.add(6);
		que.add(11);
		que.add(3);
		que.add(12);

		System.out.println("que의 갯수 1 : " + que.size());

		int qcnt = 0;
		
//		데이터 꺼내기
		for (int i = 0; i < que.size(); i++) {
			qcnt = que.size();// Queue는 먼저 들어간 게 먼저 나온다. First in First out
			System.out.println(que.poll());
		}
		System.out.println("que의 갯수 2 : " + que.size());

	}
}

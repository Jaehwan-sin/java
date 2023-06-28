package com.tech.w10_2;

import java.util.Scanner;

public class JumpTest {
	public static void main(String[] args) {
//		getItem이라는 메소드를 만들어
//		점프 -1000 더블점프 --3000 적군킬 --5000
//		
//		메인에서 결과값 출력
//		포인트 : 1000
//		포인트 : 3000
//		포인트 : 5000
//		최종포인트 : 9000

		ItemTrans its = new ItemTrans();
		int[] rArr = its.getItem();
		System.out.println("점프 포인트 : " + rArr[0]);
		System.out.println("더블점프 포인트 : " + rArr[1]);
		System.out.println("적군킬 포인트 : " + rArr[2]);
		System.out.println("총 포인트 : " + its.getTotal());
	}
}

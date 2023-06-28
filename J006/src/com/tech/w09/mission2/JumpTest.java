package com.tech.w09.mission2;

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

		its.getItem("점프");
		System.out.println("점프의 포인트는 : " + its.getPoint());
		its.getItem("더블점프");
		System.out.println("더블 점프의 포인트는 : " + its.getPoint());
		its.getItem("적군킬");
		System.out.println("적군킬의 포인트는 : " + its.getPoint());

		System.out.println("최종 포인트는 : " + its.getTotal());

	}
}

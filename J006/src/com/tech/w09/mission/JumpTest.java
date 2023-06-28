package com.tech.w09.mission;

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

		ItemTrans it = new ItemTrans(); // 객체생성

		it.GetItem("jump");
		System.out.println("점프 포인트는 : " + it.getPoint());
		it.GetItem("Djump");
		System.out.println("더블 점프 포인트는 : " + it.getPoint());
		it.GetItem("kill");
		System.out.println("적군 킬 포인트는 : " + it.getPoint());
		System.out.println("최종 포인트는 : " + it.getTotal());
//		it GetItem = "Djump";
//		it GetItem = "kill";
//		it.getTotal(point);

	}
}

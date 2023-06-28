package com.tech.w10_2;

import java.util.Scanner;

public class ItemTrans {
//	private int point;
	private int total;

	public int[] getItem() {

//		점프, 더블점프, 적군킬 문자입력받기
//		문자를 기준으로 point 적용된 배열을 리턴해주기 = 배열에 점수를 입력되게끔 해라.
		Scanner sc = new Scanner(System.in);
		int[] arrPoint = new int[3];

		for (int i = 0; i < arrPoint.length; i++) {
			System.out.println("스킬입력");
			String skill1 = sc.next();
			if (skill1.equals("점프")) {// 문자를 같다고 할땐 .equals를 써야한다.
				arrPoint[0] = 1000;
				total += arrPoint[0];
			} else if (skill1.equals("더블점프")) {
				arrPoint[1] = 3000;
				total += arrPoint[1];
			} else if (skill1.equals("적군킬")) {
				arrPoint[2] = 5000;
				total += arrPoint[2];
			}
		}
		return arrPoint;
	}

	public int getTotal() {
		return total;
	}

}

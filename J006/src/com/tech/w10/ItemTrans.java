package com.tech.w10;

import java.util.Scanner;

public class ItemTrans {
	private int point;
	private int total;

	public void getItem(String skill) {
		
//		점프, 더블점프, 적군킬 문자입력받기
//		문자를 기준으로 point 적용된 배열을 리턴해주기
		int[] rArr = new int[3];
		Scanner sc = new Scanner(System.in);
		
		if (skill.equals("점프")) {
	        point = 1000;
	        total += point;
	    } else if (skill.equals("더블점프")) {
	        point = 3000;
	        total += point;
	    } else if (skill.equals("적군킬")) {
	        point = 5000;
	        total += point;
	    }
	}
	
	public int getPoint() {
		return point;
	}
	
	public int getTotal() {
		return total;
	}

}

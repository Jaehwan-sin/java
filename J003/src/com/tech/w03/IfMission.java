package com.tech.w03;

public class IfMission {
	public static void main(String[] args) {
//		���������� �Է¹ް� (100~200)
//		���� ������ ¦���� Ȧ������ �����ϼ���
//		
//		�߰���
//		3�� ���
//		5�� ��� ����
		
		int score=(int) (Math.random()*100)+100;
		
		System.out.println(score);
		
		if (score%2==1) {
			System.out.println("Ȧ��");
		} else {
			System.out.println("¦��");
		}
		
		if (score%3==0) {
			System.out.println("3�� ����Դϴ�.");
		} else if (score%5==0) {
			System.out.println("5�� ����Դϴ�.");
		}
		if (score%15==0) {
			System.out.println("3�� ����̸� 5�� ����Դϴ�.");
		}
		
		}
		
		}
	


package com.tech.w02;

public class IfelseExam {
	public static void main(String[] args) {
//		if���� Ȱ���� ������ �б�
//		point�� �ޱ� = 800;
//		
//		point�� 900�̻� level1
//		point�� 800�̻� level2
//		point�� 700�̻� level3
//		�������� level0
	
		int point=800;
		
		if (point>=900) {
			System.out.println("level1");
		} else if (point>=800) {
			System.out.println("level2");
		} else if (point>=700) {
			System.out.println("level3");
		} else {
			System.out.println("level0");
		}
		}
	}

package com.tech.w02;

public class IfelseExam4 {
	public static void main(String[] args) {
//		if���� Ȱ���� ������ �б�
//		point�� �ޱ� = 800;
//		
//		point�� 900�̻� level1
//		point�� 800�̻� level2
//		point�� 700�̻� level3
//		�������� level0
	
		int point=900;
		String grade;
		
		if (point>=900) {
			grade="Level1";
		} else if (point>=800) {
			grade="Level2";
		} else if (point>=700) {
			grade="Level3";
		} else {
			grade="Level0";
		}
		System.out.println(grade);
		}
	}

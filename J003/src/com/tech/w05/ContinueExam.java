package com.tech.w05;

public class ContinueExam {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				continue; // continue�� ������ �Ʒ� �ܰ�� ��������ʰ� ���� �ٽ� �ö󰣴�. ���� i�� 5�� �Ǿ����� ��µ����ʰ� ���� �ö�. (�ݺ��� ���, ���� ���� ���� �� ��)
			}
			System.out.println("���� i : "+i);
		}
	}
}

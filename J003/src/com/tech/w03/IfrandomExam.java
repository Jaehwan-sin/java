package com.tech.w03;

public class IfrandomExam {
	public static void main(String[] args) {
		
//		double score=Math.random()+50;
//		double score=(Math.random()*50)+50;
		int score=(int) ((Math.random()*50)+50);
		System.out.println(score);
		
		String grade="";
		if (score>=90) {
			grade=("A");
		}else if (score>=80) {
			grade=("B");
		}else if (score>=70) {
			grade=("C");
		}else if (score>=60) {
			grade=("D");
		}else {
			grade=("F");
		}
		System.out.println(grade+"���");
//		¦Ȧ����
//		%������ ������
		if (score%2==1) {//socre�� 2�� ���� �������� 1�̳�?
			System.out.println("Ȧ��");
		}else {
			System.out.println("¦��"); 
		}
		
	}
}

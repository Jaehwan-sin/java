package com.tech.w04;

public class SwitchExam4 {
	public static void main(String[] args) {

//		1������ 12������
//		�������� �Է¹޾� �� 3,4,5 ���� 6,7,8 ���� 9,10 �ܿ� ������ ���
		
		int num = (int) (Math.random()*12)+1;
		System.out.print(num+"���� ");
		
		switch (num) {
		case 3:		
		case 4:		
		case 5:		System.out.println("��");	break;
		case 6:		
		case 7:		
		case 8:		System.out.println("����");	break;
		case 9:		
		case 10:	System.out.println("����");	break;

		default:
			System.out.println("�ܿ�");
			break;
		}
	}
}

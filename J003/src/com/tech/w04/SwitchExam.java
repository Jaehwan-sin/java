package com.tech.w04;

public class SwitchExam {
	public static void main(String[] args) {

//		�������ڰ� 1~6���� �������� ����
		int num = (int) (Math.random()*6)+1; 
		System.out.println(num);
		
//		�ֻ��� ����
		switch (num) {
		case 1:												//Ű ���� ����� ���� ǥ��
			System.out.println(num+"�Դϴ�.");				//ǥ����
			break;
		case 2:												
			System.out.println(num+"�Դϴ�.");	
			break;
		case 3:												
			System.out.println(num+"�Դϴ�.");			
			break;
		case 4:											
			System.out.println(num+"�Դϴ�.");				
			break;
		case 5:												
			System.out.println(num+"�Դϴ�.");					
			break;

		default:	
			System.out.println(num+"�Դϴ�.");				//�������� �ǹ� (if������ else)
			break;
		}
		
	}
}

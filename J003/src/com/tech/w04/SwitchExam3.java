package com.tech.w04;

public class SwitchExam3 {
	public static void main(String[] args) {

//		�ƽ�Ű�ڵ忡�� 65���� 12���� ��������
		int num = (int) (Math.random()*12)+65;
		System.out.println("���� : "+num);
		
		switch (num) {
		case 65:
			System.out.println("���� : A");
			break;
		case 66:
			System.out.println("���� : B");
			break;
		case 67:
			System.out.println("���� : C");
			break;
		case 68:
			System.out.println("���� : D");
			break;
		case 69:
			System.out.println("���� : E");
			break;
		case 70:		System.out.println("���� : F");		break;	
		case 71:		System.out.println("���� : G");		break;
		case 72:		System.out.println("���� : H");		break;
		case 73:		System.out.println("���� : I");		break;
		case 74:		System.out.println("���� : J");		break;
		case 75:		System.out.println("���� : K");		break;
		default:
			System.out.println("���� : L");
			break;
		}
	}
}

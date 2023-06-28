package com.tech.w04;

public class SwitchExam3 {
	public static void main(String[] args) {

//		아스키코드에서 65부터 12개만 가져오기
		int num = (int) (Math.random()*12)+65;
		System.out.println("숫자 : "+num);
		
		switch (num) {
		case 65:
			System.out.println("문자 : A");
			break;
		case 66:
			System.out.println("문자 : B");
			break;
		case 67:
			System.out.println("문자 : C");
			break;
		case 68:
			System.out.println("문자 : D");
			break;
		case 69:
			System.out.println("문자 : E");
			break;
		case 70:		System.out.println("문자 : F");		break;	
		case 71:		System.out.println("문자 : G");		break;
		case 72:		System.out.println("문자 : H");		break;
		case 73:		System.out.println("문자 : I");		break;
		case 74:		System.out.println("문자 : J");		break;
		case 75:		System.out.println("문자 : K");		break;
		default:
			System.out.println("문자 : L");
			break;
		}
	}
}

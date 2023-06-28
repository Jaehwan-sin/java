package com.tech.w04;

public class SwitchExam4 {
	public static void main(String[] args) {

//		1월부터 12월까지
//		랜덤으로 입력받아 봄 3,4,5 여름 6,7,8 가을 9,10 겨울 나머지 출력

		int num = (int) (Math.random() * 12) + 1;
		System.out.print(num + "월은 ");

		switch (num) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10:
			System.out.println("가을");
			break;

		default:
			System.out.println("겨울");
			break;
		}
	}
}

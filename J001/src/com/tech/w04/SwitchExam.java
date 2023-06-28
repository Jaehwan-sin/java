package com.tech.w04;

public class SwitchExam {
	public static void main(String[] args) {

//		랜덤숫자가 1~6까지 범위숫자 추출
		int num = (int) (Math.random() * 6) + 1;
		System.out.println(num);

//		주사위 놀이
		switch (num) { // switch (변수)
		case 1: // 키 값의 경우의 수를 표현, 변수와 값이 일치하면 해당 case 실행문을 작동시킨다.
			System.out.println(num + "입니다."); // 표현식
			break; // break는 조건에 해당하는 실행문을 작동시키고 switch문을 종료하기 위해 사용.
		case 2:
			System.out.println(num + "입니다.");
			break;
		case 3:
			System.out.println(num + "입니다.");
			break;
		case 4:
			System.out.println(num + "입니다.");
			break;
		case 5:
			System.out.println(num + "입니다.");
			break;

		default: // 변수와 값이 불일치하면 default 실행문을 작동시킨다.
			System.out.println(num + "입니다."); // 나머지를 의미 (if문에서 else)
			break;
		}

	}
}

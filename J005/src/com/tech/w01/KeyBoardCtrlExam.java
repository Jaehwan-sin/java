package com.tech.w01;

import java.io.IOException;

public class KeyBoardCtrlExam {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		while (run) {
			if (keycode != 13 && keycode != 10) { // 키보드에게 enter의미를 전달 키코드는 하나의 문자만 사용할때 쓰고 두 글자 이상은 스캐너를 활용한다.
				System.out.println("------------");
				System.out.println("1. 속도증가, 2. 속도감소, 3. 증가");
				System.out.println("------------");
				System.out.println("선택");
			}
			keycode = System.in.read();
			System.out.println(keycode);
			if (keycode == 49) {
				speed += 100;
				System.out.println("속도증가:" + speed);
			} else if (keycode == 50) {
				speed += 100;
				System.out.println("속도감소:" + speed);
			} else if (keycode == 51) {
				run = false;

			}
		}
		System.out.println("프로그램 종료");

	}
}

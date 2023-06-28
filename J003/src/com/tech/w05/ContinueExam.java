package com.tech.w05;

public class ContinueExam {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				continue; // continue를 만나면 아래 단계로 진행되지않고 위로 다시 올라간다. 따라서 i가 5가 되었을때 출력되지않고 위로 올라감. (반복은 계속, 이후 문장 실행 안 됨)
			}
			System.out.println("현재 i : "+i);
		}
	}
}

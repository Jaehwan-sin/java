package com.tech.w07;

public class WhileBreakExam {
	public static void main(String[] args) {
		gotolabel: for (int i = 0; i < 5; i++) {
			int j = 1;
			while (j < 3) {
				if (i == 3) {
//					break;
					break gotolabel;
				}
				System.out.println("i:" + i + ", j:" + j);
				j++;
			}

		}
	}
}

package com.tech.w06;

public class ForFloatExam {
	public static void main(String[] args) {
//		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
//			System.out.println("print : "+x);
//		}

//		printf
		for (float x = 0.1f; x < 1.0f; x = x + 0.1f) {
			System.out.printf("print : %.2f \n", +x);// .2는 소수점 둘째자리까지 표현해라 / 뒤에 x는 %.2f에 대입해라
		}

//		printf2
		for (float x = 0.1f; x < 1.0f; x = x + 0.1f) {
			System.out.printf("print : %5.2f \n", +x);// .2는 소수점 둘째자리까지 표현해라 / 뒤에 x는 %.2f에 대입해라
		}

		int num = 100;
		float score = 100.0f;
		String str = "구디역";
		char ch = '굳';

//		Printf 사용 출력 \n은 줄 바꿈
		System.out.printf("num: %d \n", num);// %d 는 정수 출력
		System.out.printf("c : %c \n", ch);// %c 는 문자열 출력
		System.out.printf("str : %s \n", str);// %s 는 문자형 출력
		System.out.printf("구트는 %s에 있는 %d%% %c %.1f%% \n", str, num, ch, score);// %%는 %의 단위를 표현

	}
}

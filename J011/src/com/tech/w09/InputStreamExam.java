package com.tech.w09;

import java.io.IOException;

public class InputStreamExam {
	public static void main(String[] args) throws IOException {// IOException은 입출력예외이다.
//		throws 
		System.out.println("String 입력");
		int r=0;
		while ((r=System.in.read())!=-1) {// 입력된 값이 -1이 아니다. / 문자단위 읽기 / 입력값이 없을 때까지 실행해라.
			System.out.print("입력값 = ");
			if (r!=10 && r!=13) {// 엔터
				System.out.write(r);
			}
			System.out.println("의 아스키코드 값 : "+r);
		}
		System.out.println("End");
	}
}

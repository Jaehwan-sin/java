package com.tech.w01;

public class StringConcatExam {
	public static void main(String[] args) {
		String str1="JDK"+6.0;// 6.0�� double�� �Ǽ� float�� f�� ������ϱ⶧��
		String str2=str1+"Ư¡";
		System.out.println(str2);
		System.out.println();
		
		String str3="jdk"+3+3+3+3.0;
		String str4=3+3+3.0+"jdk";
		System.out.println(str3);
		System.out.println(str4);
		
		String str5=str1.concat(str4);
		System.out.println(str5);
	}
}

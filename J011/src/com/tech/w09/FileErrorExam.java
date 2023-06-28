package com.tech.w09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileErrorExam {

	private int[] list;
	private static final int SIZE = 10;

	public FileErrorExam() {
		list = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			list[i] = i;

		}
		writeList();// 메소드생성
	}

	private void writeList() {
//		입출력도구
		PrintWriter out = null; // 출력도구
		BufferedReader in = null; // 입력도구

		try {
			in = new BufferedReader(new FileReader("infile.txt"));

			for (int i = 0; i < SIZE; i++) {
				list[i] = i;
				list[11] = 10;
			}
			System.out.println("정상작동");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("예외발생");
			e.printStackTrace();
		} finally {// 오류가 나던 안 나던 finally는 무조건 실행된다.
			System.out.println("finally block end");

		}

	}

	public static void main(String[] args) {
		new FileErrorExam();
	}
}

package com.tech.w03;

public class nullPointExamTest {
	public static void main(String[] args) {
		nullPointExam nexample = new nullPointExam();
		nexample.getData(1000);

		System.out.println("\n 해시코드 : " + nexample);
		nexample = null;
		System.out.println("\n 해시코드" + nexample);
		nexample.getData(1000);
	}
}

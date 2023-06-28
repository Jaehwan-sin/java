package com.tech.w11;

public class SchoolTest extends School {
	public static void main(String[] args) {
		SchoolTest ss = new SchoolTest();

		ss.dostudy();
		ss.superCall();

	}

	public void superCall() {
		System.out.println("this call");
		super.dostudy();// super는 부모클래스를 지칭하기때문에 부모 클래스의 dostudy가 출력된다.
		this.dostudy();// this는 이 클래스 안을 지칭하기때문에 이 클래스 안의 dostudy가 출력된다.
	}

	public void dostudy() {
		System.out.println("자식 등교시간 조정");
	}
}

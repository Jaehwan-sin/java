package com.tech.w04inter;

public class TrotMp3 implements MyMp3{// 클래스에서 인터페이스를 상속받을땐 implements 를 쓴다.

	@Override
	public void playMp3() {
		System.out.println("Mp3 Trot스타일 play");
		
	}

	@Override
	public void listenFm() {
		System.out.println("Mp3 Trot스타일 play듣기");
		
	}

	@Override
	public void viewPhoto() {
		System.out.println("Mp3 Trot 싱어 포토");
		
	}

}

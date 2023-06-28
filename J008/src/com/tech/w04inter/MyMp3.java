package com.tech.w04inter;

public interface MyMp3 {
	public static void main(String[] args) {
		MyMp3 mp3 = new JazzMp3();
	    mp3.playMp3();
	    mp3.listenFm();
	    mp3.viewPhoto();
	}
//	인터페이스 : 추상메소드의 집합
//	인터페이스에서는 abstract를 생략해도 된다.
	
	
	public void playMp3();
	public void listenFm();
	void viewPhoto();
//	추상메소드는 기본적으로 public을 갖는다.
//	생략하면 컴파일시 자동으로 public abstract가 추가된다.
}

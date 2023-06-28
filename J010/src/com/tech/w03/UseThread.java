package com.tech.w03;

public class UseThread extends Thread {
	
	private String message;
	
	public UseThread(String message) {
		this.message=message;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" : "+message);
		}
	}

	public static void main(String[] args) {
		new UseThread("서울").start(); // Thread를 실행시키려면 Thread를 상속받고 .start를 해야한다.
		new UseThread("Seoul").start();// Thread를 두 개를 동시에 진행하면 순서가 뒤죽박죽이다.
	}
}

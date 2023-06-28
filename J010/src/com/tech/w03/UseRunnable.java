package com.tech.w03;

public class UseRunnable implements Runnable{
	private String message;

	public UseRunnable(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
		System.out.println(message);
		}	
		
	}
	public static void main(String[] args) {
		new Thread(new UseRunnable("서울")).start();// Thread 안에 Runnable Target안에 넣어준다.
		new Thread(new UseRunnable("Seoul")).start();
	}
}

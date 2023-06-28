package com.tech.w03join;

public class ThreadJoinExam {
	public static void main(String[] args) {
		ThreadAction thread = new ThreadAction();
		thread.start();

		System.out.println("시작");

		try {
			// Join 처리
			System.out.println(thread.isAlive());
			thread.join();// Thread 동작이 중지 될 때 까지 다음 실행 대기
			System.out.println(thread.isAlive());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("종료");
	}
}

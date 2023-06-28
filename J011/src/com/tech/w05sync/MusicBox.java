package com.tech.w05sync;

public class MusicBox {

//	synchronized 적용, 동기화

	public synchronized void PlayMusicA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("가요");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void PlayMusicB() {
		for (int i = 0; i < 10; i++) {
			System.out.println("팝송");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void PlayMusicC() {
		for (int i = 0; i < 10; i++) {
//		synchronized Block 처리
//		더 많은 try catch문이 있어도 그 부분만 synchronized를 할 수 있다.
			synchronized (this) {
				System.out.println("힙합");
				try {
					Thread.sleep((int) (Math.random() * 1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

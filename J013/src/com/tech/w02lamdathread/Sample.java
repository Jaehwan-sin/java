package com.tech.w02lamdathread;

//class threadA implements Runnable {
//
//	@Override
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("thAAA");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//			}
//		}
//
//	}
//
//}
//
//class threadB implements Runnable {
//
//	@Override
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("thBBB");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//			}
//		}
//
//	}
//
//}

public class Sample {
	public static void main(String[] args) {
//		Runnable obj1 = new threadA();
//		Runnable obj2 = new threadB();

		Runnable obj1 = new Runnable() {
//		람다식이 아닌 경우
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("thAAA");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}

			}
		};
//		람다식 표현
		Runnable obj2 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("thBBB");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}

		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
}

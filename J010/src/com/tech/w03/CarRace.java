package com.tech.w03;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Thread를 이용한 자동차 경주

public class CarRace extends JFrame {

	class MyCarThread extends Thread { // 내부 클래스

		private JLabel label;
		private int x, y; // 자동차 좌표 값

		public MyCarThread(String fname, int x, int y) {
//			스타트 라인에 이미지 올리기
			this.x = x;
			this.y = y; // 좌표값을 필드에 전달하기
			label = new JLabel();
			label.setIcon(new ImageIcon("src/" + fname));
			label.setBounds(x, y, 50, 50);
			add(label);

		}

		@Override // Thread를 동작시키기 위해 run을 오버라이드한다.
		public void run() {
			System.out.println("Thread run");
//			좌표값을 바꿔주는 쓰레드 동작
			for (int i = 0; i < 200; i++) {
//				System.out.println(Math.random()*10);
				if (x <= 500) {// x값 500에서 멈추기
					x += Math.random() * 10;
				}
				label.setBounds(x, y, 50, 50);

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public CarRace() {
		setTitle("CarRace");
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		new MyCarThread("new car.png", 100, 0).start();// Thread start
		new MyCarThread("new car2.png", 100, 50).start();// Thread start
		new MyCarThread("new car3.png", 100, 100).start();// Thread start

		setVisible(true);
	}

	public static void main(String[] args) {
		new CarRace();
	}
}

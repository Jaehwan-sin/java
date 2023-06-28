package com.tech.w03;

import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownExam extends JFrame {
	private JLabel label;
	private LayoutManager BorderLayout;

	class MyThread extends Thread { // 내부클래스
		@Override
		public void run() {
			System.out.println("Thread 호출받음");
//			super.run();

			for (int i = 1; i < 20; i++) {
				try {
					Thread.sleep(1000);// 1초씩 멈춤
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				label.setText(i + "");

			}
		}
	}

	public CountDownExam() {
		setTitle("CountDown");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = new JLabel("Start");
		label.setFont(new Font("impact", Font.BOLD, 100));

		add(label);

		new MyThread().start(); // 위 Thread 클래스를 실행

		setVisible(true);
	}

	public static void main(String[] args) {
		new CountDownExam();
	}
}

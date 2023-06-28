package com.tech.w01;

import javax.swing.JFrame;

public class FrameTest {
	// Swing
	public static void main(String[] args) {
		JFrame f = new JFrame();// 객체생성
		f.setSize(900, 200);// pixel 단위
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 누르면 클로즈해라.
		f.setVisible(true);
	}
}

package com.tech.w03;

import javax.swing.JFrame;

public class JoinForm extends JFrame{
	public static void main(String[] args) {
		new JoinForm(); // 생성자 호출
	}
	public JoinForm() {
		setTitle("JoinForm");
		setSize(400,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

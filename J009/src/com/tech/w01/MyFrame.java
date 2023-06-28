package com.tech.w01;

import javax.swing.JFrame;

public class MyFrame {
	
	public MyFrame() {
		System.out.println("생성자 호출");
		JFrame f = new JFrame();
		f.setSize(500,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}

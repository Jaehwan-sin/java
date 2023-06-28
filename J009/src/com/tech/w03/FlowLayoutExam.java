package com.tech.w03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExam extends JFrame {
	public static void main(String[] args) {
		new FlowLayoutExam();// 생성자 호출
	}

	public FlowLayoutExam() {// 생성자
		setTitle("Flow Layout");// 물 흐르듯 자연스럽게 배치하는 레이아웃
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(new FlowLayout());// 버튼 위치조절
		setLayout(new FlowLayout(FlowLayout.LEFT, 50, 10));// 버튼 위치조절

		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");

		add(btn1);add(btn2);add(btn3);add(btn4);
		add(btn5);add(btn6);add(btn7);add(btn8);

		setVisible(true);
	}

}

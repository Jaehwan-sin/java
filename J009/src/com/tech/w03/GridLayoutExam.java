package com.tech.w03;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GridLayoutExam extends JFrame {
	public static void main(String[] args) {
		new GridLayoutExam();
	}

	public GridLayoutExam() {
		setTitle("GridLayout");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 2, 5, 10));// 행과 열이 있어 바둑판처럼 배치하는 레이아웃
		
		// 생성 및 부착 동시
		add(new Button("btn1"));
		add(new Button("btn2"));
		add(new Button("btn3"));
		add(new Button("btn4"));
		add(new Button("btn5"));
		add(new Button("btn6"));
		add(new Button("btn7"));
		add(new Button("btn8"));

		setVisible(true);
	}
}

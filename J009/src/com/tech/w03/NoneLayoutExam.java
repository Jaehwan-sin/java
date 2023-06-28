package com.tech.w03;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NoneLayoutExam extends JFrame {
	public static void main(String[] args) {
		new NoneLayoutExam();
	}

	public NoneLayoutExam() {
		setTitle("NoneLayoutExam");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		JLabel la = new JLabel("Buttons");
		la.setLocation(0, 0);
		la.setSize(200, 20);
		la.setForeground(Color.blue);
		la.setOpaque(true);
		la.setBackground(Color.red);
		add(la);
		
		for (int i = 0; i < 9; i++) {
			JButton b = new JButton(Integer.toString(i));// JButton에는 string 타입만 출력이 가능해서 Integer.toString으로 int형 정수를 입력한다.
			int posx,posy;
			posx=(int)(Math.random()*300);
			posy=(int)(Math.random()*200);
			b.setSize(50,20);
			b.setLocation(posx, posy);
			add(b);
		}

		setVisible(true);
	}
}

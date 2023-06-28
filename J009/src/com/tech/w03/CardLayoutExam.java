package com.tech.w03;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutExam extends JFrame {
	public static void main(String[] args) {
		new CardLayoutExam();
	}

	public CardLayoutExam() {
		setTitle("CardLayout");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		컨테이너 준비
		Container c = getContentPane();// 담는 그릇역할
		CardLayout cc = new CardLayout();
		c.setLayout(cc);

//		판넬 준비
		JPanel p1, p2, p3; // 선언

//		실제 객체 생성
		p1 = new JPanel(); // 객체생성
		p1.setBackground(Color.yellow);
		p1.add(new JLabel("p111"));
		
		p2 = new JPanel(); // 객체생성
		p2.setBackground(Color.cyan);
		p2.add(new JLabel("p222"));
		
		p3 = new JPanel(); // 객체생성
		p3.setBackground(Color.blue);
		p3.add(new JLabel("p333"));
		
		c.add(p1,"1");
		c.add(p2,"2");
		c.add(p3,"3");
		
		cc.show(c, "3");

		setVisible(true);
	}
}

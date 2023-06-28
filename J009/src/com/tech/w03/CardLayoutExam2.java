package com.tech.w03;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutExam2 extends JFrame implements ActionListener {// ActionListenr는 버튼을 받는 역할을 만드려면 상속받아야한다.
	CardLayout card;
	JButton b1, b2, b3;
	Container c;

	public static void main(String[] args) {
		new CardLayoutExam2();
	}

	public CardLayoutExam2() {
		setTitle("CardLayout2");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		컨테이너 준비
		c = getContentPane();// 담는 그릇역할
		card = new CardLayout();
		c.setLayout(card);

		b1 = new JButton("재환1");
		b1.setBackground(Color.red);
		b2 = new JButton("재환2");
		b2.setBackground(Color.green);
		b3 = new JButton("재환3");
		b3.setBackground(Color.blue);


		b1.addActionListener(this);// 버튼을 누르면 다음 번호로 넘어가라는 역할
		b2.addActionListener(this);
		b3.addActionListener(this);

		c.add(b1, "a");
		c.add(b2, "b");
		c.add(b3, "c");

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {// 버튼의 신호를 받는 역할
		System.out.println("신호");
		card.next(c);

	}
}

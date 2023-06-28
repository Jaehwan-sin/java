package com.tech.w04cal;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	public static void main(String[] args) {
		new Calculator();
	}

	public Calculator() {
		setTitle("Calculator");
		setSize(600, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout();

//		판넬 준비
		JPanel p = new JPanel();
//		p.setLayout(null);
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(5, 5, 3, 3));

//		텍스트 필드 준비
		JTextField tf1 = new JTextField(45);

//		텍스트 필드 위치 지정
		tf1.setBounds(20, 20, 460, 30);
//		p2.setLayout();

//		판넬에 준비된 컴포넌트 부착
		

//		버튼 생성 및 부착 동시
		JButton btn1 = new JButton("Backspace");
		JButton btn2 = new JButton("");
		JButton btn3 = new JButton("");
		JButton btn4 = new JButton("CE");
		JButton btn5 = new JButton("C");
		JButton btn6 = new JButton("7");
		JButton btn7 = new JButton("8");
		JButton btn8 = new JButton("9");
		JButton btn9 = new JButton("sqrt");
		JButton btn10 = new JButton("/");
		JButton btn11 = new JButton("4");
		JButton btn12 = new JButton("5");
		JButton btn13 = new JButton("6");
		JButton btn14 = new JButton("X");
		JButton btn15 = new JButton("%");
		JButton btn16 = new JButton("1");
		JButton btn17 = new JButton("2");
		JButton btn18 = new JButton("3");
		JButton btn19 = new JButton("-");
		JButton btn20 = new JButton("1/x");
		JButton btn21 = new JButton("0");
		JButton btn22 = new JButton("+/-");
		JButton btn23 = new JButton(".");
		JButton btn24 = new JButton("+/");
		JButton btn25= new JButton("=");
		
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		p2.add(btn7);
		p2.add(btn8);
		p2.add(btn9);
		p2.add(btn10);
		p2.add(btn11);
		p2.add(btn12);
		p2.add(btn13);
		p2.add(btn14);
		p2.add(btn15);
		p2.add(btn16);
		p2.add(btn17);
		p2.add(btn18);
		p2.add(btn19);
		p2.add(btn20);
		p2.add(btn21);
		p2.add(btn22);
		p2.add(btn23);
		p2.add(btn24);
		p2.add(btn25);

//		판넬을 프레임에 부착
		add(p);
		p.add(tf1);
		p.add(p2);

		setVisible(true);
	}
}

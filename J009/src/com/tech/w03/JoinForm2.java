package com.tech.w03;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinForm2 extends JFrame { // 회원가입 폼 만들기
	public static void main(String[] args) {
		new JoinForm2(); // 생성자 호출
	}

	public JoinForm2() {// 생성자
		setTitle("JoinForm");
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		판넬 준비
		JPanel p = new JPanel();
		p.setLayout(null);

//		판넬의 컬러수정
		p.setBackground(Color.white);

//		라벨 준비
		JLabel ltitle = new JLabel("Member Join");
		JLabel l1 = new JLabel("ID");
		JLabel l2 = new JLabel("PW");
		JLabel l3 = new JLabel("NAME");

//		타이틀 수정
		ltitle.setFont(new Font("impact", Font.BOLD, 20));

//		텍스트 필드 준비
		JTextField tf1 = new JTextField(15);
		JTextField tf2 = new JTextField(15);
		JTextField tf3 = new JTextField(15);

//		버튼 준비
		JButton b1 = new JButton("Join");
		JButton b2 = new JButton("modify");
		JButton b3 = new JButton("delete");

//		판넬에 준비된 컴포넌트 부착
		p.add(ltitle);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(tf1);
		p.add(tf2);
		p.add(tf3);
		p.add(b1);
		p.add(b2);
		p.add(b3);

//		위치지정

		int y1 = 30;
		int x1 = 100;

		ltitle.setBounds(150, 20, 200, 20);
		l1.setBounds(20, 50, 50, 20);
		l2.setBounds(20, 50 + y1 * 1, 50, 20);
		l3.setBounds(20, 50 + y1 * 2, 50, 20);

		tf1.setBounds(20 + x1, 50, 150, 20);
		tf2.setBounds(20 + x1, 50 + y1 * 1, 150, 20);
		tf3.setBounds(20 + x1, 50 + y1 * 2, 150, 20);

		b1.setBounds(20, 150, 100, 30);
		b2.setBounds(20 + x1, 150, 100, 30);
		b3.setBounds(20 + x1 * 2, 150, 100, 30);

//		판넬을 프레임에 부착
		add(p);

		setVisible(true);
	}
}

package com.tech.w07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeBackColor extends JFrame {

	public ChangeBackColor() {
		setTitle("Change Color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

//		화면 구성
		JPanel panel = new JPanel();
		JButton ybutton = new JButton("노랑");
		JButton pbutton = new JButton("핑크");

		panel.add(ybutton);
		panel.add(pbutton);

//		판넬 프레임에 복사
		add(panel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new ChangeBackColor();
	}
}

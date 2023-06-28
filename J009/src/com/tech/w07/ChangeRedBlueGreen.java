package com.tech.w07;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeRedBlueGreen extends JFrame implements ActionListener {

	JPanel panel;
	JButton Rbutton, Bbutton, Gbutton, RGBbutton;

	public ChangeRedBlueGreen() {
		setTitle("Change Color");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		화면 구성
		panel = new JPanel();
		Rbutton = new JButton("빨강색");
		Bbutton = new JButton("파랑색");
		Gbutton = new JButton("초록색");
		RGBbutton = new JButton("RGB");

		panel.add(Rbutton);
		panel.add(Bbutton);
		panel.add(Gbutton);
		panel.add(RGBbutton);

		add(panel);

//		버튼에 수신자 부착
		Rbutton.addActionListener(this);
		Bbutton.addActionListener(this);
		Gbutton.addActionListener(this);
		RGBbutton.addActionListener(this);

		setVisible(true);
	}

	public static void main(String[] args) {
		new ChangeRedBlueGreen();
	}

	@Override // 수신을 받을 때 생성되는 메소드
	public void actionPerformed(ActionEvent e) {
//		버튼을 누른 값으로 조건이 실행되는 if문 
		System.out.println("신호");
		if (e.getSource() == Rbutton) {
			panel.setBackground(Color.red);
		} else if (e.getSource() == Bbutton) {
			panel.setBackground(Color.blue);
		} else if (e.getSource() == Gbutton) {
			panel.setBackground(Color.green);
		} else if (e.getSource() == RGBbutton) {
			panel.setBackground(new Color(255, 100, 100,30));// r,g,b,a rgb는 컬러를 나타내는 숫자 a는 투명도를 나타냄. 
		}

	}

}

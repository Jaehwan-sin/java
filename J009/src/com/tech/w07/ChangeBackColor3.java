package com.tech.w07;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeBackColor3 extends JFrame implements ActionListener { // implements ActionListener 는 수신자를 하려면 해야한다.

	JPanel panel; // 밑에서 인식을 못 해서 필드로 뺌
	JButton ybutton,pbutton;

	public ChangeBackColor3() {
		setTitle("Change Color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

//		화면 구성
		panel = new JPanel();
		ybutton = new JButton("노랑");
		pbutton = new JButton("핑크");

		panel.add(ybutton);
		panel.add(pbutton);

//		판넬 프레임에 복사
		add(panel);

//		버튼에 수신자 부착
		ybutton.addActionListener(this);
		pbutton.addActionListener(this);

		setVisible(true);
	}

	public static void main(String[] args) {
		new ChangeBackColor3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호");
		// 버튼 클릭 후 그 값으로 조건을 만드는 if문
		if (e.getSource() == ybutton) {// 판넬의 색상변경, e.getSource()는 버튼 입력값으로 받게하는명령
			panel.setBackground(Color.yellow);
		} else if (e.getSource() == pbutton) {// 판넬의 색상변경
			panel.setBackground(Color.pink);
		}

	}
}

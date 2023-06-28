package com.tech.w07;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeBackColor2 extends JFrame implements ActionListener { // implements ActionListener 는 수신자를 하려면 해야한다.

	JPanel panel; // 밑에서 인식을 못 해서 필드로 뺌

	public ChangeBackColor2() {
		setTitle("Change Color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

//		화면 구성
		panel = new JPanel();
		JButton ybutton = new JButton("노랑");
		JButton pbutton = new JButton("핑크");

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
		new ChangeBackColor2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호");

		if (e.getActionCommand() == "노랑") {// 판넬의 색상변경
			panel.setBackground(Color.yellow);// 여기 panel. 에서 인식을 못해서 위에서 필드로 빼서 선언함.
		} else if (e.getActionCommand() == "핑크") {// 판넬의 색상변경
			panel.setBackground(Color.pink);
		}

	}
}

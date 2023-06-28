package com.tech.w04cal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalExam3 extends JFrame {
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { "Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };

	public static void main(String[] args) {
		new CalExam3();
	}

	public CalExam3() {
		setTitle("계산기");
		setSize(600, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());// 동서남북으로 설정가능한 레이아웃

		tField = new JTextField(45);
		tField.setText("0.");
		panel = new JPanel();
		panel.setLayout(new GridLayout(5, 5, 3, 3));// 행 열 간격 조절

		buttons = new JButton[25];

		int index = 0;
//		반복문으로 버튼생성

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				buttons[index] = new JButton(labels[index]);// 버튼생성

				if (col >= 3) {// 글자색상변경
					buttons[index].setForeground(Color.red);
				} else {
					buttons[index].setForeground(Color.blue);
				}
				buttons[index].setBackground(Color.cyan);

				panel.add(buttons[index]);// 판넬에 추가
				index++;
			}
		}
//		add(panel);
		add(tField, "North");
		add(panel, "Center");

		setVisible(true);
	}
}

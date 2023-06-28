package com.tech.w02;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter extends JFrame {

	private JLabel[] labels;
	private JButton button;
	private int[] numbers;

	public MyCounter() {
		System.out.println("aaaaa");

		setTitle("SlotMachine");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		labels = new JLabel[3];
		numbers = new int[3];

//		반복문을 사용해서 라벨 구성
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(numbers[i] + ""); // labels 은 글자가 들어오는데 number를 int로 했기때문에 string으로 고쳐줘야하는데 +""으로 string처럼 보이게한다.
			labels[i].setFont(new Font("impact", Font.BOLD, 100));
			labels[i].setSize(100, 100);
			labels[i].setLocation(100 + 120 * i, 20);
//		판넬에 추가
			panel.add(labels[i]);

		}
//		버튼 추가
		button = new JButton("땡겨!");

		button.setSize(300,50);
		button.setLocation(100, 150);
		panel.add(button);
		add(panel);

		setVisible(true);
	
	}
}

public class SlotMachine {

	public static void main(String[] args) {
		new MyCounter();
	}
}

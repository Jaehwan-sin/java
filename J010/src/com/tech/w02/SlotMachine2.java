package com.tech.w02;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter2 extends JFrame implements ActionListener {

	private JLabel[] labels;
	private JButton button;
	private int[] numbers;

	public MyCounter2() {
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
			labels[i] = new JLabel(numbers[i] + ""); // labels 은 글자가 들어오는데 number를 int로 했기때문에 string으로 고쳐줘야하는데 +""으로
													// string처럼 보이게한다.
			labels[i].setFont(new Font("impact", Font.BOLD, 100));
			labels[i].setSize(100, 100);
			labels[i].setLocation(100 + 120 * i, 30);
//		판넬에 추가
			panel.add(labels[i]);

		}
//		버튼 추가
		button = new JButton("땡겨!");
		button.addActionListener(this);
		button.setSize(300,50);
		button.setLocation(100, 150);
		panel.add(button);
		add(panel);

		setVisible(true);
	
	}
	int cnt=0;
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*10);
			labels[i].setText(numbers[i]+"");
		}
//		같은 숫자일 경우 추카추카 출력
		if (numbers[0]==numbers[1] && numbers[1]==numbers[2]) {
			button.setText("추카추카"+cnt);
		}
		cnt++;
	}
}

public class SlotMachine2 {

	public static void main(String[] args) {
		new MyCounter2();
	}
}

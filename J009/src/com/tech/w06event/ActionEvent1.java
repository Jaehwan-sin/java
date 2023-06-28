package com.tech.w06event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent1 extends JFrame {

	private JButton button;
	private JLabel label;

	public ActionEvent1() {
		setTitle("event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르세요!");
		label = new JLabel("아직도 버튼을 누르지 않았군요!");

//		판넬에 버튼,라벨 부착
		panel.add(button);
		panel.add(label);

//		판넬을 프레임에 부착
//		this.add(panel); // this가 이 클래스를 지칭하기때문에 this를 쓰지만 생략이 가능하다.
		add(panel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new ActionEvent1();
	}
}

package com.tech.mission;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SendNum3 extends JFrame implements ActionListener {

	private JButton btn1, btn2, btn3, btn4, btnplus, btnequals;
	private JTextField tf;
	private int num1, num2;

	@Override
	public void actionPerformed(ActionEvent e) {// 만들어진 버튼을 클릭 후의 처리 과정
		System.out.println("신호");
//		String num = e.getActionCommand();
//		e.getSource(); // 버튼을 눌렀다면 버튼을 의미한다.
//		버튼의 텍스트를 가져오는 방법
		int sum;

		if (e.getSource() == btn1) {
			tf.setText(tf.getText() + e.getActionCommand());
		} else if (e.getSource() == btn2) {
			tf.setText(tf.getText() + e.getActionCommand());
		} else if (e.getSource() == btn3) {
			tf.setText(tf.getText() + e.getActionCommand());
		} else if (e.getSource() == btnplus) {
			num1 = Integer.parseInt(tf.getText());
			tf.setText("");
		}  else if (e.getSource() == btnequals) {
			num2 = Integer.parseInt(tf.getText());
			sum = num1 + num2;
			tf.setText("합계 : " + sum);
		} else {
			tf.setText("");

		}

	}

	public SendNum3() {// 화면에서의 버튼을 만드는 과정
		setTitle("SnedNum");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		판넬 준비
		JPanel panel = new JPanel();
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("reset");
		btnplus = new JButton("+");
		btnequals = new JButton("=");

//		버튼들의 수신자 부착
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btnplus.addActionListener(this);
		btnequals.addActionListener(this);

//		판넬을 그리드 레이아웃으로 변경
		panel.setLayout(new GridLayout(0, 5, 3, 3));

//		판넬에 버튼 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btnplus);
		panel.add(btnequals);

//		텍스트필드 tf 생성
		tf = new JTextField(15);

//		프레임에 부착
		add(tf, "North");
		add(panel, "Center");
		add(btn4, "South");

		setVisible(true);
	}

	public static void main(String[] args) {
		new SendNum3();
	}

}

package com.tech.w06event;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SendNum extends JFrame implements ActionListener {
	
	private JButton btn1,btn2,btn3,btn4;
	private JTextField tf;

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호");
		String num = e.getActionCommand();
//		System.out.println(num);
		if (num=="1") {
			tf.setText(tf.getText()+num);// 숫자를 누적시켜 입력받는 방법 getText로 누적받는다. setText는 입력값을 보이게 하는것
		} else if (num=="2") {
			tf.setText(tf.getText()+num);		
		} else if (num=="3") {
			tf.setText(tf.getText()+num);			
		} else {
			tf.setText("");						
		}
		
	}
	
	public SendNum() {
		setTitle("SnedNum");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		판넬 준비
		JPanel panel = new JPanel();
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("reset");
		
//		버튼들의 수신자 부착
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
//		판넬을 그리드 레이아웃으로 변경
		panel.setLayout(new GridLayout(0,3,3,3));
		
//		판넬에 버튼 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
//		텍스트필드 tf 생성
		tf = new JTextField(15);
		
//		프레임에 부착
		add(tf, "North");
		add(panel, "Center");
		add(btn4, "South");
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new SendNum();
	}

}

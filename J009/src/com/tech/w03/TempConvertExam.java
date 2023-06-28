package com.tech.w03;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TempConvertExam extends JFrame {
	public static void main(String[] args) {
		new TempConvertExam(); // 생성자 호출
	}

	public TempConvertExam() {// 생성자
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("온도변환기");

//		판넬 준비
		JPanel p = new JPanel();
		p.setLayout(null);

//		라벨 준비
		JLabel l1 = new JLabel("화씨 온도");
		JLabel l2 = new JLabel("섭씨 온도");

//		텍스트 필드 준비
		JTextField tf1 = new JTextField(15);
		JTextField tf2 = new JTextField(15);

//		버튼 준비
		JButton b1 = new JButton("변환");

//		판넬에 준비된 컴포넌트 부착
		p.add(l1);
		p.add(l2);
		p.add(tf1);
		p.add(tf2);
		p.add(b1);

//		위치지정
		l1.setBounds(60, 40, 50, 20);
		l2.setBounds(60, 70, 50, 20);
		tf1.setBounds(120, 40, 200, 20);
		tf2.setBounds(120, 70, 200, 20);
		b1.setBounds(170, 100, 80, 40);

//		판넬을 프레임에 부착
		add(p);

		setVisible(true);
	}
}

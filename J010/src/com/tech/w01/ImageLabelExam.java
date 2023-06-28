package com.tech.w01;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelExam extends JFrame implements ActionListener {// 수신자 부착하면 implements ActionListener를 해야한다.

	private JPanel panel;
	private JLabel label;
	private JButton button;

	public ImageLabelExam() {

		setTitle("ImageControl");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		label = new JLabel("이미지를 보려면 버튼을 클릭하세요");
		button = new JButton("이미지 버튼");

		ImageIcon icon = new ImageIcon("src/bullet.png");
		button.setIcon(icon);
		button.setPreferredSize(new Dimension(200, 30)); // 이미지 버튼 사이즈 조절

		button.addActionListener(this);// 버튼에 수신자 부착

		panel.add(label);
		panel.add(button);

		add(panel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new ImageLabelExam();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("신호");
		ImageIcon dog = new ImageIcon("src/dog.gif");
		label.setIcon(dog);
		label.setText("");
	}
}

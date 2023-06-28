package com.tech.w01;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxExam extends JPanel implements ItemListener, ActionListener { // JPanel을 상속받고 JFrame은 임의의 변수를 선언하고
																					// frame.을 달아준다.

	private JCheckBox[] buttons = new JCheckBox[3];
	private String[] fruits = { "apple", "grape", "orange" };
	private JLabel[] labels = new JLabel[3];
	private ImageIcon[] icon = new ImageIcon[3];

	public CheckBoxExam() {
		setLayout(new GridLayout(0, 4)); // CheckBoxExam의 레이아웃을 말하지만 JPanel의 상속을 받기때문에 JPanel의 레이아웃이 바뀐다.
										// 가로 레이아웃
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
//			buttons[i].addActionListener(this);
			buttons[i].addItemListener(this);// 상태의 변화가 있을 때마다 신호가 들어온다.
			buttons[i].setBackground(Color.green);

			labels[i] = new JLabel(fruits[i] + ".gif");
			icon[i] = new ImageIcon(fruits[i] + ".gif");// 이미지 넣기
		}
		JPanel checkPanel = new JPanel(new GridLayout(0, 1));// 체크박스 세로 레이아웃
		for (int i = 0; i < buttons.length; i++) {
			checkPanel.add(buttons[i]);

		}
		add(checkPanel);
		add(labels[0]);
		add(labels[1]);
		add(labels[2]);
	}

	public static void main(String[] args) {
		new CheckBoxExam(); // 생성자 호출

		JFrame frame = new JFrame();

		frame.setTitle("Check Box");
		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CheckBoxExam panel = new CheckBoxExam();

		frame.add(panel);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hi sss");

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("state change");
		Object source = e.getItemSelectable(); 
		for (int i = 0; i < buttons.length; i++) {
			if (source == buttons[i]) {
				if (e.getStateChange()==ItemEvent.DESELECTED) {// 선택되지 않았냐 (체크 안 된 상태)
					labels[i].setIcon(null);
				}else {// 체크 했을 때 아이콘의 이미지가 나와라
					labels[i].setIcon(icon[i]);
					
				}
			}
		}
	}
}

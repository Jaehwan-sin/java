package com.tech.w02;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.NumberUpSupported;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachinePractice extends JFrame implements ActionListener {

	private JLabel[] labels;
	private JButton btn, btnreset;
	private int[] num;

	public SlotMachinePractice() {
		setSize(600, 300);
		setTitle("slotmachine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		labels = new JLabel[3];
		num = new int[3];

		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(num[i] + "");

			labels[i].setFont(new Font("impact", Font.ITALIC, 80));
			labels[i].setSize(100, 100);
			labels[i].setLocation(100 + 120 * i, 20);

			panel.add(labels[i]);
		}

		btn = new JButton("땡기세여!");
		btnreset = new JButton("초기화");
		btn.addActionListener(this);
		btnreset.addActionListener(this);
		btn.setSize(300, 50);
		btnreset.setSize(300, 50);
		btn.setLocation(100, 150);
		btnreset.setLocation(100, 200);
		btn.setBackground(Color.white);
		btnreset.setBackground(Color.pink);
		panel.add(btn);
		panel.add(btnreset);

		add(panel);

		setVisible(true);
	}

	public static void main(String[] args) {
		new SlotMachinePractice();
	}

	int cnt;

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn) {
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 10);
				labels[i].setText(num[i] + "");
			}
			if (num[0] == num[1] && num[1] == num[2]) {
				btn.setText("ㅊㅋㅊㅋ" + cnt);
				cnt++;
			}else if (e.getSource() == btnreset) {
				for (int i = 0; i < labels.length; i++) {
					labels[i].setText("");
				}
			}
		}
		
		
		
	}
}

package com.tech.w02;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class SizePanel2 extends JPanel implements ActionListener {

	protected JRadioButton Small, Medium, Large;
	protected ButtonGroup bg;
	protected String SizeStr = "";

	public SizePanel2() {
//		판넬 화면 구성하기
		setLayout(new GridLayout(3, 1));
		Small = new JRadioButton("스몰");
		Medium = new JRadioButton("미디움");
		Large = new JRadioButton("라지");

//		각자 수신자 부착
		Small.addActionListener(this);
		Medium.addActionListener(this);
		Large.addActionListener(this);

		bg = new ButtonGroup();
		bg.add(Small);
		bg.add(Medium);
		bg.add(Large);
		this.setBorder(BorderFactory.createTitledBorder("Size"));

		add(Small);
		add(Medium);
		add(Large);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Small) {
			SizeStr = "Small";
		} else if (e.getSource() == Medium) {
			SizeStr = "Medium";
		} else if (e.getSource() == Large) {
			SizeStr = "Large";
		}
		System.out.println("사이즈 : " + SizeStr);
	}

}
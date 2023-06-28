package com.tech.semi_project;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Colorpanel extends JPanel {
	protected JRadioButton black, white;
	public ButtonGroup colorbg;

	public Colorpanel() {
		setLayout(new GridLayout(2, 1));
		black = new JRadioButton("블랙");
		white = new JRadioButton("화이트");

		colorbg = new ButtonGroup();
		colorbg.add(black);
		colorbg.add(white);
		this.setBorder(BorderFactory.createTitledBorder("색상"));

		add(black);
		add(white);
	}

}

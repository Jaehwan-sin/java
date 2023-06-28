package com.tech.semi_project;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Genderpanel extends JPanel {
	protected JRadioButton man, women;
	public ButtonGroup genderbg;

	public Genderpanel() {
		setLayout(new GridLayout(2, 1));
		man = new JRadioButton("남자");
		women = new JRadioButton("여자");

		genderbg = new ButtonGroup();
		genderbg.add(man);
		genderbg.add(women);
		this.setBorder(BorderFactory.createTitledBorder("성별"));

		add(man);
		add(women);
	}
}
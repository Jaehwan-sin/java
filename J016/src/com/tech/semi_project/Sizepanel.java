package com.tech.semi_project;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Sizepanel extends JPanel {
	protected JRadioButton XS, S, M, L, XL;
	public ButtonGroup sizebg;

	public Sizepanel() {
		setLayout(new GridLayout(5, 1));
		XS = new JRadioButton("XS");
		S = new JRadioButton("S");
		M = new JRadioButton("M");
		L = new JRadioButton("L");
		XL = new JRadioButton("XL");

		sizebg = new ButtonGroup();
		sizebg.add(XS);
		sizebg.add(S);
		sizebg.add(M);
		sizebg.add(L);
		sizebg.add(XL);
		this.setBorder(BorderFactory.createTitledBorder("사이즈"));

		add(XS);
		add(S);
		add(M);
		add(L);
		add(XL);
	}
}

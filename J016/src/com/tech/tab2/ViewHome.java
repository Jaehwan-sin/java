package com.tech.tab2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ViewHome extends JPanel {
	
	JButton btnhome;

	public ViewHome() {
		setBackground(Color.LIGHT_GRAY);
		btnhome = new JButton("btnhome");
		add(btnhome);
	}
}

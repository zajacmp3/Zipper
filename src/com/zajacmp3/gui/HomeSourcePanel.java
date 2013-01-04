package com.zajacmp3.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class HomeSourcePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1722107479469910143L;
	public Dimension d = new Dimension(600, 50);
	

	public HomeSourcePanel() {
		
		//Setting layout manager, so gridbagconstraints may work
		setLayout(new GridBagLayout());
		
		setSize(d);
		setBackground(new Color(100));
		setVisible(true);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = gbc.weighty = 1;
		gbc.insets = new Insets(10, 10, 10, 10);
		add(new HomeSourceTextBox(),gbc);
		
		gbc.anchor = GridBagConstraints.EAST;
		gbc.weightx = gbc.weighty = 0;
		add(new HomeZipButton(),gbc);
		
		add(new HomeUnzipButton(),gbc);
	}
}

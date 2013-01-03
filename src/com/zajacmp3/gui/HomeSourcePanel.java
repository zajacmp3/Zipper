package com.zajacmp3.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;

public class HomeSourcePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1722107479469910143L;
	public Dimension d = new Dimension(600, 50);
	

	public HomeSourcePanel() {

		setSize(d);
		setBackground(new Color(100));
		setVisible(true);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.weightx = gbc.weighty = 1;
		add(new HomeSourceTextBox(),gbc);
		
		gbc.anchor = GridBagConstraints.EAST;
		gbc.weightx = gbc.weighty = 1;
		add(new HomeSourceButton(),gbc);
	}
	
	public Dimension getDimension(){
		return d;
	}
}

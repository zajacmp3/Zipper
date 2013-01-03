package com.zajacmp3.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.JPanel;

public class HomeBlankPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6911373974219898286L;
	
	HomeBlankPanel(){
		setBackground(new Color(100));
		setVisible(true);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.weightx = gbc.weighty = 1;
		
		add(new HomeSourceTextBox(),gbc);

	}

}

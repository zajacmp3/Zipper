package com.zajacmp3.gui.about;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class MenuHelpAboutFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3894873960560294448L;

	public MenuHelpAboutFrame(){
		setTitle("About");
		setSize(500,150);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		setLayout(new GridBagLayout());		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		getContentPane().add(new MenuHelpAboutLabel());
		
		
	}
}


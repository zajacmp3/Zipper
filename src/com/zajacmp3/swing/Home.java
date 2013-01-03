package com.zajacmp3.swing;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Home{

	public void createFrame(){
		JFrame frame = new JFrame("Zipper v0.01");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		JPanel panel = new JPanel(new GridBagLayout());
		JLabel label = new JLabel("label");
		panel.add(label);
		panel.setVisible(true);
		frame.getContentPane().add(panel, gbc);
	}
	
}

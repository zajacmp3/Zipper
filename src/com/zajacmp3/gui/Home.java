package com.zajacmp3.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import com.zajacmp3.gui.menubar.MenuBar;

public class Home extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4069090877848717372L;

	public Dimension d = new Dimension(600, 300);
	
	public Home(){
		setSize(d);
		setBackground(new Color(100));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Zipper v0.01");
		setResizable(false);
		setLayout(new GridBagLayout());
		setVisible(true);
		
		addComponents();
		
	}
	
	public void addComponents(){
		setJMenuBar(new MenuBar());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.weightx = gbc.weighty = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;

		getContentPane().add(new HomeSourcePanel(), gbc);
	}
	
	public Home(String text){
		this.dispose();
	}
	
	public Dimension getDimension(){
		return d;
	}

}

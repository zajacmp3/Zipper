package com.zajacmp3.gui;

import java.awt.Dimension;
import javax.swing.JTextField;

public class HomeSourceTextBox extends JTextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3387184252168604673L;
	Dimension d = new Dimension(600, 20);
	
	public HomeSourceTextBox() {
		

		setMinimumSize(d);
		setColumns(10);
		setEnabled(true);
		setText("Text");
		
		setVisible(true);
		
	}
	

}

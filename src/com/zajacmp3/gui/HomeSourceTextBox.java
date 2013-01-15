package com.zajacmp3.gui;

import java.awt.Dimension;
import java.io.IOException;
import java.io.StringWriter;

import javax.swing.JTextField;

public class HomeSourceTextBox extends JTextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3387184252168604673L;
	Dimension d = new Dimension(600, 20);
	
	public HomeSourceTextBox(HomeSourcePanel hsp) {
		

		setMinimumSize(d);
		setColumns(25);
		setEnabled(true);
		setText("File...");
		
		setVisible(true);
	}

	public String getText(){	
		StringWriter sw = new StringWriter();
		try {
			write(sw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sw.toString();		
	}

}

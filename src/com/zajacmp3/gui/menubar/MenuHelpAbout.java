package com.zajacmp3.gui.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import com.zajacmp3.gui.about.MenuHelpAboutFrame;

public class MenuHelpAbout extends JMenuItem implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8312128482755004090L;
	
	MenuHelpAbout(){
		setText("About");
		addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		new MenuHelpAboutFrame();
		
		
	}
	
	

}

package com.zajacmp3.gui.menubar;

import javax.swing.JMenu;

public class MenuHelp extends JMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4540777032635426284L;
	
	MenuHelp(){
		setText("Help");
		add(new MenuHelpAbout());
	}

}

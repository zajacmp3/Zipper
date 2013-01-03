package com.zajacmp3.gui.menubar;

import javax.swing.JMenuBar;

public class MenuBar extends JMenuBar{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3859642717428381421L;

	public MenuBar(){
		add(new MenuFile());
		add(new MenuHelp());
	}

}

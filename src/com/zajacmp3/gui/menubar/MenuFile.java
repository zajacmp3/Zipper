package com.zajacmp3.gui.menubar;

import javax.swing.JMenu;
import com.zajacmp3.gui.menubar.MenuFileExit;

public class MenuFile extends JMenu{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1778592392636914639L;

	MenuFile(){
		setText("File");
		add(new MenuFileExit());
	}
	
}

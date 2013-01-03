package com.zajacmp3.gui.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import com.zajacmp3.executor.Execute;

public class MenuFileExit extends JMenuItem implements ActionListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MenuFileExit(){
		setText("Exit");
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event){
		new Execute().Exit();
	}
	
}

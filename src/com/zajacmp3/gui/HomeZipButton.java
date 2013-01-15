package com.zajacmp3.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import com.zajacmp3.zipper.Zipper;

public class HomeZipButton extends JButton implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1941469644718599712L;
	
	public static Object o;
	
	public HomeZipButton(HomeSourcePanel hsp) {
		setText("Zip!");
		setPreferredSize(new Dimension(100, 20));
		addActionListener(this);
		o = hsp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(o instanceof HomeSourcePanel){
			String text = ((HomeSourcePanel) o).hstb.getText();
			//Wyslanie do zippera;
			String[] args = {""+text,""+text};
			try {
				Zipper.zipper(args);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				((HomeSourcePanel)o).getParent().add(new ErrorFrameWithChangingJLabel("Error - File not found!"));
			}
		}
	}
	
	

}

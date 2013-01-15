package com.zajacmp3.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;

import com.zajacmp3.zipper.Unzipper;

public class HomeUnzipButton extends JButton implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7245624908173256525L;
	
	public Object o;
	
	HomeUnzipButton(HomeSourcePanel hsp){
		setPreferredSize(new Dimension(100, 20));
		setText("Unzip!");
		o = hsp;
		addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(o instanceof HomeSourcePanel){
			String text = ((HomeSourcePanel) o).hstb.getText();
			//Wyslanie do unzippera;
			String[] args = {""+text,""+text.replaceAll(".zip", "")};
			try {
				Unzipper.unzip(args);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				((HomeSourcePanel)o).getParent().add(new ErrorFrameWithChangingJLabel("Error - File not found!"));
			}
		}
	}

}

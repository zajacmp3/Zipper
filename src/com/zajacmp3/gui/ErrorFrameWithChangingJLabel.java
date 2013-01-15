package com.zajacmp3.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ErrorFrameWithChangingJLabel extends JFrame {

	public ErrorFrameWithChangingJLabel(String e) {
		setSize(300, 100);
		setResizable(false);
		setAlwaysOnTop(true);
		setAutoRequestFocus(true);
		setVisible(true);
		add(new JLabel(e));
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4623230216622727927L;

}

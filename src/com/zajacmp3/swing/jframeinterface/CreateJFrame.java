package com.zajacmp3.swing.jframeinterface;

import javax.swing.JFrame;

public interface CreateJFrame {
	
	void createJFrame();
	boolean setDimensions(JFrame frame, int width, int height);
	boolean setVisible(JFrame frame, boolean state);
	
}

package guistuff;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class gui extends JFrame {
	public gui (int x, int y) {
		this.setVisible(true);
		this.setSize(x, y);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


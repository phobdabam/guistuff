package guistuff;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class panel extends JPanel{
	int x = 250,
	    y = 250;
	Graphics p;
	public panel() {
		
	}
	public void paint (Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x - 49, y - 49, 99, 99);
	}
	public void pencil (int xpos, int ypos) {
		x = xpos;
		y = ypos;
		repaint();
	}
}

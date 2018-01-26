package guistuff;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import javax.swing.JPanel;

public class panel extends JPanel implements ActionListener {
	static int x = 50,
	    y = 50;
	int moveX = 10,
		moveY = 10;
	Graphics p;
	Timer panTime = new Timer(10, this);
	public panel() {
		
	}
	public void paint (Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.BLUE);
		g.fillOval(x , y , 100, 100);
		panTime.start();
	}
	public void pencil (int xpos, int ypos) {
		//redraws the circle where the mouse clicked
		x = xpos - 50;
		y = ypos - 50;
		
		//changes the movement to go towards where the mouse clicked
//		moveX = (xpos - x - 50);
//		moveY = (ypos - y - 50);
		
		
		repaint();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// what happens on click
		
		//ball movement
		x = x + moveX;
		y = y + moveY;
		
		//bounce
		if (x >= this.getWidth() - 100 || x <= 0) {
			moveX *= -1;
		}
		if (y >= this.getHeight() - 100 || y <= 0) {
			moveY *= -1; 
		}
		repaint();
	}
}

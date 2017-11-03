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
	int move = 2;
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
		x = xpos;
		y = ypos;
		repaint();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		x = x + move;
		
		if (x == this.getWidth()-100) {
			move = -2;
		}
		repaint();
	}
}

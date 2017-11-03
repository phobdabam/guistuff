package guistuff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;

public class APracticeTimer {
	public static void main(String[] args) {
		new JFrame().setVisible(true);
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed (ActionEvent actionEvent) {
				System.out.println("Hello world timer");
			}
		}
		Timer timer = new Timer(1000, actionListener);
		timer.start();
	}
}

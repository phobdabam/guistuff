package guistuff;

import java.awt.BorderLayout;

public class main {
	public main() {
		int x = 1024,
		    y = 768;
		gui thisFrame = new gui(x, y);
		panel thisPanel = new panel();
		listname thisListener = new listname(thisPanel);
		buttonA firstButton = new buttonA("Push it");
		thisFrame.add(thisPanel, BorderLayout.CENTER);
		thisFrame.add(firstButton,BorderLayout.SOUTH);
		thisPanel.addMouseListener(thisListener);
	}
	
	public static void main(String[] args) {
		new main();
	}
}

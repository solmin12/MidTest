package main;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	public MainFrame() {
		this.setTitle("°è»ê±â");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 700);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(0,1));
		
		

		Panel_card 	panel_card = new Panel_card();
		this.add(panel_card);
	}
}

package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MainFrame extends JFrame {

	public MainFrame() {
		this.setTitle("°è»ê±â");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 700);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(1, 0, 20, 20));

		Panel_main panel_main = new Panel_main();
		this.add(panel_main);
		
	}
}

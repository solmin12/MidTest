package main;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class Panel_list extends JPanel {
	JTextArea list = new JTextArea();
	public Panel_list() {
		this.setBorder(new LineBorder(Color.blue, 3));
		this.setLayout(new GridLayout(1,0));
		
		list.setEditable(false);
		this.add(list);
	}
//
//	public void addList (String i) {
//		list.append(i);
//	}
}

package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
//	Box box = new Box();
	public MainFrame() {
		this.setTitle("계산기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,500);
		//수정 필요 (layout)
		this.setLayout(new GridLayout(1,0, 20,20));
		
		Panel_list panel_list = new Panel_list();
		Panel_main panel_main = new Panel_main();
//		
//		box.setI(panel_main.write());
//		panel_list.addList(box.getI());
		this.add(panel_list);
		this.add(panel_main);
	}
}

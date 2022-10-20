package main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_card extends JPanel {
	
	public Panel_card() {
		this.setLayout(new CardLayout());
		
		JPanel main = new JPanel();
		main.setLayout(new BorderLayout());
		this.add(main,"main");
		
		ImageIcon img_cal = new ImageIcon("./image/calculator.png");
		Image img_c = img_cal.getImage();
		Image img_c_ = img_c.getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
		ImageIcon img_cal2 = new ImageIcon(img_c_);
		ImageIcon img_ruler = new ImageIcon("./image/ruler.png");
		Image img_r = img_ruler.getImage();
		Image img_r_ = img_r.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		ImageIcon img_ruler2 = new ImageIcon(img_r_);
		
		
		JButton ruler = new JButton(img_ruler2);
		main.add(ruler, BorderLayout.NORTH);
		ruler.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				change2();
			}
		});
		ruler.setBackground(new Color(255,255,255));

		
		Panel_main panel_main = new Panel_main();
		main.add(panel_main, BorderLayout.CENTER);
		//
		JPanel panel_ = new JPanel();
		panel_.setLayout(new BorderLayout());
		this.add(panel_,"measure");
		
		JButton calculator = new JButton(img_cal2);
		calculator.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				change();
			}
		});
		calculator.setBackground(new Color(255,255,255));
		panel_.add(calculator, BorderLayout.NORTH);

		Panel_measure panel_measure = new Panel_measure();
		panel_.add(panel_measure, BorderLayout.CENTER);
	}
	
	public void change() {
		CardLayout cl = (CardLayout)(this.getLayout());
		cl.show(this,"main");
	}
	
	public void change2() {
		CardLayout cl = (CardLayout)(this.getLayout());
		cl.show(this,"measure");
	}
}

package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Panel_measure extends JPanel {
	public Panel_measure() {
		this.setLayout(new GridLayout(0,1));
		
		Font font_btn = new Font("Arial Rounded MT ±½°Ô", Font.BOLD, 20);
		
		JTextArea input = new JTextArea();
		input.setEditable(false);
		this.add(input);
		JTextArea result = new JTextArea();
		result.setEditable(false);
		this.add(result);
		
		JPanel btn = new JPanel();
		btn.setLayout(new GridLayout(4,4));
		this.add(btn);
		
		ImageIcon img_back = new ImageIcon("./image/back.png");
		Image img_b = img_back.getImage();
		Image img_b_ = img_b.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		ImageIcon img_back2 = new ImageIcon(img_b_);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("1");
			}
		});
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("2");
			}
		});
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("3");
			}
		});
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("4");
			}
		});
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("5");
			}
		});
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("6");
			}
		});
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("7");
			}
		});
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("8");
			}
		});
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("9");
			}
		});
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("0");
			}
		});
		JButton point = new JButton(".");
		point.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append(".");
			}
		});
		JButton delete = new JButton(img_back2);
		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(input.getSelectionEnd()==0) {
					
				}else {
				int i = input.getCaretPosition();
				input.replaceRange("", i-1,i);
				}
			}
		});
		JButton all_del = new JButton("AC");
		all_del.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = input.getCaretPosition();
				input.replaceRange("", 0,i);
			}
		});
		JButton non = new JButton();
		JButton non_ = new JButton();
		JButton non__ = new JButton();
		
		seven.setBackground(new Color(255,255,255));
		eight.setBackground(new Color(255,255,255));
		nine.setBackground(new Color(255,255,255));
		delete.setBackground(new Color(255,255,255));
		four.setBackground(new Color(255,255,255));
		five.setBackground(new Color(255,255,255));
		six.setBackground(new Color(255,255,255));
		all_del.setBackground(new Color(255,255,255));
		one.setBackground(new Color(255,255,255));
		two.setBackground(new Color(255,255,255));
		three.setBackground(new Color(255,255,255));
		non.setBackground(new Color(255,255,255));
		non_.setBackground(new Color(255,255,255));
		zero.setBackground(new Color(255,255,255));
		point.setBackground(new Color(255,255,255));
		non__.setBackground(new Color(255,255,255));
		
		seven.setFont(font_btn);
		eight.setFont(font_btn);
		nine.setFont(font_btn);
		delete.setFont(font_btn);
		four.setFont(font_btn);
		five.setFont(font_btn);
		six.setFont(font_btn);
		all_del.setFont(font_btn);
		one.setFont(font_btn);
		two.setFont(font_btn);
		three.setFont(font_btn);
		non.setFont(font_btn);
		non_.setFont(font_btn);
		zero.setFont(font_btn);
		point.setFont(font_btn);
		non__.setFont(font_btn);
		
		btn.add(seven);
		btn.add(eight);
		btn.add(nine);
		btn.add(delete);
		btn.add(four);
		btn.add(five);
		btn.add(six);
		btn.add(all_del);
		btn.add(one);
		btn.add(two);
		btn.add(three);
		btn.add(non);
		btn.add(non_);
		btn.add(zero);
		btn.add(point);
		btn.add(non__);
	}
}

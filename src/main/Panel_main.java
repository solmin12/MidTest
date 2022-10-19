package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;

public class Panel_main extends JPanel {
	Calculator calculator = new Calculator();
	String all = "";
	
	public Panel_main() {
		
		Font font = new Font("Arial Rounded MT 굵게", Font.BOLD,50);
		Font font_btn = new Font("Arial Rounded MT 굵게", Font.BOLD, 20);
		
//		this.setBorder(new LineBorder(Color.blue, 3));
		this.setLayout(new GridLayout(0,1));
		//입력 받은 값을 보여줄 textArea
		JTextArea input = new JTextArea();
		input.setFont(font);
		input.setEditable(false);
		this.add(input);
		//버튼의 Panel
		JPanel btn = new JPanel();
		btn.setLayout(new GridLayout(4,6));
		this.add(btn);
		
		ImageIcon img_back = new ImageIcon("./image/back.png");
		Image img_b = img_back.getImage();
		Image img_b_ = img_b.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		ImageIcon img_back2 = new ImageIcon(img_b_);
		
		JButton root = new JButton("√");
		root.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("√");
			}	
		});
		JButton up = new JButton("^");
		up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("^");
			}	
		});
		JButton factorial = new JButton("!");
		factorial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("!");
			}	
		});
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
		JButton divison = new JButton("/");
		divison.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("/");
			}
		});
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("*");
			}
		});
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("+");
			}
		});
		JButton substraction = new JButton("-");
		substraction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("-");
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
		JButton remain = new JButton("%");
		remain.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("%");
			}
		});
		JButton non = new JButton("");
		JButton result = new JButton("=");
		result.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//"="버튼을 누를 경우 TextArea에 입력된 값이 Calculator에 전달되도록 만들어야 함
				input.append("=");
				calculator.convert(input.getText());
				String i = calculator.compute();
				all = input +i;
				input.setText(i);
				calculator.clearArray();
			}
		});
		JButton non_ = new JButton();
		
		one.setBackground(new Color(255,255,255));
		two.setBackground(new Color(255,255,255));
		three.setBackground(new Color(255,255,255));
		four.setBackground(new Color(255,255,255));
		five.setBackground(new Color(255,255,255));
		six.setBackground(new Color(255,255,255));
		seven.setBackground(new Color(255,255,255));
		eight.setBackground(new Color(255,255,255));
		nine.setBackground(new Color(255,255,255));
		zero.setBackground(new Color(255,255,255));
		root.setBackground(new Color(255,255,255));
		divison.setBackground(new Color(255,255,255));
		all_del.setBackground(new Color(255,255,255));
		multiply.setBackground(new Color(255,255,255));
		remain.setBackground(new Color(255,255,255));
		up.setBackground(new Color(255,255,255));
		add.setBackground(new Color(255,255,255));
		non.setBackground(new Color(255,255,255));
		factorial.setBackground(new Color(255,255,255));
		zero.setBackground(new Color(255,255,255));
		point.setBackground(new Color(255,255,255));
		delete.setBackground(new Color(255,255,255));
		substraction.setBackground(new Color(255,255,255));
		result.setBackground(new Color(255,255,255));
		non_.setBackground(new Color(255,255,255));
		
		one.setFont(font_btn);
		two.setFont(font_btn);
		three.setFont(font_btn);
		four.setFont(font_btn);
		five.setFont(font_btn);
		six.setFont(font_btn);
		seven.setFont(font_btn);
		eight.setFont(font_btn);
		nine.setFont(font_btn);
		zero.setFont(font_btn);
		point.setFont(font_btn);
		root.setFont(font_btn);
		divison.setFont(font_btn);
		all_del.setFont(font_btn);
		multiply.setFont(font_btn);
		remain.setFont(font_btn);
		up.setFont(font_btn);
		add.setFont(font_btn);
		non.setFont(font_btn);
		factorial.setFont(font_btn);
		delete.setFont(font_btn);
		substraction.setFont(font_btn);
		result.setFont(font_btn);
		non_.setFont(font_btn);
		
		btn.add(root);
		btn.add(seven);
		btn.add(eight);
		btn.add(nine);
		btn.add(divison);
		btn.add(all_del);
		btn.add(non_);
		btn.add(four);
		btn.add(five);
		btn.add(six);
		btn.add(multiply);
		btn.add(remain);
		btn.add(up);
		btn.add(one);
		btn.add(two);
		btn.add(three);
		btn.add(add);
		btn.add(non);
		btn.add(factorial);
		btn.add(point);
		btn.add(zero);
		btn.add(delete);
		btn.add(substraction);
		btn.add(result);
		
	}
	
	ActionListener exit = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent ae) {
			System.exit(0);
		}
	};

}

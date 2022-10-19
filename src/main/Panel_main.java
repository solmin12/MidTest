package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class Panel_main extends JPanel {
	Calculator calculator = new Calculator();
	String all = "";
	
	public Panel_main() {
		Font font = new Font("Arial Rounded MT 굵게", Font.BOLD,50);
		
		this.setBorder(new LineBorder(Color.blue, 3));
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
		
		JButton root = new JButton("√");
		root.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.append("√");
			}	
		});
		JButton pi = new JButton("∏");
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
		JButton delete = new JButton("<-");
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
		btn.add(root);
		btn.add(one);
		btn.add(two);
		btn.add(three);
		btn.add(divison);
		btn.add(all_del);
		btn.add(pi);
		btn.add(four);
		btn.add(five);
		btn.add(six);
		btn.add(multiply);
		btn.add(remain);
		btn.add(up);
		btn.add(seven);
		btn.add(eight);
		btn.add(nine);
		btn.add(add);
		btn.add(non);
		btn.add(factorial);
		btn.add(zero);
		btn.add(point);
		btn.add(delete);
		btn.add(substraction);
		btn.add(result);
	}
//	
//	public String write() {
//		return all;
//	}
	
}

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
	JTextArea input = new JTextArea();
	JButton[] btn_ = new JButton[24];
	
	public Panel_main() {
		
		Font font = new Font("Arial Rounded MT 굵게", Font.BOLD,50);
		Font font_btn = new Font("Arial Rounded MT 굵게", Font.BOLD, 20);

		this.setLayout(new GridLayout(0,1));
		//입력 받은 값을 보여줄 textArea
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
		
		for(int i=0;i<10;i++) {
		btn_[i] = new JButton(Integer.toString(i));
		}
		btn_[10] = new JButton("-");//substraction
		btn_[11] = new JButton("√"); //root
		btn_[12] = new JButton("^"); //up
		btn_[13] = new JButton("!"); //factorial
		btn_[14] = new JButton("."); //point
		btn_[15] = new JButton("%"); //remain
		btn_[16]= new JButton("/"); //divison
		btn_[17]= new JButton("*"); //multiply
		btn_[18]= new JButton("+"); //add
		btn_[19]= new JButton(""); //non
		btn_[20]= new JButton("AC"); //all_clear
		btn_[21]= new JButton(img_back2); //delete
		btn_[22]= new JButton("="); //result
		btn_[23]= new JButton(""); //non
		
		ActionHandler add = new ActionHandler();
		
		for(int i=0;i<19;i++) {
			btn_[i].addActionListener(add);
		}
		
		btn_[20].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = input.getCaretPosition();
				input.replaceRange("", 0,i);
			}
		});
		btn_[21].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(input.getSelectionEnd()==0) {
					
				}else {
				int i = input.getCaretPosition();
				input.replaceRange("", i-1,i);
				}
			}
		});
		btn_[22].addActionListener(new ActionListener() {
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
		
		for(int i=0;i<24;i++) {
		btn_[i].setFont(font_btn);
		btn_[i].setBackground(new Color(255,255,255));
		}
		
		btn.add(btn_[11]);
		btn.add(btn_[7]);
		btn.add(btn_[8]);
		btn.add(btn_[9]);
		btn.add(btn_[18]);
		btn.add(btn_[17]);
		btn.add(btn_[12]);
		btn.add(btn_[4]);
		btn.add(btn_[5]);
		btn.add(btn_[6]);
		btn.add(btn_[10]);
		btn.add(btn_[16]);
		btn.add(btn_[13]);
		btn.add(btn_[1]);
		btn.add(btn_[2]);
		btn.add(btn_[3]);
		btn.add(btn_[21]);
		btn.add(btn_[20]);
		btn.add(btn_[15]);
		btn.add(btn_[19]);
		btn.add(btn_[0]);
		btn.add(btn_[14]);
		btn.add(btn_[22]);
		btn.add(btn_[23]);
	}
	
	ActionListener exit = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent ae) {
			System.exit(0);
		}
	};
	
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String i = e.getActionCommand();
			input.append(i);
		}		
	}

}

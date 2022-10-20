package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Panel_thermometer extends JPanel {
	Thermometer the = new Thermometer();
	JTextArea text_input = new JTextArea();
	JButton[] btn_ = new JButton[16];
	Double a;

	public Panel_thermometer() {
		this.setLayout(new GridLayout(0, 1));

		Font font = new Font("Arial Rounded MT ±½°Ô", Font.BOLD, 50);
		Font font_btn = new Font("Arial Rounded MT ±½°Ô", Font.BOLD, 20);

		JPanel text = new JPanel(new GridLayout(0, 1));
		this.add(text);

		JPanel input = new JPanel(new BorderLayout());
		JLabel label_input = new JLabel("ÀÔ·Â (¼·¾¾)");
		input.add(label_input, BorderLayout.NORTH);

		text_input.setFont(font);
		text_input.setEditable(false);
		input.add(text_input, BorderLayout.CENTER);
		text.add(input);

		JPanel result = new JPanel(new BorderLayout());

		JPanel set = new JPanel(new FlowLayout());
		result.add(set, BorderLayout.NORTH);

		String[] mea = {"È­¾¾","ÄÌºó"};
		JComboBox<String> box = new JComboBox<>(mea);

		set.add(box);

		JLabel label_result = new JLabel("°á°ú");
		set.add(label_result);

		JTextArea text_result = new JTextArea();
		text_result.setEditable(false);
		text_result.setFont(font);
		result.add(text_result, BorderLayout.CENTER);
		text.add(result);

		JPanel btn = new JPanel();
		btn.setLayout(new GridLayout(4, 4));
		this.add(btn);

		ImageIcon img_back = new ImageIcon("./image/back.png");
		Image img_b = img_back.getImage();
		Image img_b_ = img_b.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		ImageIcon img_back2 = new ImageIcon(img_b_);

		for (int i = 0; i < 10; i++) {
			btn_[i] = new JButton(Integer.toString(i));
		}
		btn_[10] = new JButton(".");
		btn_[11] = new JButton(img_back2);
		btn_[12] = new JButton("=");
		btn_[13] = new JButton("AC");
		btn_[14] = new JButton();
		btn_[15] = new JButton();

		ActionHandler add = new ActionHandler();

		for (int i = 0; i < 11; i++) {
			btn_[i].addActionListener(add);
		}
		btn_[11].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (text_input.equals("")) {

				} else {
					int i = text_input.getCaretPosition();
					text_input.replaceRange("", i - 1, i);
				}
			}
		});
		btn_[12].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String n = text_input.getText();
				if (n.equals("")) {

				} else {
					String i = box.getSelectedItem().toString();
					Measure measure = new Measure();
					if (i.equals("È­¾¾")) {
						a = the.f(Double.parseDouble(n));
					} else if (i.equals("ÄÌºó")) {
						a = the.k(Double.parseDouble(n));
					}
					text_result.setText(Double.toString(a));
				}
			}
		});
		btn_[13].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = text_input.getCaretPosition();
				text_input.replaceRange("", 0, i);
				int l = text_result.getCaretPosition();
				text_result.replaceRange("", 0, l);
			}
		});

		for (int i = 0; i < 16; i++) {
			btn_[i].setFont(font_btn);
			btn_[i].setBackground(new Color(255, 255, 255));
		}

		btn.add(btn_[7]);
		btn.add(btn_[8]);
		btn.add(btn_[9]);
		btn.add(btn_[11]);
		btn.add(btn_[4]);
		btn.add(btn_[5]);
		btn.add(btn_[6]);
		btn.add(btn_[13]);
		btn.add(btn_[1]);
		btn.add(btn_[2]);
		btn.add(btn_[3]);
		btn.add(btn_[12]);
		btn.add(btn_[14]);
		btn.add(btn_[0]);
		btn.add(btn_[10]);
		btn.add(btn_[15]);

		box.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = text_input.getCaretPosition();
				text_input.replaceRange("", 0, i);
				int l = text_result.getCaretPosition();
				text_result.replaceRange("", 0, l);
			}
		});

	}

	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String i = e.getActionCommand();
			text_input.append(i);
		}
	}
}

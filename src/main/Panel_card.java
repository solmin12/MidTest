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
// 계산기 카드
		JPanel main = new JPanel();
		main.setLayout(new BorderLayout());
		this.add(main, "main");
		// 이미지 아이콘 사이즈 조정
		ImageIcon img_cal = new ImageIcon("./image/calculator.png");
		Image img_c = img_cal.getImage();
		Image img_c_ = img_c.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		ImageIcon img_cal2 = new ImageIcon(img_c_);
		ImageIcon img_ruler = new ImageIcon("./image/ruler.png");
		Image img_r = img_ruler.getImage();
		Image img_r_ = img_r.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		ImageIcon img_ruler2 = new ImageIcon(img_r_);
		ImageIcon img_the = new ImageIcon("./image/thermometer.png");
		Image img_t = img_the.getImage();
		Image img_t_ = img_t.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		ImageIcon img_the2 = new ImageIcon(img_t_);
		
		JPanel btn = new JPanel();
		main.add(btn, BorderLayout.NORTH);
		
		JButton ruler = new JButton(img_ruler2);
		btn.add(ruler);
		ruler.addActionListener(new ActionListener() {// 버튼 누를 시 Panel_measure로 이동
			@Override
			public void actionPerformed(ActionEvent e) {
				change2();
			}
		});
		ruler.setBackground(new Color(255, 255, 255));
		
		JButton thermometer = new JButton(img_the2);
		btn.add(thermometer);
		thermometer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				change3();
			}
		});
		thermometer.setBackground(new Color(255,255,255));

		Panel_main panel_main = new Panel_main();
		main.add(panel_main, BorderLayout.CENTER);
// 길이 계산기 카드
		JPanel panel_ = new JPanel();
		panel_.setLayout(new BorderLayout());
		this.add(panel_, "measure");
		
		JPanel btn2 = new JPanel();
		panel_.add(btn2, BorderLayout.NORTH);

		JButton calculator = new JButton(img_cal2);
		calculator.addActionListener(new ActionListener() {// 버튼 누를 시 Panel_main으로 이동
			@Override
			public void actionPerformed(ActionEvent e) {
				change();
			}
		});
		calculator.setBackground(new Color(255, 255, 255));
		btn2.add(calculator);
		JButton thermometer2 = new JButton(img_the2);
		btn2.add(thermometer2);
		thermometer2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				change3();
			}
		});
		thermometer2.setBackground(new Color(255,255,255));

		Panel_measure panel_measure = new Panel_measure();
		panel_.add(panel_measure, BorderLayout.CENTER);
// 온도 계산기 카드
		JPanel panel_c = new JPanel();
		panel_c.setLayout(new BorderLayout());
		this.add(panel_c,"thermometer");
		
		JPanel btn3 = new JPanel();
		panel_c.add(btn3, BorderLayout.NORTH);
		
		JButton calculator2 = new JButton(img_cal2);
		calculator2.addActionListener(new ActionListener() {// 버튼 누를 시 Panel_main으로 이동
			@Override
			public void actionPerformed(ActionEvent e) {
				change();
			}
		});
		calculator2.setBackground(new Color(255, 255, 255));
		btn3.add(calculator2);
		JButton ruler2 = new JButton(img_ruler2);
		ruler2.addActionListener(new ActionListener() {// 버튼 누를 시 Panel_measure로 이동
			@Override
			public void actionPerformed(ActionEvent e) {
				change2();
			}
		});
		ruler2.setBackground(new Color(255, 255, 255));
		btn3.add(ruler2);
		
		Panel_thermometer the = new Panel_thermometer();
		panel_c.add(the, BorderLayout.CENTER);
		
	}

	public void change() {
		CardLayout cl = (CardLayout) (this.getLayout());
		cl.show(this, "main");
	}

	public void change2() {
		CardLayout cl = (CardLayout) (this.getLayout());
		cl.show(this, "measure");
	}
	
	public void change3() {
		CardLayout cl = (CardLayout) (this.getLayout());
		cl.show(this, "thermometer");
	}
}

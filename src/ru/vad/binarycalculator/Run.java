package ru.vad.binarycalculator;

import java.awt.Choice;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * This class is responsible for the graphical shell
 * and for run the program
 */

public class Run {

	static JButton button1;
	static JButton button2;
	static JButton forTranslate;
	static JButton forTranslate2;

	public static void main(String[] args) {		

		ImageIcon icon = new ImageIcon("icon/icon.png");

		JFrame frame = new JFrame("Binary Calculator");
		frame.setIconImage(icon.getImage());

		JPanel panel = new JPanel();
		JPanel translate = new JPanel();
		JTextField txt1 = new JTextField(10);
		JLabel label1 = new JLabel("+");
		JTextField txt2 = new JTextField(10);
		JTextField ftr = new JTextField(5);
		JTextField ftr2 = new JTextField(5);
		JTextField result = new JTextField(10);
		Choice cho = new Choice();

		ButtonListener bt = new ButtonListener(label1, cho, result, txt1, txt2,
				translate, ftr, ftr2);

		button1 = new JButton("Result");
		button1.addActionListener(bt);

		button2 = new JButton("Numbe");
		button2.addActionListener(bt);

		forTranslate = new JButton("TranslatBinary");
		forTranslate.addActionListener(bt);

		forTranslate2 = new JButton("TranslatDecimal");
		forTranslate2.addActionListener(bt);

		ftr.setText("1");
		ftr2.setText("0");

		cho.add("+");
		cho.add("-");
		cho.add("*");
		cho.add("/");

		translate.add(ftr);
		translate.add(forTranslate2);
		translate.add(forTranslate);
		translate.add(ftr2);

		panel.add(cho);
		panel.add(button1);
		panel.add(txt1);
		panel.add(label1);
		panel.add(txt2);
		panel.add(button2);
		panel.add(result);

		translate.setBackground(Color.DARK_GRAY);
		panel.setBackground(Color.DARK_GRAY);
		txt1.setBackground(Color.GRAY);
		txt2.setBackground(Color.GRAY);
		result.setBackground(Color.GRAY);
		button1.setBackground(Color.LIGHT_GRAY);
		button2.setBackground(Color.LIGHT_GRAY);
		cho.setBackground(Color.GRAY);

		button1.setBorderPainted(false);
		button2.setBorderPainted(false);

		txt1.setForeground(Color.WHITE);
		txt2.setForeground(Color.WHITE);

		label1.setForeground(Color.WHITE);

		result.setForeground(Color.WHITE);

		cho.setForeground(Color.WHITE);

		frame.add(panel);
		frame.setSize(390, 100);
		frame.setLocation(400, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}

}

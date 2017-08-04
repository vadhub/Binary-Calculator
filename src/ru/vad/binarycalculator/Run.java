package ru.vad.binarycalculator;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		BinaryCalculator bc = new BinaryCalculator();
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel translate = new JPanel();
		JTextField txt1 = new JTextField(10);
		JLabel label1 = new JLabel("+");
		JTextField txt2 = new JTextField(10);	   
		JTextField ftr = new JTextField(5);
		JTextField ftr2 = new JTextField(5);
		JTextField result = new JTextField(10);
		Choice cho = new Choice();
		
		
		ButtonListener bt = new ButtonListener(label1, cho, result, txt1, txt2, panel);
		
		button1 = new JButton("Result");		
		button1.addActionListener(bt);
		
		button2 = new JButton("Numbe");
		button2.addActionListener(bt);
		forTranslate = new JButton("TranslatBinary");
		forTranslate2 = new JButton("TranslatDecimal");

		

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

		forTranslate2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int rez = (int) bc.TranslationBND(ftr.getText());
					ftr2.setText(String.valueOf(rez));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "enter the number!");
				}

			}
		});

		forTranslate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e1) {
				try {
					int a = Integer.parseInt(ftr.getText());
					ftr2.setText(bc.TranslationONS(a));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "enter the number!");
				}

			}
		});		

		panel.add(cho);
		panel.add(button1);
		panel.add(txt1);
		panel.add(label1);
		panel.add(txt2);
		panel.add(button2);
		panel.add(result);

		frame.add(panel);
		frame.setSize(390, 100);
		frame.setLocation(400, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

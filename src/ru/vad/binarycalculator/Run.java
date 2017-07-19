package ru.vad.binarycalculator;

import java.awt.Choice;

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

	public static void main(String[] args) {
		BinaryCalculator bc = new BinaryCalculator();
		
		System.out.println(bc.TranslationONS(5));
		System.out.println(bc.accountAmount(2, 1));
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField txt1 = new JTextField(10);
		JLabel label1 = new JLabel();
		JTextField txt2 = new JTextField(10);
		JButton button1 = new JButton("Ok");
		JTextField result = new JTextField(10);

		Choice cho = new Choice();

		cho.add("+");
		cho.add("-");
		cho.add("*");
		cho.add("/");

		if (cho.getSelectedIndex() == 0) {
			label1.setText("+");
			
		} else if (cho.getSelectedIndex() == 1) {
			label1.setText("-");
			
		} else if (cho.getSelectedIndex() == 1) {
			label1.setText("*");
			
		} else if (cho.getSelectedIndex() == 1) {
			
			label1.setText("/");
		}

		panel.add(txt1);
		panel.add(label1);
		panel.add(txt2);
		panel.add(button1);
		panel.add(result);

		frame.add(panel);
		frame.setSize(400, 100);
		frame.setLocation(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

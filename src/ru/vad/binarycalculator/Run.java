package ru.vad.binarycalculator;

import java.awt.Choice;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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

	public static void main(String[] args) {
		BinaryCalculator bc = new BinaryCalculator();
		
		ImageIcon icon = new ImageIcon("icon/trsform.JPG");

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel translate = new JPanel();
		JTextField txt1 = new JTextField(10);
		JLabel label1 = new JLabel("+");
		JTextField txt2 = new JTextField(10);
		JButton button1 = new JButton("Result");
		JButton button2 = new JButton("Numbe");
		JButton forTranslate = new JButton("Translation");
		JButton trsform= new JButton();
		JTextField ftr = new JTextField(5);
		JTextField ftr2 = new JTextField(5);
		JTextField result = new JTextField(10);
		Choice cho = new Choice();
		
		trsform.setIcon(icon);

		ftr.setText("0");
		ftr2.setText("0");

		cho.add("+");
		cho.add("-");
		cho.add("*");
		cho.add("/");	

		translate.add(trsform);
		translate.add(ftr);
		translate.add(forTranslate);		
		translate.add(ftr2);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a;
				int b;
				a = Integer.parseInt(txt1.getText());
				b = Integer.parseInt(txt2.getText());

				if (cho.getSelectedIndex() == 0) {
					label1.setText("+");
					String rez = bc.SumNumber(a, b);
					result.setText(rez);

				} else if (cho.getSelectedIndex() == 1) {
					label1.setText("-");
					String rez = bc.DifferenceNumber(a, b);
					result.setText(rez);

				} else if (cho.getSelectedIndex() == 2) {
					label1.setText("*");
					String rez = bc.MultipNumber(a, b);
					result.setText(rez);				

				} else if (cho.getSelectedIndex() == 3) {
					label1.setText("/");
					String rez = bc.DividingNumber(a, b);
					result.setText(rez);					
				}

			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, translate, "Translation",JOptionPane.PLAIN_MESSAGE);

			}
		});

		forTranslate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(ftr.getText());
				ftr2.setText(bc.TranslationONS(a));

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

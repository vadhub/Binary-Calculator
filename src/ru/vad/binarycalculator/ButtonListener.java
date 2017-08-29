package ru.vad.binarycalculator;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ButtonListener implements ActionListener {

	BinaryCalculator bc = new BinaryCalculator();
	ConvertLettersToNumbers CLTN = new ConvertLettersToNumbers();
	JLabel label1 = new JLabel();
	Choice cho = new Choice();
	JTextField result = new JTextField();
	JTextField txt1 = new JTextField();
	JTextField txt2 = new JTextField();
	JPanel tr = new JPanel();
	JTextField ftr = new JTextField();
	JTextField ftr2 = new JTextField();

	public ButtonListener(JLabel label1, Choice cho, JTextField result,
			JTextField txt1, JTextField txt2, JPanel tr, JTextField ftr,
			JTextField ftr2) {

		this.label1 = label1;
		this.cho = cho;
		this.result = result;
		this.txt1 = txt1;
		this.txt2 = txt2;
		this.tr = tr;
		this.ftr = ftr;
		this.ftr2 = ftr2;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Run.button1) {

			int a = 0;
			int b = 0;
			try {
				a = Integer.parseInt(txt1.getText());
				b = Integer.parseInt(txt2.getText());
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "enter the number!");
			}

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

		if (e.getSource() == Run.button2) {
			try {				
				JOptionPane.showMessageDialog(null, tr, "Translation",JOptionPane.DEFAULT_OPTION);				
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, ">error<");
			}
		}

		if (e.getSource() == Run.forTranslate) {
			int a = 0;
			try {
				if (ftr.getText().equals(toString())) {
					ftr2.setText(CLTN.convert(ftr.getText()));
				} else {
					a = Integer.parseInt(ftr.getText());
					ftr2.setText(bc.TranslationONS(a));
				}

			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "enter the number!");
				JOptionPane.showMessageDialog(null, e2.getMessage());
			}

		}

		if (e.getSource() == Run.forTranslate2) {
			try {
				int rez = (int) bc.TranslationBND(ftr.getText());
				ftr2.setText(String.valueOf(rez));
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "enter the number!");
			}
		}
	}

}
